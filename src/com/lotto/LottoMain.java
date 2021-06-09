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



		//Intro 보물상자
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

		//while 무한반복으로 홈화면으로 돌아오게하기
		while(true) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			h.menu();

			menu=sc.next();

			//스위치문으로 메뉴1~6번 사용
			switch (menu) {

			//설명서
			case "1": {
				while(true) {
					l.info();

					String home=sc.next();

					if(home.equals("h")) {
						break;//홈 클래스를 불러낸다	
					}		
				}

				break;	
			}

			//복권구매
			case "2": {
				while(true) {
					try {

						//지역선정
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

						//복권 구매


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

			//번호추첨
			case "3": {
				lw.ball();
				lw.check();
				break;
			}

			//당첨확인
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
				//회차별 당첨정보
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
				//종료
			case "6": System.exit(0);
			}
		}

	}

}

