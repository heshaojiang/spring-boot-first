package com.example.demo;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			System.out.println("输出："+s.nextLine());
		}
	}
}
