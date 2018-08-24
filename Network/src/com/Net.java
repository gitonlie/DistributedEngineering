package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.UUID;

public class Net {
	private final static String FILE_PATH = "C:" + File.separator + "Users"
			+ File.separator + "Administrator" + File.separator + "Desktop"
			+ File.separator + UUID.randomUUID().toString().replace("-", "").toUpperCase()
			+ ".html";
	
	public static void main(String[] args) throws IOException {
		/*URL url = new URL(
				"https://mvnrepository.com/artifact/org.freemarker/freemarker");
		URLConnection connection = url.openConnection();
		InputStream input = connection.getInputStream();
		OutputStream output = new FileOutputStream(FILE_PATH);
		byte[] buffer = new byte[1024*1024];
		int byteNumer;
		while((byteNumer=input.read(buffer))!=-1){
			output.write(buffer,0,byteNumer);
		}
	
		output.flush();
		output.close();*/
		
		byte y = 1;
		System.out.println(Byte.SIZE);
	}
}
