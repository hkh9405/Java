package com.lotto;

import java.util.Calendar;

public class NumberHome {
	
	FileCheck fc = new FileCheck();
	
	private String[] pa = {"��","��","��","��","��"};
	private String[] ps = {"��","��","��","��","��"};
	private String[] pm = {"��","��","��","��","��"};
	
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
		
		System.out.println("\n\n		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�-");	
		System.out.println("		��                           ��                          ��                          ��                          ��                            ��");
		System.out.println("		��        $$$$$$\\            ��        $$$$$$$\\          ��         $$$$$$\\          ��        $$$$$$$\\          ��         $$$$$$$$\\          ��");
		System.out.println("		��        $$  __$$\\          ��        $$  __$$\\         ��        $$  __$$\\         ��        $$  __$$\\         ��         $$  _____|         ��");
		System.out.println("		��        $$ /  $$ |         ��        $$ |  $$ |        ��        $$ /  \\__|        ��        $$ |  $$ |        ��         $$ |               ��");
		System.out.println("		��        $$$$$$$$ |         ��        $$$$$$$\\ |        ��        $$ |              ��        $$ |  $$ |        ��         $$$$$\\             ��");
		System.out.println("		��        $$  __$$ |         ��        $$  __$$\\         ��        $$ |              ��        $$ |  $$ |        ��         $$  __|            ��");
		System.out.println("		��        $$ |  $$ |         ��        $$ |  $$ |        ��        $$ |  $$\\         ��        $$ |  $$ |        ��         $$ |               ��");
		System.out.println("		��        $$ |  $$ |         ��        $$$$$$$  |        ��        \\$$$$$$  |        ��        $$$$$$$  |        ��         $$$$$$$$\\          ��");
		System.out.println("		��    	  \\__|  \\__|         ��        \\_______/         ��         \\______/         ��        \\_______/         ��         \\________|         ��");
		System.out.println("		��                           ��                          ��                          ��                          ��                            ��");
		System.out.println("		��  [1 ] [2 ] [3 ] [4 ] [5 ] �� [1 ] [2 ] [3 ] [4 ] [5 ] �� [1 ] [2 ] [3 ] [4 ] [5 ] �� [1 ] [2 ] [3 ] [4 ] [5 ] �� [1 ] [2 ] [3 ] [4 ] [5 ]   ��");
		System.out.println("		��  [6 ] [7 ] [8 ] [9 ] [10] �� [6 ] [7 ] [8 ] [9 ] [10] �� [6 ] [7 ] [8 ] [9 ] [10] �� [6 ] [7 ] [8 ] [9 ] [10] �� [6 ] [7 ] [8 ] [9 ] [10]   ��");
		System.out.println("		��  [11] [12] [13] [14] [15] �� [11] [12] [13] [14] [15] �� [11] [12] [13] [14] [15] �� [11] [12] [13] [14] [15] �� [11] [12] [13] [14] [15]   ��");
		System.out.println("		��  [16] [17] [18] [19] [20] �� [16] [17] [18] [19] [20] �� [16] [17] [18] [19] [20] �� [16] [17] [18] [19] [20] �� [16] [17] [18] [19] [20]   ��");
		System.out.println("		��  [21] [22] [23] [24] [25] �� [21] [22] [23] [24] [25] �� [21] [22] [23] [24] [25] �� [21] [22] [23] [24] [25] �� [21] [22] [23] [24] [25]   ��");
		System.out.println("		��  [26] [27] [28] [29] [30] �� [26] [27] [28] [29] [30] �� [26] [27] [28] [29] [30] �� [26] [27] [28] [29] [30] �� [26] [27] [28] [29] [30]   ��");
		System.out.println("		��                           ��                          ��                          ��                          ��                            ��");
		System.out.printf("		��                 �ڵ� [%s] ��                �ڵ� [%s] ��                �ڵ� [%s] ��                �ڵ� [%s] ��                �ڵ� [%s]   ��\n",stra[0],stra[1],stra[2],stra[3],stra[4]);
		System.out.printf("		��               ���ڵ� [%s] ��              ���ڵ� [%s] ��              ���ڵ� [%s] ��              ���ڵ� [%s] ��              ���ڵ� [%s]   ��\n",strs[0],strs[1],strs[2],strs[3],strs[4]);
		System.out.printf("		��                 ���� [%s] ��                ���� [%s] ��                ���� [%s] ��                ���� [%s] ��                ���� [%s]   ��\n",strm[0],strm[1],strm[2],strm[3],strm[4]);				
		System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�-");
	
	}

	public void info() {
		
		Calendar now=Calendar.getInstance();

		int y,n,m,week;
		y=now.get(Calendar.YEAR);
		m=now.get(Calendar.MONTH);
		week=now.get(Calendar.WEEK_OF_MONTH);
		n = fc.count();
		System.out.println("\n										"+y+"��"+(m+1)+"��"+week+"����");
		
		System.out.println("\n										��"+(n+1)+"ȸ�� ����");

		System.out.println("\n\n		------------------------------------------------��	   	     ���� ����  		��------------------------------------------------");
	
	}
	
	public void menu() {
		
		System.out.println("\n\n				1. �ڵ�					 	 2. ���ڵ� & ����					3. ���� ���");
		System.out.println("\n\n				4. ����						 5. �ζ� ������ ���				        6. Home");
		System.out.println("\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
	}	
}
