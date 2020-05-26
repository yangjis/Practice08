package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Friend[] friend = new Friend[3];
		
		System.out.println("친구를 3명 등록해 주세요.");
		for(int i = 0 ; i < 3; i++) {
			String f01 = scan.nextLine();
			friend[i] = new Friend(f01.substring(0, 3), f01.substring(4, 17), f01.substring(18));
			
		}
		
		for(int i = 0; i < 3; i++) {
			friend[i].info();
		}
	}
}
