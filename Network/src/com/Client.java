package com;

import http.HTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	
	public String request(){
		Socket socket = null;
		InputStream is = null;
		BufferedReader br = null;
		StringBuffer bs = null;
		try {
			socket = new Socket(HTTP.HOST, HTTP.PORT);
			is = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			bs = new StringBuffer();
			String line =null;
			while((line=br.readLine())!=null){
				bs.append(line);
			}
			br.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bs.toString();
	}
}
