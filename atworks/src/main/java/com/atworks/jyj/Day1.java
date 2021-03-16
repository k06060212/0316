package com.atworks.jyj;

import java.util.Scanner;
public class Day1 {
	
	public static void main(String[] args) {
		
		

		String name = "홍길동";
		int age = 100;

		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("이름이 뭐에여?");
		
		String nameCopy = sc.next();
		
		System.out.println("나이는 몇살이에여?");
		
		String ageCopySt = sc.next();
		
		
		int ageCopyInt = Integer.parseInt(ageCopySt);
		
		
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("이름은 " + name + "이고 나이는 " + age + "살 입니다.");
		System.out.println("이름은 " + nameCopy + "이고 나이는 " + ageCopySt + "살 입니다.");
		System.out.println("최종적으로 나이는(인트형) " + ageCopyInt + "입니다.");
	
		
		
		
		
		
		
	}
	
	
}
   