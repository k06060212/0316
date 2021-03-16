package com.atworks.jyj;

import java.util.Arrays;
import java.util.Scanner;

// 메소드 이용방법
public class Day5 {
	
	// 메인 메소드는 다른 메소드들과 약간 다르게 호출해야함 ex ) new Day5().atworksTest(); 이런식
	public static void main(String[] args) {
		System.out.println("시작");
		
		
//		new Day5().atworksTest();
		new Day5().forAndwhile();
		
		System.out.println("끝");
	}
	
	
	// 일반적인 메소드는 new를해서 객체생성을 하는게아니라 바로 메소드명만작성하면 사용할수있음
	public  void atworksTest() {
		testMethod();
		examPle();
	}

	
	public  void testMethod() {
		/* 문제 1번
		 * 현재 name 이라는 변수안에 "철수"라고 저장이 되어있고 안내메세지를 name변수로 "현재이름은 name입니다. 개명을 하시겠습니까?" 라고 안내메세지를 출력하세요.
		 * 철수는 개명을할지말지 고민중에있다. 사용자의 입력값에 따라 개명이 될수도있고 안될수도있다. (Y를누르면 개명신청, 그외 다른값을 누르면 개명취소)
		 * Y를 누를경우 안내메세지로 "어떤이름으로 개명하시겠습니까?" 라고 출력후 입력된값을 받고 마무리멘트로 "개명이 완료되었습니다." 라고 안내메세지를 출력하세요. 
		 * 결과는 "현재 당신의 이름은 'name' 입니다. " 라고 출력을 하세요.
		 * */
		
		String name = "철수";
		System.out.println("현재이름은"+name+ "입니다");
		System.out.println("개명을 하시겠습니까");
		Scanner sc = new Scanner (System.in);
		String yn = sc.next();
		
		if (yn.equals("Y")) {
			System.out.println("어떤이름으로 개명하시겠습니끼");
			String nameupdate= sc.next();
			name = nameupdate;
			System.out.println("개명이 완료되었습니다");
		}
		
		System.out.println("당신의 이름은" +name+"입니다");
		
		
		/* 문제 2번
		 * 1. 이름과 나이를 입력받을수있는 변수를 생성하세요. (변수를 생성하기전 안내메세지도 같이 출력해주세요 ex:당신의 이름은?... 당신의나이는..?)
		 * 2. (첫번째 조건은 switch문활용 2번째조건은 if문활용) (switch)이름이 짱구이면서 (if)나이가 20살이결우 result 변수에 "성인" 20살이 아닐경우 "미성년자" 를 저장하세요. 둘다 아니라면 "기타"로 저장시키세요
		 * 3. "결과 : result값"
		 * 	 */
		
		System.out.println("이름이 무엇입니까?");
		Scanner jjangsc =new Scanner(System.in);
		String jjangname = jjangsc.next();
		
		System.out.println("나이가 몇살입니까");
		Scanner jjangsc2 = new Scanner(System.in);
		String jjangage = jjangsc2.next();
		
		
		String result ="";
		
			
		switch (jjangname) {
		case "짱구": 
			if (jjangage.equals("20")) {
				result= "성인입니다";
			}
			
			else { 
				result= "미성년자 입니다";
				
			}
			break;
		
		default: 
			result = "기타";
			break;
		}
		
		System.out.println("result : " + result );

	}
	
	public  void examPle() {
		System.out.println("나다 ㅋ");
	}
	
	
	public void testLotto() {
		
//		double dValue =   Math.random() * 10;
//		int dValue4 = (int)dValue;
//		System.out.println("dValue : " + dValue4);
		
		double dValue2 =   Math.random();
		int dValue3 = (int)(dValue2 * 3) + 1 ;
		System.out.println("dValue : " + dValue3);
		
		
		
		
		
		
	}
	
	
	public double random() {
		return 0;
		
	}
	
	// 반복문 for, while, do while
	public void forAndwhile() {
		System.out.println("반복문 시작.");
		
		int lotto[] = new int [6];
		
 	  	// 번호 생성
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
		}
		
		
		System.out.print("로또 번호: ");
		
		
		System.out.println("결과 : " + Arrays.toString(lotto));
		
		
		 // 번호 출력
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}	
		System.out.println("");
		
		
		
		
		
		
//		for(int i=1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		int i = 0;
//		
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		} 	
	}
}
