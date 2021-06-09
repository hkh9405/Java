package com.lotto;

import java.io.Serializable;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LottoVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//Scanner sc=new Scanner(System.in);
	private int[] prize=new int[3];
	private int[] inwon=new int[5];
	private int[] num=new int[4]; //기입번호 4개
	private int rank;
	
	String name;	
	private String pick;
	private char alpha;	
	private String[] store=new String[35]; //로또판매점 34개소 String[0]번째는 넘기고 1~34까지
	private String[] address=new String[35]; //판매점 주소 String[0]번째는 넘기고 1~34까지
	private String loca; //선택한 판매점의 번호
	
	public void paring() { //store와 address의 세터역할

		try {

			//DOM Document 객체를 생성하기 위해 팩토리 생성
			DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
			DocumentBuilder parser=f.newDocumentBuilder();

			String local="local.xml";

			//xml파일 파싱
			Document xmlDoc=parser.parse(local);

			String store="";
			String address="";

			//Document에서 파싱한 데이터 추출
			Element root=xmlDoc.getDocumentElement();

			NodeList ns=root.getElementsByTagName("row"); //복권판매업소현황

			for(int i=0;i<ns.getLength();i++) {

				Node node=ns.item(i); //row

				NodeList row=node.getChildNodes();

				Node n=row.item(1); //CMPNM_NM(상호명)

				Node add=row.item(3); //LOCPLC_ADDR(소재지주소)

				store=n.getChildNodes().item(0).getNodeValue();

				address=add.getChildNodes().item(0).getNodeValue();

				this.store[i]=store;
				this.address[i]=address;

			}				

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public String[] getStore() {
		return store;
	}

	public String[] getAddress() {
		return address;
	}

	public void setLoca(String loca) {
		this.loca = loca;
	}

	public String getLoca() {
		return loca;
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}
	public int[] getInwon() {
		return inwon;
	}

	public void setInwon(int[] inwon) {
		this.inwon = inwon;
	}
	
	public int[] getPrize() {
		return prize;
	}

	public void setPrize(int[] prize) {
		this.prize = prize;
	}

	public String getName() {
		return name;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPick() {
		return pick;
	}

	public void setPick(String pick) {
		this.pick = pick;
	}
	
	public char getAlpha() {
		return alpha;
	}

	public void setAlpha(char alpha) {
		this.alpha = alpha;
	}	

	public void numPrint() {
		String str1 = String.format("\t\t\t\t\t\t\t%2s %4s ",getAlpha(),getPick());
		System.out.print(str1);		
		for(int su : getNum()) {
			System.out.printf("%4d",su);
		}
		System.out.println();		
	}
	
	public void infoPrint() {		
		if(getRank()==1) {
			String[] store = getStore();		
			String str1 = String.format("\t\t\t\t\t\t\t%2s.%12s★\t\t",getLoca(),store[Integer.parseInt(getLoca())]);		
			System.out.print(str1);
			System.out.printf("%4d등",getRank());
			int[] numm = getNum();
			for(int su : numm) {
				System.out.printf("%4d",su);
			}	
			System.out.println();
		}else {
			String[] store = getStore();		
			String str1 = String.format("\t\t\t\t\t\t\t%2s.%12s\t\t\t",getLoca(),store[Integer.parseInt(getLoca())]);		
			System.out.print(str1);
			System.out.printf("%4d등",getRank());
			int[] numm = getNum();
			for(int su : numm) {
				System.out.printf("%4d",su);
			}	
			System.out.println();
		}
	}
}
