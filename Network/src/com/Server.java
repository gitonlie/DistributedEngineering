package com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
	
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
			PrintStream ps = new PrintStream(os);
			ps.print(HTTP.Server+":连接成功!"+UUID.randomUUID().toString());
			ps.close();
			os.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(HTTP.PORT);
		initServer(HTTP.PORT);
	}
}
