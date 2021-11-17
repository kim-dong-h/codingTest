package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class HttpConnectUtil {

	private static String devIp = "";
	
	private static String localIp = "http://127.0.0.1";
	
	private static Map<String, String> uriMap = new HashMap<String, String>();
	private static Map<String, String> paramMap = new HashMap<String, String>();
	
	public HttpConnectUtil() {
		
	}
	
	
	public static String compareData(String searchKey) {
				
		String resultData = "";
		
		HttpConnectUtil util = new HttpConnectUtil();
		
		String newUrlHost = localIp + uriMap.get(searchKey);
		String oldUrlHost = devIp + uriMap.get(searchKey);
		
		
		
		String paramJson = paramMap.get(searchKey);
		
		try {
			
			JSONObject newProjectJson =  util.httpConnectToJson(newUrlHost, paramJson, false);
			
			Map<String, Object> newMap = new HashMap<String, Object>();
			
			
			if(newProjectJson.get("RESPONSE_DATA") instanceof JSONObject){
				newMap = ((JSONObject) newProjectJson.get("RESPONSE_DATA")).toMap();
			}else {
				
				JSONArray newJsonArray = (JSONArray) newProjectJson.get("RESPONSE_DATA");
				newMap = newJsonArray.getJSONObject(0).toMap();
			}
			
			JSONObject oldProjectJson =  util.httpConnectToJson(oldUrlHost, paramJson, true);
			
			Map<String, Object> oldMap = new HashMap<String, Object>();
			if(oldProjectJson.get("RESPONSE_DATA") instanceof JSONObject) {
				oldMap = ((JSONObject)oldProjectJson.get("RESPONSE_DATA")).toMap();
			}else {
				JSONArray oldJsonArray = (JSONArray) oldProjectJson.get("RESPONSE_DATA");
				oldMap = oldJsonArray.getJSONObject(0).toMap();				
			}
			
			
			String failCompare = "";
			
			int keyCnt = 0;
			int valueCnt = 0;
			
			resultData += "OLD    /    NEW \n";
			for(Map.Entry<String, Object> map : newMap.entrySet()) {
				String newKey = map.getKey();
				String newValue = String.valueOf(map.getValue());
				for(Map.Entry<String, Object> map2 : oldMap.entrySet()) {
					String upperKey = map2.getKey().toUpperCase();
					String oldValue = String.valueOf(map2.getValue());
					if(newKey.equals(upperKey)) {
						resultData += upperKey + " / " +newKey +"\n";
						resultData += oldValue + " / " +newValue +"\n";
//						System.out.println(upperKey + " / " +newKey);
//						System.out.println(oldValue + " / " +newValue);
						keyCnt++;
						if(!newValue.equals("null") && !oldValue.equals("null")) {
							if(newValue.equals(oldValue)) {
								valueCnt++;
//								System.out.println("OK");
								resultData += "OK \n";
							}else {
								failCompare += newKey + " / ";
//								System.out.println("NO");
								resultData += "NO \n";

							}
						}
//						System.out.println("------------------");
						resultData += "------------------------ \n";
						break;
					}
				}
			}
			
			FileUploadUtil fileUtil = new FileUploadUtil();
			
			resultData += "key Count = "+keyCnt + " / value Count = "+ valueCnt +" \n";
			resultData += "fail Value = " + failCompare + " \n";
//			System.out.println("key Count = "+keyCnt + " / value Count = "+ valueCnt);
//			System.out.println("fail Value = " + failCompare);
			
			String textValue = "CRM-IF-"+ searchKey +" = 데이터 틀림  "+ failCompare;
			
			fileUtil.FileUpload(textValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultData;
		
	}
	
	
	public JSONObject httpConnectToJson(String urlHost, String jsonString, boolean check) throws Exception{
		
		JSONObject returnJson = null;
		
		String urlAddr = urlHost;
		
		String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:64.0) Gecko/20100101 Firefox/64.0";
		
		URL url = null;
		
		HttpURLConnection conn = null;
		
		String jsonData = "";
		
		BufferedReader br = null;
		
		StringBuffer sb = null;
		
		JSONObject jsonObject = new JSONObject(jsonString);
		
		try {
			url = new URL(urlAddr);
			
			conn = (HttpURLConnection) url.openConnection();

			// headers 값 세팅 
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Accept", "*/*");
			conn.setRequestProperty("User-Agent", userAgent);
			conn.setRequestMethod("POST");
			
			// 서버로 json param 보내기 
			conn.setDoOutput(true);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
			bw.write(jsonObject.toString());
			bw.flush();
			bw.close();
			
			// 서버에서 주는 데이터 읽기 
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			sb = new StringBuffer();
			if(br != null) {
				while((jsonData = br.readLine()) != null) {
					jsonData = jsonData.replace("\\", "");
					sb.append(jsonData);
					if(check) {
						sb.replace(0, 1, "");
						sb.replace(sb.length()-1, sb.length(), "");						
					}
				}
			}
			
			returnJson = new JSONObject(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.disconnect();
			if(br != null) {
				br.close();				
			}
		}
		
		return returnJson;
		
	}
	
}
