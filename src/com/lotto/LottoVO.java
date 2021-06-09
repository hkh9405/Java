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
	private int[] num=new int[4]; //���Թ�ȣ 4��
	private int rank;
	
	String name;	
	private String pick;
	private char alpha;	
	private String[] store=new String[35]; //�ζ��Ǹ��� 34���� String[0]��°�� �ѱ�� 1~34����
	private String[] address=new String[35]; //�Ǹ��� �ּ� String[0]��°�� �ѱ�� 1~34����
	private String loca; //������ �Ǹ����� ��ȣ
	
	public void paring() { //store�� address�� ���Ϳ���

		try {

			//DOM Document ��ü�� �����ϱ� ���� ���丮 ����
			DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
			DocumentBuilder parser=f.newDocumentBuilder();

			String local="local.xml";

			//xml���� �Ľ�
			Document xmlDoc=parser.parse(local);

			String store="";
			String address="";

			//Document���� �Ľ��� ������ ����
			Element root=xmlDoc.getDocumentElement();

			NodeList ns=root.getElementsByTagName("row"); //�����Ǹž�����Ȳ

			for(int i=0;i<ns.getLength();i++) {

				Node node=ns.item(i); //row

				NodeList row=node.getChildNodes();

				Node n=row.item(1); //CMPNM_NM(��ȣ��)

				Node add=row.item(3); //LOCPLC_ADDR(�������ּ�)

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
			String str1 = String.format("\t\t\t\t\t\t\t%2s.%12s��\t\t",getLoca(),store[Integer.parseInt(getLoca())]);		
			System.out.print(str1);
			System.out.printf("%4d��",getRank());
			int[] numm = getNum();
			for(int su : numm) {
				System.out.printf("%4d",su);
			}	
			System.out.println();
		}else {
			String[] store = getStore();		
			String str1 = String.format("\t\t\t\t\t\t\t%2s.%12s\t\t\t",getLoca(),store[Integer.parseInt(getLoca())]);		
			System.out.print(str1);
			System.out.printf("%4d��",getRank());
			int[] numm = getNum();
			for(int su : numm) {
				System.out.printf("%4d",su);
			}	
			System.out.println();
		}
	}
}
