package com.lotto;

import java.util.Scanner;

public class NumberMenu {
	//public static void main(String[] args) {
	public void numMenu() {

		Scanner sc = new Scanner(System.in);		
		Number nn = new Number();		
		NumberHome nh = new NumberHome();		
		LottoHome h = new LottoHome();
		LottoWin lw = new LottoWin();
		LottoWinInfo lwi = new LottoWinInfo();
		
		String str;

		int n = 0;
		while(true) {
			nh.home();		
			nh.info();			
			nh.menu();
			
			try {				
				do {					
					switch(sc.nextInt()) {
					case 1:							
						nn.autoNum(); break;
					case 2:								
						nn.semiManuNum(); break;					
					case 3:							
						nn.count(); break;
					case 4:						
						nn.delete(); break;	
					case 5:	{						
						nn.print();
						nn.writeFile();
						while(true) {
							
							str=sc.next();
							System.out.println();

							if(str.equals("h")) {
								return;
							} else if (str.equals("c")) {
								
							} else if (str.equals("r")) {								
								break;
							}							
						}
						if(str.equals("h")) {
							break;	
						}
						if(str.equals("r")) {
							break;	
						}
					}		
					if(str.equals("h")) {
						break;	
					}
					case 6:	{					
						h.menu(); break;
					}
					
					}
				}while(n<1 || n>6);
				
			} catch (Exception e) {
				sc.next();
				System.out.println("숫자만 입력 가능");
				System.out.println();
			}			
		}
	}
}
