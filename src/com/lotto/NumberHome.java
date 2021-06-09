package com.lotto;

import java.util.Calendar;

public class NumberHome {
	
	FileCheck fc = new FileCheck();
	
	private String[] pa = {"□","□","□","□","□"};
	private String[] ps = {"□","□","□","□","□"};
	private String[] pm = {"□","□","□","□","□"};
	
	public String[] getPa() {
		return pa;
	}
	public void setPa(String[] pa) {
		this.pa = pa;
	}
	public String[] getPs() {
		return ps;
	}
	public void setPs(String[] ps) {
		this.ps = ps;
	}
	public String[] getPm() {
		return pm;
	}
	public void setPm(String[] pm) {
		this.pm = pm;
	}
	
	public void home() {
		
		String[] stra = pa;	
		String[] strs = ps;	
		String[] strm = pm;			
		
		System.out.println("\n\n		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ-");	
		System.out.println("		ㅣ                           ┃                          ┃                          ┃                          ┃                            ㅣ");
		System.out.println("		ㅣ        $$$$$$\\            ┃        $$$$$$$\\          ┃         $$$$$$\\          ┃        $$$$$$$\\          ┃         $$$$$$$$\\          ㅣ");
		System.out.println("		ㅣ        $$  __$$\\          ┃        $$  __$$\\         ┃        $$  __$$\\         ┃        $$  __$$\\         ┃         $$  _____|         ㅣ");
		System.out.println("		ㅣ        $$ /  $$ |         ┃        $$ |  $$ |        ┃        $$ /  \\__|        ┃        $$ |  $$ |        ┃         $$ |               ㅣ");
		System.out.println("		ㅣ        $$$$$$$$ |         ┃        $$$$$$$\\ |        ┃        $$ |              ┃        $$ |  $$ |        ┃         $$$$$\\             ㅣ");
		System.out.println("		ㅣ        $$  __$$ |         ┃        $$  __$$\\         ┃        $$ |              ┃        $$ |  $$ |        ┃         $$  __|            ㅣ");
		System.out.println("		ㅣ        $$ |  $$ |         ┃        $$ |  $$ |        ┃        $$ |  $$\\         ┃        $$ |  $$ |        ┃         $$ |               ㅣ");
		System.out.println("		ㅣ        $$ |  $$ |         ┃        $$$$$$$  |        ┃        \\$$$$$$  |        ┃        $$$$$$$  |        ┃         $$$$$$$$\\          ㅣ");
		System.out.println("		ㅣ    	  \\__|  \\__|         ┃        \\_______/         ┃         \\______/         ┃        \\_______/         ┃         \\________|         ㅣ");
		System.out.println("		ㅣ                           ┃                          ┃                          ┃                          ┃                            ㅣ");
		System.out.println("		ㅣ  [1 ] [2 ] [3 ] [4 ] [5 ] ┃ [1 ] [2 ] [3 ] [4 ] [5 ] ┃ [1 ] [2 ] [3 ] [4 ] [5 ] ┃ [1 ] [2 ] [3 ] [4 ] [5 ] ┃ [1 ] [2 ] [3 ] [4 ] [5 ]   ㅣ");
		System.out.println("		ㅣ  [6 ] [7 ] [8 ] [9 ] [10] ┃ [6 ] [7 ] [8 ] [9 ] [10] ┃ [6 ] [7 ] [8 ] [9 ] [10] ┃ [6 ] [7 ] [8 ] [9 ] [10] ┃ [6 ] [7 ] [8 ] [9 ] [10]   ㅣ");
		System.out.println("		ㅣ  [11] [12] [13] [14] [15] ┃ [11] [12] [13] [14] [15] ┃ [11] [12] [13] [14] [15] ┃ [11] [12] [13] [14] [15] ┃ [11] [12] [13] [14] [15]   ㅣ");
		System.out.println("		ㅣ  [16] [17] [18] [19] [20] ┃ [16] [17] [18] [19] [20] ┃ [16] [17] [18] [19] [20] ┃ [16] [17] [18] [19] [20] ┃ [16] [17] [18] [19] [20]   ㅣ");
		System.out.println("		ㅣ  [21] [22] [23] [24] [25] ┃ [21] [22] [23] [24] [25] ┃ [21] [22] [23] [24] [25] ┃ [21] [22] [23] [24] [25] ┃ [21] [22] [23] [24] [25]   ㅣ");
		System.out.println("		ㅣ  [26] [27] [28] [29] [30] ┃ [26] [27] [28] [29] [30] ┃ [26] [27] [28] [29] [30] ┃ [26] [27] [28] [29] [30] ┃ [26] [27] [28] [29] [30]   ㅣ");
		System.out.println("		ㅣ                           ┃                          ┃                          ┃                          ┃                            ㅣ");
		System.out.printf("		ㅣ                 자동 [%s] ┃                자동 [%s] ┃                자동 [%s] ┃                자동 [%s] ┃                자동 [%s]   ㅣ\n",stra[0],stra[1],stra[2],stra[3],stra[4]);
		System.out.printf("		ㅣ               반자동 [%s] ┃              반자동 [%s] ┃              반자동 [%s] ┃              반자동 [%s] ┃              반자동 [%s]   ㅣ\n",strs[0],strs[1],strs[2],strs[3],strs[4]);
		System.out.printf("		ㅣ                 수동 [%s] ┃                수동 [%s] ┃                수동 [%s] ┃                수동 [%s] ┃                수동 [%s]   ㅣ\n",strm[0],strm[1],strm[2],strm[3],strm[4]);				
		System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ-");
	
	}

	public void info() {
		
		Calendar now=Calendar.getInstance();

		int y,n,m,week;
		y=now.get(Calendar.YEAR);
		m=now.get(Calendar.MONTH);
		week=now.get(Calendar.WEEK_OF_MONTH);
		n = fc.count();
		System.out.println("\n										"+y+"년"+(m+1)+"월"+week+"주차");
		
		System.out.println("\n										제"+(n+1)+"회차 복권");

		System.out.println("\n\n		------------------------------------------------ㅣ	   	     복권 구매  		ㅣ------------------------------------------------");
	
	}
	
	public void menu() {
		
		System.out.println("\n\n				1. 자동					 	 2. 반자동 & 수동					3. 구매 목록");
		System.out.println("\n\n				4. 삭제						 5. 로또 영수증 출력				        6. Home");
		System.out.println("\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
	}	
}
