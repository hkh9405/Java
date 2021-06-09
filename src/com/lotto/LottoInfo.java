package com.lotto;

import java.util.Scanner;

public class LottoInfo {

	Scanner sc=new Scanner(System.in);
	
	public void info() {
		
		System.out.println("\n\n		$$ 복권 프로그램 사용설명서 $$\n\n\n");
		
		System.out.println("		※ 복권 구매방법\n");
		
		System.out.println("		  1) 시작 메뉴에서 숫자 “2”(복권 구매)를 입력합니다\n");
		
		System.out.println("		  2) 자신이 현재 위치한 판매소를 선택합니다\n" + 
				"			  2-1. 34개소 중 복권을 구매하는 판매소의 번호를 입력합니다\n" + 
				"			  2-2. 위치를 다시 입력하려면 “1”을 다음 단계로 넘어가고 싶으면 “2”를 입력합니다\n");
		
		System.out.println("		  3) 복권번호 선택방법을 선택하여 선택한 방법에 따라 번호를 입력합니다\n"
				+ "			  자동 선택 시) 자동으로 번호를 선택합니다\n"
				+ "			  반자동 선택 시) 입력하고 싶은 번호의 개수를 입력 후 그 개수만큼 번호를 입력하면 나머지 숫자는 자동으로 선택됩니다\n"
				+ "			  수동 선택 시) 입력하고 싶은 번호 4개를 입력합니다\n");
		
		System.out.println("		  4) 구매하고 싶은 수량만큼 번호 선택을 반복하여 실행하고 숫자 “4”(출력)를 입력합니다\n");
		
		System.out.println("		  5) 영수증을 확인 후 당첨번호를 바로 확인하고 싶으면 숫자 “1”(당첨번호 확인)을 홈 화면로 돌아가고 싶으면“2”(홈으로)을 입력합니다\n");
		
		
		System.out.println("		※ 당첨번호 확인방법\n");
		
		System.out.println("		  1) 시작 메뉴에서 숫자 “3”(당첨번호 확인)을 입력합니다\n");
		
		System.out.println("		  2) 화면에서 출력되는 번호를 확인 후 숫자 “1”(홈으로)을 입력하여 홈 화면으로 돌아갑니다\n");
		
		
		System.out.println("		※ 회차별 복권 당첨정보 확인방법\n");
			
		System.out.println("		  1) 확인하고 싶은 회차의 숫자를 입력합니다\n");
		
		System.out.println("		  2) 다른 회차의 정보를 계속 확인하고 싶다면 숫자 “1”(다시)을 입력하고 확인하고 싶은 회차의 숫자를 입력합니다\n");
		
		System.out.println("		  3) 홈 화면으로 돌아가고 싶으면 숫자 “2”(홈으로)를 입력합니다\n\n");
		
		System.out.print("		------------------------------------------------ㅣ	홈 화면으로 돌아가려면 H키를 입력하세요	ㅣ------------------------------------------------");
				
		System.out.println();
	}
	
}
