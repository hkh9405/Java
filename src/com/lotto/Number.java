package com.lotto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Number extends Thread{
	
	
	
	List<LottoVO> lists = new ArrayList<>();
	String[] pa = {"��","��","��","��","��"};
	String[] ps = {"��","��","��","��","��"};
	String[] pm = {"��","��","��","��","��"};
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Random rd = new Random();	
	NumberHome nh = new NumberHome();
	NumberThread nt = new NumberThread();
	LottoMcn lm=new LottoMcn();
	LottoMain lmain = new LottoMain();
	LottoHome h = new LottoHome();
	
	int[] num;
	int n,i,j,temp;
	int cntA,cntS,cntM,cnt,tot;	
	char ch;
	String pick;
	
	LottoVO vo;
	AutheNumber auth = new AutheNumber();
	
	public Number() {
		
		File f=new File("c:\\lotto\\Number.txt");
		
		try {

			if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs(); // c:\\score\\score.txt ��θ� ��������
			}

			if(f.exists()) {

				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);

				lists=(List<LottoVO>) ois.readObject();

				fis.close();
				ois.close();

			}

		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
	
	public void autoNum() throws IOException {//�ڵ�
		nh.home();
		nh.info();
		tot++;		
		if(tot>5) {
			System.out.println("\n\n\n							������ �� �ִ� ������ �ִ� 5���� �̹� 5�� ������ �Ϸ��Ͽ����ϴ�.");			
			System.out.println("\n\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
			next();	
			return;
		}		
		vo = new LottoVO();	
		num = new int[4];
		n=0;
		try {
			while(n<num.length) {		
				
				num[n] = rd.nextInt(30)+1;	
				
				for(int i=0;i<n;i++) {	
					
					if(num[i]==num[n]) {
						n--;
						break;
					}
				}
				n++;		
			}			
			sort();
			cntA++;				
			ch = (char) (64+tot);
			if(ch==65) {
				pa[tot-1] = "��";				
			}else if(ch==66) {
				pa[tot-1] = "��";
			}else if(ch==67) {
				pa[tot-1] = "��";
			}else if(ch==68) {
				pa[tot-1] = "��";
			}else if(ch==69) {
				pa[tot-1] = "��";
			}			
			nh.setPa(pa);			
			vo.setAlpha(ch);
			vo.setPick(" ��  ��");			
			vo.setNum(num);			
			lists.add(vo);
			nh.home();
			nh.info();
			System.out.println("\n\n\n                   					  		       �ڵ��� �����Ͽ����ϴ�. ");
			System.out.println("                 				 			    ��ȣ�� �ڵ����� �߱޵˴ϴ�. ");
			System.out.println("\n\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
			next();
			
		} catch (Exception e) {
			
		}		
	}//autoNum
	
	public void semiManuNum() throws IOException {//���ڵ�&����
		nh.home();
		nh.info();
		tot++;		
		if(tot>5) {
			System.out.println("\n\n\n\n\n							������ �� �ִ� ������ �ִ� 5���� �̹� 5�� ������ �Ϸ��Ͽ����ϴ�.");	
			System.out.println("\n\n\n\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");			
			next();
			return;
		}
		vo = new LottoVO();
		num = new int[4];
		int flag;
		String str;
		
		try {
			do {
				nh.home();
				nh.info();				
				System.out.println("\n\n									    ���ڵ� & ������ �����Ͽ����ϴ�.");
				System.out.println("									    ��ȣ�� ���� ������ ��� ����");				
				System.out.println("								      �κ� ������ ��� ���ڵ����� �߱޵˴ϴ�.");
				System.out.println("								    	        ���ڸ� �Է��� �ּ���");	
				System.out.println("\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.print("										");
				str = br.readLine();
				str.trim();
			
				if(!auth.checkString(str) || !auth.checKNumber(str)){
					flag = 0;				
				}else			
					flag = 1;
				
			}while(flag==0);
			
			String[] ss = str.split(" ");
			
			if(ss.length<4) {
				for(i=0;i<ss.length;i++) {
					num[i] = Integer.parseInt(ss[i]);
				}
				n=0;
				
				while(n<5) {

					for(i=0;i<num.length;i++) {

						if(num[i]==0) {	

							num[i] = rd.nextInt(30)+1;	
							for(i=0;i<n;i++) {

								if(num[i]==num[n]) {
									n--;
									break;
								}
							}										
						}
					}
					n++;	
				}
				sort();	
				cntS++;				
				ch = (char) (64+tot);
				if(ch==65) {
					ps[tot-1] = "��";
				}else if(ch==66) {
					ps[tot-1] = "��";
				}else if(ch==67) {
					ps[tot-1] = "��";
				}else if(ch==68) {
					ps[tot-1] = "��";
				}else if(ch==69) {
					ps[tot-1] = "��";
				}		
				nh.setPs(ps);
				vo.setAlpha(ch);				
				vo.setPick("���ڵ�");			
				vo.setNum(num);
				lists.add(vo);
				nh.home();
				nh.info();
				System.out.println("\n\n\n										   ��ȣ ���� �Ϸ�");
				System.out.println(" 							   	  �Է��� ��ȣ�� �� �������� �ڵ����� �߱޵˴ϴ�.");
				System.out.println("\n\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
				next();				
				
			}else if(ss.length==4) {				
				num = Arrays.stream(ss).mapToInt(Integer::parseInt).toArray();
				sort();	
				cntM++;
				ch = (char) (64+tot);
				if(ch==65) {
					pm[tot-1] = "��";
				}else if(ch==66) {
					pm[tot-1] = "��";
				}else if(ch==67) {
					pm[tot-1] = "��";
				}else if(ch==68) {
					pm[tot-1] = "��";
				}else if(ch==69) {
					pm[tot-1] = "��";
				}		
				nh.setPm(pm);
				vo.setAlpha(ch);
				vo.setPick(" ��  ��");
				vo.setNum(num);				
				lists.add(vo);
				nh.home();
				nh.info();
				System.out.println("\n\n\n										   ��ȣ ���� �Ϸ�");
				System.out.println("   									     �Է��� ��ȣ�� �߱޵˴ϴ�.");
				System.out.println("\n\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
				next();
				
			}			
		} catch (Exception e) {
			
		}		
	}//semiManuNum	

	public void count() throws IOException{//�ζ� ���� ����	
		
		nh.home();
		nh.info();
		System.out.println("\n\n 										    �ڵ� : " + cntA + "��");
		System.out.println(" 										    ���ڵ�: " + cntS + "��");
		System.out.println(" 										    ���� : " + cntM + "��");
		System.out.println(" 										    �Ѽ���: " + tot + "��");
		System.out.println();	
		System.out.println("\n		--------------------------------------------------------------------------------------------------------------------------------------------------");	
		next();
		
	}//list

	public void sort() {//���� ����
		
		for(i=0;i<num.length-1;i++) {
			
			for(j=i+1;j<num.length;j++) {
				
				if(num[i]>num[j]) {
				
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
	}//sort	

	public void delete() {//���� ����
		
		String str;
		char del = 0;
		int flag = 0;
		try {
			nh.home();
			nh.info();
			do {
				System.out.print("\n\n\n\n									        ������ �� �Է�[A~E]: ");
				System.out.println("\n\n\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.print("										");
				str = br.readLine();
				str.trim();					
				if(str.length()!=1) {
					nh.home();
					nh.info();
					System.out.println("\n\n										     �Է� ����");
					System.out.println("									[A~E] ������ �Ѱ��� ���ڸ� �Է� ����");
					System.out.println("\n\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");					
					next();
					flag=0;
				}else {
					del = str.charAt(0);
					if(!(del>=97 && del<=101 || del>=97-32 && del<=101-32)) {
						nh.home();
						nh.info();
						System.out.println("\n\n										     �Է� ����");
						System.out.println("									[A~E] ������ �Ѱ��� ���ڸ� �Է� ����");
						System.out.println("\n\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
						next();
						flag=0;
					}else if(del>=97 && del<=101) { //�ҹ��� -> �빮�� ����
						del-=32;
						flag=1;
					}					
				}				
			}while(flag==0);
			
			Iterator<LottoVO> it = lists.iterator();
			while(it.hasNext()) {
				LottoVO vo = it.next();
				if(del==vo.getAlpha()) {
					lists.remove(vo);					
					if(vo.getPick().equals(" ��  ��")) {
						tot--;
						cntA--;
						if(del==65) {
							pa[0] = "��";				
						}else if(del==66) {
							pa[1] = "��";
						}else if(del==67) {
							pa[2] = "��";
						}else if(del==68) {
							pa[3] = "��";
						}else if(del==69) {
							pa[4] = "��";
						}	
						nh.setPa(pa);										
						nh.home();
						nh.info();	
					}else if(vo.getPick().equals("���ڵ�")) {
						tot--;
						cntS--;
						if(del==65) {
							ps[0] = "��";				
						}else if(del==66) {
							ps[1] = "��";
						}else if(del==67) {
							ps[2] = "��";
						}else if(del==68) {
							ps[3] = "��";
						}else if(del==69) {
							ps[4] = "��";
						}
						nh.setPs(ps);										
						nh.home();
						nh.info();	
					}else if(vo.getPick().equals(" ��  ��")) {
						tot--;
						cntM--;
						if(del==65) {
							pm[0] = "��";				
						}else if(del==66) {
							pm[1] = "��";
						}else if(del==67) {
							pm[2] = "��";
						}else if(del==68) {
							pm[3] = "��";
						}else if(del==69) {
							pm[4] = "��";
						}						
						nh.setPm(pm);					
						nh.home();
						nh.info();	
					}							
					System.out.println("\n\n\n\n									       	   �����Ǿ����ϴ�.");			
					System.out.println("\n\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
					next();
				}
			}	
		} catch (Exception e) {
			
		}		
	}//delete
	
	public void print() {//���
		nt.start();
//		try {			
//			Iterator<LottoVO> it = lists.iterator();
//			while(it.hasNext()) {
//				LottoVO vo = it.next();
//				vo.numPrint();
//
//			}	
//			
//		} catch (Exception e) {
//
//		}	
//			
	}
	
	public void next() throws IOException {//ȭ��

		char ch = (char) System.in.read();
		if(ch!=0) {
			nh.home();
			nh.info();
			nh.menu();
		}
	}

	public void writeFile() {//������ text����		
		
		try {			
			if(lists!=null) {
				FileOutputStream fos = new FileOutputStream("c:\\lotto\\Number.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);				

				oos.writeObject(lists);
				System.out.println();
				fos.close();
				oos.close();
			}			
		} catch (Exception e) {
			
		}
	}	
}