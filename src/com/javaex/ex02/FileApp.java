package com.javaex.ex02;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {

		try {
			fileRead();
		} catch (Exception e) {
			System.out.println("파일이 없습니다.");
		}

	}

	public static void fileRead() throws IOException{
		throw new IOException(); 
	}
}


