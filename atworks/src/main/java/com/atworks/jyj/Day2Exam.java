package com.atworks.jyj;

import java.util.Scanner;

public class Day2Exam {
	public static void main(String[] args) {
		/* 문제
		 * 1. Scanner객체를 생성하여 sc와 sc2 변수에 담고 sc변수를 scSt로 변수생성을 생성후 next함수를 이용하여 담으세요. sc2변수는 scInt로 변수생성을 생성후 next함수를 이용하여 담으세요.
		 * 2. System.out.....ln의 메소드로 "안녕하세요 저는 scSt이며, scInt살입니다" 를 만드세요.
		 * 3. switch 조건을 사용하여 scSt의 값이 "홍길동" 일경우 sysout으로 "홍길동 나왔다"를 출력하고, "정예지"를 입력하면 "야호"를 출력하세요 그리고 두개의조건이 아닐경우 "..."를 출력하세요.
		 * 4. if 조건을 사용하여 5번과 동일하게 출력하세요. 
		 */
		
		System.out.println("시작");
		
		Scanner sc= new Scanner (System.in);
		Scanner sc2= new Scanner (System.in);
		
		
		System.out.println("이름을 입력하세요.");
		String scSt = sc.next();
		System.out.println("나이를 입력하세요.");
		String scInt = sc2.next();
		
		// 첫번째 방법
		System.out.print("안녕하세요 저는 ");
		System.out.print(scSt);
		System.out.print("이며, ");
		System.out.print(scInt);
		System.out.println("살 입니다");
					
		// 두번째 방법
		System.out.println("안녕하세요 저는 " + scSt + "이며, " + scInt + "살 입니다");
		
		switch (scSt) {
			case "홍길동": 
				System.out.println("홍길동 나왔다");
			break;
			
			case "정예지" : 
				System.out.println("야호");
			break;
			
			default:
				System.out.println("...");
			break;
		}
		
		

		
		if(scSt.equals("홍길동") ) {
			System.out.println("홍길동 나왔다");
		} else if(scSt.equals("정예지")) {
			System.out.println("야호");
		} else {
			System.out.println("...");
		}
		
		{
		}
	}
		
}
	