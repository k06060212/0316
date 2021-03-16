package com.atworks.jyj;

import java.util.Scanner;

public class Day3Eaxm {
	
	public static void main(String[] args) {
		
		// 예제 1번
		String name = "철수";
		System.out.println("현재이름은 " + name + "입니다.");
		System.out.println("개명을 하시겠습니까?");
		Scanner sc = new Scanner (System.in);
		String yn = sc.next();
		
		if(yn.equals("Y")) {
			System.out.println("어떤이름으로 개명하시겠습니까?");
			String nameUpdate = sc.next();
			name = nameUpdate;
			System.out.println("개명이 완료되었습니다.");
			
		}
		System.out.println("현재 당신의 이름은 '" + name + "' 입니다.");
		
		
		
		/* 문제
		 * 1. 이름과 나이를 입력받을수있는 변수를 생성하세요.
		 * 2. (첫번째 조건은 switch문활용 2번째조건은 if문활용) 이름이 짱구이면서 나이가 20살이결우  
		 * 3.  결과 : 저는 짱구이며 20살이되었어요.
		 * 	 */

		System.out.println("당신의 이름은 무엇입니까?");
		Scanner jjangSc = new Scanner (System.in);
		String jjangName = jjangSc.next();
		
		System.out.println("당신의 나이는 몇살입니까?");
		Scanner jjangSc2 = new Scanner (System.in);
		String jjangAge = jjangSc2.next();
		
		String result = "";
		
		switch (jjangName) {
		case "짱구": {
			if(jjangAge.equals("20")) {
				result = "난 성인이야";
			}else {
				result = "난 미성년자야";
			}
			break;
		}
		default:
			result = "기타";
		}
		
		System.out.println("result : " + result);
		
		
	}
	
}


