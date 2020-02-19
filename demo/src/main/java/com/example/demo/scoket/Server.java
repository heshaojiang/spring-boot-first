package com.example.demo.scoket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class Server {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ServerSocket s = new ServerSocket(9999);
		while(true) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.accept().getInputStream()));
			System.out.println(reader.readLine());
		}
	}
}
