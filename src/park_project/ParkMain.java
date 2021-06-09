package park_project;

import java.io.IOException;
import java.util.Scanner;

public class ParkMain {

	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		ParkMem pm=new ParkMem();
		ParkMemDAO dao=new ParkMemDAO();
		ParkMemDTO dto;
		Loading l=new Loading();
		parkMenu menu=new parkMenu();
		BookingMain bm = new BookingMain();
		Booking bk = new Booking();
		Park p=new Park();
		ParkPay pp=new ParkPay();
		ParkDAO pdao=new ParkDAO();

		try {
			l.start();
			l.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

		while(true) {
			while(true) {
				menu.mainmenu();
				int mainmenu=sc.nextInt();

				String i = null;

				if(mainmenu==1) {
					while(true) {
						dao=new ParkMemDAO();
						do {
							pm.agreement();
							i=sc.next();

							if(i.equals("1")) {
								break;
							} else if(i.equals("2")) {
								break;
							} 
						} while(i=="1" || i=="2");

						if(i.equals("2")) {break;}

						System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

						do {
							dto=pm.membership();
							i=sc.next();

							if(i.equals("1")) {
								dao.memData(dto);break;
							} else if(i.equals("2")) {
								break;
							} 
						} while(i=="1" || i=="2");

						if(i.equals("2")) {break;}

						do {
							pm.welcome();
							i=sc.next();

							if(i.equals("1")) {
								break;
							} else if(i.equals("2")) {
								break;
							} 
						} while(i=="1" || i=="2");

						if(i.equals("1")) {break;}
						if(i.equals("2")) {
							menu.mymenu();
						}
					}
				} 

				else if(mainmenu==2) {
					while(true) {
						dao=new ParkMemDAO();
						menu.loginMenu();
						i=sc.next();

						if(i.equals("1")) {
							pm.insertId();
							pm.insertPwd();
							int result=dao.login(pm.logid, pm.logpwd);
							bm.logid = pm.logid;
							if(result!=0) {
								break;
							} else {
								while(true) {
									pm.loginError();
									String a=sc.next();
									if(a.equals("1")) {
										break;
									}
								}
							}
						} else if(i.equals("2")) {
							while(true) {
								System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
								pm.findId();
								String a=sc.next();
								if(a.equals("1")) {
									break;
								}
							}
						} else if(i.equals("3")) {
							while(true) {
								System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
								pm.findPwd();
								String a=sc.next();
								if(a.equals("1")) {
									break;
								}
							}
						} else if(i.equals("4")) {
							break;
						}
					}

					if(i.equals("4")) {break;}

					while(true) {
						menu.mymenu();
						i=sc.next();

						if(i.equals("1")) {
							while(true) {
								pm.getInfo();
								String a=sc.next();
								if(a.equals("1")) {
									while(true) {
										System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
										pm.updateInfo();
										String b=sc.next();
										if(b.equals("1")) {
											break;
										}
									}
								} else if(a.equals("2")) {
									break;
								}
							}
						} else if(i.equals("2")) {
							
							bm.bookingmenu();
							
						} else if(i.equals("3")) {
							p.logid=pm.logid;
							
							while(true) {
								p.usedList();
								String a=sc.next();
								if(a.equals("1")) {
									pdao.delete(p.logid);
									pp.payprint();
									break;
								} else if (a.equals("2")) {
									break;
								}
							}
						} else if(i.equals("4")) {
							break;
						}
					} 
				}
				else if(mainmenu==3) {
					System.exit(0);
				} else break;
			}
		}
	}

}
