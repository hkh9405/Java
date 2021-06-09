package com.lotto;

import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LottoMain1 extends Thread{

	public static void main(String[] args) {

		LottoWin lw=new LottoWin();
		LottoCheck lc=new LottoCheck();
		NumberMenu mn=new NumberMenu();
		try {
			/*
			lc.fire();
			sleep(1000);
			for(int i=0;i<20;i++) {
				lc.fire1m();
				sleep(100);

				lc.fire1();
				sleep(100);
			}
			lc.fire1h();
			*/
			/*
			lc.fire();
			sleep(1000);
			for(int i=0;i<20;i++) {
				lc.fire2m();
				sleep(100);

				lc.fire2();
				sleep(100);
			}
			for(int i=0;i<20;i++) {
				lc.fire3();
				sleep(100);

				lc.fire3m();
				sleep(100);


			}
			lc.fire3h();

			lw.ball();
			lc.num=lw.getNum2();
			for(int i=0;i<4;i++) {
			System.out.println(lc.num[i]);
			}
			*/
			//mn.numMenu();
			
			lc.receipt();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
