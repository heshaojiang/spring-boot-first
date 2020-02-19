package com.example.demo.scoket;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1", 9999);
		PrintWriter writer = new PrintWriter(s.getOutputStream());
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			
			String msg = in.nextLine();
			System.out.println("写入消息："+msg);
			writer.write(msg);
			writer.flush();
			writer.close();
		}
		
	}
}
