package com.lotto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoWinInfo {

	List<LottoVO> lists = new ArrayList<LottoVO>();
	Number nn = new Number();
	NumberHome nh = new NumberHome();
	Scanner sc = new Scanner(System.in);
	FileCheck fc = new FileCheck();
	LottoVO vo;
	LottoLocation ll;
	Random rd;
	
	String str,crest;
	int fir,sec,thd,afir,asec,rest,rank,tot;	
	int i,j,temp,n;
	int[] num2 = new int[4]; //당첨번호
	int[] myNum = new int[4];
	int[] inwon = new int[5];
	String[] prize = new String[4];
	int[] num; // 자동	

	public void ramdomNumber() {

		rd = new Random();

		int min = 10000;
		int max = 15000;

		inwon[0] = rd.nextInt(max-min)+min;

		for(j=0;j<inwon[0];j++) {// 생성
			vo = new LottoVO();
			vo.paring();

			rd = new Random();

			int n=0;
			int su=0;
			num = new int[4];
			while(n<num.length) {	
				num[n] = rd.nextInt(30)+1;
				for(i=0;i<n;i++) {	
					if(num[i]==num[n]) {
						n--;
						break;
					}
				}
				n++;		
			}
			Arrays.sort(num);
			int[] num1 = {1,1,1,1};
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					if(num2[i]==num[j]) {
						num1[j]=0;
					}
				}			
			}

			if(num1[0]==0 && num1[1]==0 && num1[2]==0 && num1[3]==0) {
				rank=1; //1등
				inwon[1]++;
			} else if((num1[0]==0 && num1[1]==0 && num1[2]==0)	|| (num1[0]==0 && num1[1]==0 && num1[3]==0) 
					|| (num1[1]==0 && num1[2]==0 && num1[3]==0)){
				rank=2; //2등
				inwon[2]++;				
			} else if((num1[0]==0 && num1[1]==0) || (num1[0]==0 && num1[2]==0) || (num1[0]==0 && num1[3]==0) 
					|| (num1[1]==0 && num1[2]==0) || (num1[1]==0 && num1[3]==0) || (num1[2]==0 && num1[3]==0)) {
				rank=3; //3등
				inwon[3]++;
			} else {
				rank=4; //4등
				inwon[4]++;
			}	

			rd = new Random();
			su = rd.nextInt(34)+1;

			if(rank==1 || rank==2) {
				String str = Integer.toString(su);
				vo.setRank(rank);
				vo.setLoca(str);
				vo.setNum(num);
				vo.setInwon(inwon);
				lists.add(vo);
			}
		}
	}//ramdom

	public void prize() {
		
		tot = inwon[0] *1000;
		prize[0] = NumberFormat.getInstance().format(tot);//콤마

		thd = 2000;//*3등당첨인원
		prize[3] = NumberFormat.getInstance().format(thd);//콤마

		rest = tot - (inwon[3]*thd); 	

		fir = (rest*20)/100;	

		if(inwon[1]==0) {
			afir = 0;
		}else {
			afir = fir/inwon[1];
		}
		prize[1] = NumberFormat.getInstance().format(afir);//콤마
		
		sec = rest-fir;
		if(inwon[2]==0) {
			asec=0;
		}else {
			asec = sec/inwon[2];
		}
		prize[2] = NumberFormat.getInstance().format(asec);//콤마
	
	}

	public void myData() {
		try {
			FileInputStream fis = new FileInputStream("c:\\lotto\\Number.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			List<LottoVO>lists = (ArrayList<LottoVO>)ois.readObject();

			fis.close();
			ois.close();

			Iterator<LottoVO> mit = lists.iterator();
			while(mit.hasNext()) {
				LottoVO mvo = mit.next();					
				mvo.numPrint();				
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	public void winInfoPrint() {
		
		try {			
			ramdomNumber();		
			prize();
			fc.count();
			System.out.println("\n\t\t\t\t\t\t\t제" + (n+1) + "차 복권 당첨정보\n");
			System.out.print("\t\t\t\t\t\t\t로또 총 구매수량: " + inwon[0] + "개");
			System.out.println("\t\t로또 누적금액: " + prize[0] + "원");
			System.out.print("\t\t\t\t\t\t\t로또 당첨 번호: ");			
			for(int su : num2) {
				System.out.printf("%4d",su );
			}
			System.out.println();
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t내 로또 번호 ");			
			myData();
			System.out.println();
			System.out.printf("\t\t\t\t\t\t\t1등 당첨 인원 %8d명\t1등 당첨금 각 %10s원\n",inwon[1],prize[1]);
			System.out.printf("\t\t\t\t\t\t\t2등 당첨 인원 %8d명\t2등 당첨금 각 %10s원\n",inwon[2],prize[2]);
			System.out.printf("\t\t\t\t\t\t\t3등 당첨 인원 %8d명\t3등 당첨금 각 %10s원\n\n",inwon[3],prize[3]);
			
			Iterator<LottoVO> it = lists.iterator();
			while(it.hasNext()) {
				LottoVO vo = it.next();					
				vo.infoPrint();
			}	
			
			
			
		} catch (Exception e) {

		}
		System.out.println("		------------------------------------------------ㅣ	홈 화면으로 돌아가려면 H키를 입력하세요	ㅣ------------------------------------------------");
	}
	
	public void next() throws IOException {//화면
		char ch = (char) System.in.read();
		if(ch==13) {
			
		}	
	}
	
//	public static void main(String[] args) {
//
//		LottoWinInfo lwi = new LottoWinInfo();		
//		
//		lwi.winInfoPrint();
//		
//	}
}
