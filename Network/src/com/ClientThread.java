package com;

import java.util.concurrent.Callable;

public class ClientThread implements Callable<String> {

	private Client client;
	private int no;
	public ClientThread(int no,Client client){
		this.client=client;
		this.no = no;
	}
		
	@Override
	public String call() throws Exception {
		System.out.println("客户端["+no+"]请求服务器~");
		String respose = client.request();
		return respose;
	}

}
