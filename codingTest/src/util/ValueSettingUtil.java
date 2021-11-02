package util;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class ValueSettingUtil {

	public static void main(String[] args) {
		String[] params = {"V_NAME","송수희",
				"V_PHONE_MOBILE","",
				"V_IPIN_CI","",
				"V_IPIN_DI",""};
		
		JSONObject json;
		try {
			json = ValueSettingUtil.jsonSetting("REQUEST", params);			
			System.out.println(json.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static JSONObject jsonSetting(String first, String [] params) throws Exception{
		
		
		JSONObject firstJson = new JSONObject();
		
		JSONObject childJson = new JSONObject();
		
		int paramsLenHalf = params.length / 2;
		
		int addCount = 0;
		for(int i=0; i < paramsLenHalf; i++) {
			childJson.put(params[i+addCount], params[i+1+addCount]);
			addCount++;
		}
		
		firstJson.put(first, childJson);
		
		return firstJson;
		
	}
	
}
