package com;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Center {
	
	public static void main(String[] args) throws Exception{
		/*ExecutorService service = Executors.newCachedThreadPool();
		int num = 10;
		List<Future<String>> list = new ArrayList<Future<String>>();
		for(int i=0;i<num;i++){
			Future<String>  future = service.submit(new ClientThread(i,new Client()));
			list.add(future);
		}
		service.shutdown();
		for(Future<String> future:list){
			System.out.println(future.get().toString());
		}*/
		Client client = new Client();
		String s = client.request();
		System.out.println(s);
	}
}
