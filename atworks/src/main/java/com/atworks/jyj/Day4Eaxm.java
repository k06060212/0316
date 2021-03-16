package com.atworks.jyj;

import java.util.Scanner;

public class Day4Eaxm {
	
	public static void main(String[] args) {
		
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
	}
		
		
		