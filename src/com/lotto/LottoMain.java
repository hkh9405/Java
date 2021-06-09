package com.lotto;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LottoMain extends Thread{

	static String menu,num,str;
	static int i;

	public static void main(String[] args) throws IOException {

		LottoHome h=new LottoHome();
		LottoInfo l=new LottoInfo();
		LottoLocation ll;	
		LottoWin lw=new LottoWin();
		NumberMenu nm =new NumberMenu();
		Thread t=Thread.currentThread();
		LottoCheck lc=new LottoCheck();
		LottoWinInfo lwi=new LottoWinInfo();
		NumberHome nh=new NumberHome();
		Number nn=new Number();

		Scanner sc=new Scanner(System.in);



		//Intro ��������
		h.chessClose();

		try {
			sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
		h.start();

		try {
			h.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
		h.chessClose();

		try {
			sleep(700);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		h.chessOpen();


		try {
			sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		//while ���ѹݺ����� Ȩȭ������ ���ƿ����ϱ�
		while(true) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			h.menu();

			menu=sc.next();

			//����ġ������ �޴�1~6�� ���
			switch (menu) {

			//����
			case "1": {
				while(true) {
					l.info();

					String home=sc.next();

					if(home.equals("h")) {
						break;//Ȩ Ŭ������ �ҷ�����	
					}		
				}

				break;	
			}

			//���Ǳ���
			case "2": {
				while(true) {
					try {

						//��������
						while(true){

							ll=new LottoLocation();

							ll.printStore();

							System.out.println("\n\n\n\n\n\n\n");
							ll.start();

							char ch=(char) System.in.read();

							if(ch!=0) {
								ll.setFlag(true);

							}

							while(true) {
								num=sc.next();
								System.out.println();

								if(num.equals("1")) {
									break;
								} else if (num.equals("2")) {
									break;
								} else {
									ll.threadMap2(ll.getLoca());
								}
							}

							if(num.equals("2")) {
								break;
							}

						}

						//���� ����


						while(true) {
							nh.home();		
							nh.info();			
							nh.menu();


							i=sc.nextInt();
							while(true) {
								if(i==1) {						
									nn.autoNum();break;
								}

								else if(i==2) {						
									nn.semiManuNum();break;
								}

								else if(i==3) {						
									nn.count();break;
								}

								else if(i==4) {						
									nn.delete();break;
								}

								else if(i==5) {						
									nn.print();
									nn.writeFile();

									while(true) {
										str=sc.next();
										System.out.println();
										if(str.equals("h")) {
											break;
										} else if (str.equals("c")) {
											lw.ball();
											lw.check();
											break;
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
									if(str.equals("c")) {
										break;
									}
									break;
								}

								else if(i==6){						
									break;
								}
								if(str.equals("h")) {
									break;	
								}
								if(str.equals("c")) {
									break;	
								}
							}
							if(i==6) {
								break;
							}
						}	

					} catch (Exception e) {
						System.out.println(e.toString());
					}
					if(i==6) {
						break;
					}
				}
			}

			//��ȣ��÷
			case "3": {
				lw.ball();
				lw.check();
				break;
			}

			//��÷Ȯ��
			case "4": 
				lc.num=lw.getNum2();
				lc.check();
				lwi.myData();
				while(true) {
					String c=sc.next();
					if(c.equals("h")) {
						break;
					}
				}
				break;
				//ȸ���� ��÷����
			case "5": 
				lwi.num2=lw.getNum2();
				lwi.winInfoPrint();
				while(true) {
					String c=sc.next();
					if(c.equals("h")) {
						break;
					}
				}
				break;
				//����
			case "6": System.exit(0);
			}
		}

	}

}

