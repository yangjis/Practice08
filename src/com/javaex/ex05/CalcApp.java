package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	String num;
    	int num1, num2;
    	String[] numArray;
    	
   		while(true){
   			
   			System.out.print(">>");
   			num = scan.nextLine();
   			
   			if(num.equals("/q")) {
   				System.out.println("종료합니다.");
   				break;
   			}
   			numArray = num.split(" ");
   			num1 = Integer.parseInt(numArray[0]);
   			num2 = Integer.parseInt(numArray[2]);
   			
   			switch(numArray[1]) {
   				case "+":
   					Add add = new Add();
   					System.out.println(">> " + add.calculate(num1, num2));
   					break;
   				case "-":
   					Sub sub = new Sub();
   					System.out.println(">> " + sub.calculate(num1, num2));
   					break;
   				case "/":
   					Div div = new Div();
   					System.out.println(">> " + div.calculate(num1, num2));
   					break;
   				case "*":
   					Mul mul = new Mul();
   					System.out.println(">> " + mul.calculate(num1, num2));
   					break;
   				default:
   					System.out.println("알 수 없는 연산입니다.");
   					break;
   			}
   		}
    }
}
