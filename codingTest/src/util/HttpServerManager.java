package util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServerManager {

	public static void main(String[] args) {
		try {
			serverStart();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void serverStart() throws Exception{
		
		ServerSocket listener = new ServerSocket(9000);
		try {
			while(true) {
				Socket socket = listener.accept();
				try {
					String resultData = "";
					InputStream input = socket.getInputStream();
					BufferedReader reader = new BufferedReader(new InputStreamReader(input));
					
					String uri = reader.readLine();
					
					if(!uri.contains("favicon")) {
						int startCount = uri.indexOf("GET");
						int endCount = uri.indexOf("HTTP");
						String searchKey = uri.substring(startCount+5, endCount);
						searchKey = searchKey.trim();
						System.out.println(searchKey);
						resultData = HttpConnectUtil.compareData(searchKey);
					}
					
					OutputStream os = socket.getOutputStream();
					DataOutputStream dos = new DataOutputStream(os);
					byte[] body = resultData.getBytes();
					
					dos.writeBytes("HTTP/1.1 200 OK \r\n");
					dos.writeBytes("Content-Type: application/json\r\n");
					dos.writeBytes("Content-Length: " + body.length + "\r\n");
					dos.writeBytes("\r\n");
					
					dos.write(body, 0, body.length);
					dos.writeBytes("\r\n");
					
					dos.flush();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					socket.close();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}finally {
			listener.close();
		}
		
	}
}
