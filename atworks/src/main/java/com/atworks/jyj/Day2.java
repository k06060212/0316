package com.atworks.jyj;

import java.util.Scanner;

public class Day2 {
	
	
	Day2 day2 = new Day2();
	
	
	
	
	public static void main(String[] args) {
		System.out.println("아이템을 버리시겠습니까? 버릴거면 Y, 취소할거면 N을 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		String yn = sc.next(); 
		
		// Y일경우 케이스1번 실행시키고 N일경우 케이스2번실행시키고 1,2번도 둘다아닐경우 
		// switch 방식
		switch (yn) {
			case "Y":
				System.out.println("Y를 입력하여 팩을 얻었습니다.");
				break;
				
			case "N" :
				System.out.println("N를 입력하여 아무 결과도 못얻었습니다.");
				break;
				
			default:
				System.out.println("Y또는 N만 입력해주세요.");
				break;
		}
		
		// if, else if, else 방식
		if(yn.equals("Y")) {
			System.out.println("Y를 입력하여 팩을 얻었습니다.");
		}else if(yn.equals("N")) {
			System.out.println("N를 입력하여 아무 결과도 못얻었습니다.");
		}else {
			System.out.println("Y또는 N만 입력해주세요.");
		}
		
		
		/* 문제
		 * 1. String형의 name 변수를 만든다. (어떤 값을 넣어도 상관없음)
		 * 2. int형의 age 변수를 만든다. (어떤 값을 넣어도 상관없음)
		 * 3. Scanner를 생성하여 sc와 sc2 변수에담으세요.
		 * 4. System.out.....ln의 메소드로 "안녕하세요 저는 sc이며, sc2살입니다" 를 만드세요.
		 * 5. switch 조건을 사용하여 sc의 값이 "홍길동" 일경우 sysout으로 "홍길동 나왔다"를 출력하고, "정예지"를 입력하면 "야호"를 출력하세요 그리고 두개의조건이 아닐경우 "..."를 출력하세요.
		 * 6. if 조건을 사용하여 5번과 동일하게 출력하세요. 
		*/
		
		
		
		
	}	
}