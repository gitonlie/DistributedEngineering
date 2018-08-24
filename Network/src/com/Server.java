package com;

import http.HTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	/**
	 * 初始化服务端
	 * @param port
	 */
	public static void initServer(int port){
		ServerSocket serverSocket = null;
		Socket socket =null;
		OutputStream os = null;
		InputStream is = null;
		try {
			
			serverSocket = new ServerSocket(port);
			socket =  serverSocket.accept();
			os = socket.getOutputStream();
			is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);//反序列化
			//反序列化
			ObjectOutputStream oos = new ObjectOutputStream(os);
			//序列化
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param is
	 * @throws IOException
	 */
	public static void HandleStream(InputStream is) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		StringBuffer sb = new StringBuffer();
		String Line = null;
		while((Line=br.readLine())!=null){
			sb.append(Line);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(HTTP.Server+":开启监听端口"+HTTP.PORT);
		initServer(HTTP.PORT);
	}
}
