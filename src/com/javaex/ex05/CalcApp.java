package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
   		while(true){
   			
   			System.out.print(">>");
   			String num = scan.nextLine();
   			
   			if(num.equals("/q")) {
   				System.out.println("종료합니다.");
   				break;
   			}
   			
   			String calculation = num.substring(2,3);
   			int num1 = Integer.parseInt(num.substring(0, 1));
   			int num2 = Integer.parseInt(num.substring(4));
   			
    		if(calculation.equals("+")) {
       			Add add = new Add();
       			System.out.println(">> " + add.calculate(num1, num2));
       		}else if(calculation.equals("-")) {
       			Sub sub = new Sub();
       			System.out.println(">> " + sub.calculate(num1, num2));
       		}else if(calculation.equals("/")) {
       			Div div = new Div();
       			System.out.println(">> " + div.calculate(num1, num2));
       		}else if(calculation.equals("*")) {
       			Mul mul = new Mul();
       			System.out.println(">> " + mul.calculate(num1, num2));
        	}else {
        		System.out.println("알 수 없는 연산입니다.");
        	}
    		
   		}
   		
    }
}
