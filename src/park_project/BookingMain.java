package park_project;

import java.io.IOException;
import java.util.Scanner;

public class BookingMain {
	Scanner sc = new Scanner(System.in);
	
	Booking bk = new Booking();
	BookingScreen bks = new BookingScreen();
	//public static void main(String[] args) throws IOException {	
	public String logid;
	int no;
	
	public void bookingmenu() throws IOException {
		bk.logid = logid;
		int ch;	
		
		bks.run();
		while(true) {
			
			do {
				bks.menua();
				ch = sc.nextInt();
				
			}while(ch<1 || ch>6 );

			switch (ch) {
			case 1:
				bk.insertYear();
				if(bk.ysu.equals("c") || bk.ysu.equals("C")) {
					break;
				}
				bk.insertMonth();
				if(bk.msu.equals("c") || bk.msu.equals("C")) {
					break;
				}
				while(true) {
					bk.changeMonth();
					if(bk.dd.equals("s") || bk.dd.equals("S") || bk.dd.equals("c") || bk.dd.equals("C")) {
						break;
					}
				}
				if(bk.dd.equals("c") || bk.dd.equals("C")) {
					break;
				}
				bk.insertday();
				if(bk.dsu.equals("c") || bk.dsu.equals("C")) {
					break;
				}
				bk.insertPno();
				if(bk.psu.equals("c") || bk.psu.equals("C")) {
					break;
				}
				bk.insertHour();
				if(bk.hsu.equals("c") || bk.hsu.equals("C")) {
					break;
				}				
				bk.insertBooking();				
				break;
			case 2:			
				bk.updateBooking();	
				if(bk.usu.equals("c") || bk.usu.equals("C")) {
					break;
				}
				break;
			case 3:
				bk.deleteBooking();
				if(bk.desu.equals("c") || bk.desu.equals("C")) {
					break;
				}break;
			case 4:
				bk.getMyBooking();
				System.out.println("\n\n\n");
				ch = (char) System.in.read(); break;
			case 5:				
				DBconn.close();
				return;				
			}
		}
	}
}
