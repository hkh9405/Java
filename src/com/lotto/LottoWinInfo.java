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
	int[] num2 = new int[4]; //��÷��ȣ
	int[] myNum = new int[4];
	int[] inwon = new int[5];
	String[] prize = new String[4];
	int[] num; // �ڵ�	

	public void ramdomNumber() {

		rd = new Random();

		int min = 10000;
		int max = 15000;

		inwon[0] = rd.nextInt(max-min)+min;

		for(j=0;j<inwon[0];j++) {// ����
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
				rank=1; //1��
				inwon[1]++;
			} else if((num1[0]==0 && num1[1]==0 && num1[2]==0)	|| (num1[0]==0 && num1[1]==0 && num1[3]==0) 
					|| (num1[1]==0 && num1[2]==0 && num1[3]==0)){
				rank=2; //2��
				inwon[2]++;				
			} else if((num1[0]==0 && num1[1]==0) || (num1[0]==0 && num1[2]==0) || (num1[0]==0 && num1[3]==0) 
					|| (num1[1]==0 && num1[2]==0) || (num1[1]==0 && num1[3]==0) || (num1[2]==0 && num1[3]==0)) {
				rank=3; //3��
				inwon[3]++;
			} else {
				rank=4; //4��
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
		prize[0] = NumberFormat.getInstance().format(tot);//�޸�

		thd = 2000;//*3���÷�ο�
		prize[3] = NumberFormat.getInstance().format(thd);//�޸�

		rest = tot - (inwon[3]*thd); 	

		fir = (rest*20)/100;	

		if(inwon[1]==0) {
			afir = 0;
		}else {
			afir = fir/inwon[1];
		}
		prize[1] = NumberFormat.getInstance().format(afir);//�޸�
		
		sec = rest-fir;
		if(inwon[2]==0) {
			asec=0;
		}else {
			asec = sec/inwon[2];
		}
		prize[2] = NumberFormat.getInstance().format(asec);//�޸�
	
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
			System.out.println("\n\t\t\t\t\t\t\t��" + (n+1) + "�� ���� ��÷����\n");
			System.out.print("\t\t\t\t\t\t\t�ζ� �� ���ż���: " + inwon[0] + "��");
			System.out.println("\t\t�ζ� �����ݾ�: " + prize[0] + "��");
			System.out.print("\t\t\t\t\t\t\t�ζ� ��÷ ��ȣ: ");			
			for(int su : num2) {
				System.out.printf("%4d",su );
			}
			System.out.println();
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t�� �ζ� ��ȣ ");			
			myData();
			System.out.println();
			System.out.printf("\t\t\t\t\t\t\t1�� ��÷ �ο� %8d��\t1�� ��÷�� �� %10s��\n",inwon[1],prize[1]);
			System.out.printf("\t\t\t\t\t\t\t2�� ��÷ �ο� %8d��\t2�� ��÷�� �� %10s��\n",inwon[2],prize[2]);
			System.out.printf("\t\t\t\t\t\t\t3�� ��÷ �ο� %8d��\t3�� ��÷�� �� %10s��\n\n",inwon[3],prize[3]);
			
			Iterator<LottoVO> it = lists.iterator();
			while(it.hasNext()) {
				LottoVO vo = it.next();					
				vo.infoPrint();
			}	
			
			
			
		} catch (Exception e) {

		}
		System.out.println("		------------------------------------------------��	Ȩ ȭ������ ���ư����� HŰ�� �Է��ϼ���	��------------------------------------------------");
	}
	
	public void next() throws IOException {//ȭ��
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
