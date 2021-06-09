package park_project;

import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Booking {

	Scanner sc = new Scanner(System.in);

	BookingDAO dao = new BookingDAO();
	BookingScreen bks = new BookingScreen();	
	public String logid;
	//String logid = "yanadoo";
	Calendar cal = Calendar.getInstance();		
	int year,month,day,hour,pno,no;
	String ysu,msu,dsu,psu,hsu,usu,desu,isu;
	int tyear = cal.get(Calendar.YEAR);
	int tmonth = cal.get(Calendar.MONTH) + 1;
	int tday = cal.get(Calendar.DAY_OF_MONTH);
	int thour = cal.get(Calendar.HOUR_OF_DAY);
	String dd;
	String pp[]= {"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};

	//�⵵
	public void insertYear() throws IOException {
		char ch = 0;
		do {
			bks.menu1();
			bks.caroom();
			System.out.println("\n\n\n");
			System.out.println("									������ �⵵(YEAR)�� �Է��ϼ���[YYYY]    ���(c)\n");
			System.out.print("											");
			ysu = sc.next();
			System.out.println();
			if(ysu.equals("c") || ysu.equals("C")) {
				break;
			}else {
				year = Integer.parseInt(ysu);
			}

			if(tyear>year) {
				bks.menu1();
				bks.caroom();
				System.out.println("\n\n\n");
				System.out.println("										���⵵ �Է� �Ұ�\n");				
				ch = (char) System.in.read();
				System.out.println();
			}	
		}while(tyear>year);
	}

	//��
	public void insertMonth() throws IOException {
		int su = 0;
		char ch = 0;
		do {
			bks.menu1();
			bks.caroom();
			System.out.println("\n\n\n");
			System.out.println("									������ ��(MONTH)�� �Է��ϼ���[MM]    ���(c)\n");
			System.out.print("											");
			msu = sc.next();
			System.out.println();

			if(msu.equals("c") || msu.equals("C")) {
				break;
			}else {
				month = Integer.parseInt(msu);
			}
			if(tyear==year) {
				if(tmonth>month) {
					bks.menu1();
					bks.caroom();
					System.out.println("\n\n\n");
					System.out.println("										������ �Է� �Ұ�\n");					
					ch = (char) System.in.read();
					System.out.println();
				}else {
					su=1;
				}					
			}else {
				su=1;
			}				
		}while(su==0);
	}

	//��¥
	public void insertday() throws IOException {
		int su = 0;
		char ch = 0;
		do {
			bks.menu1();			
			Calendar();
			System.out.println("\n\n\n");
			System.out.println("									������ ��¥(DAY)�� �Է��ϼ���[DD]    ���(c)\n");
			System.out.print("											");
			dsu = sc.next();
			System.out.println();
			if(dsu.equals("c") || dsu.equals("C")) {
				break;
			}else {
				day = Integer.parseInt(dsu);
			}
			if(tyear==year && tmonth==month) {
				if(tday>day) {
					bks.menu1();
					bks.caroom();
					System.out.println("\n\n\n");
					System.out.println("										������¥ �Է� �Ұ�\n");					
					ch = (char) System.in.read();
					System.out.println();
				}else {
					su=1;
				}
			}else {
				su=1;
			}
		}while(su==0);
	}

	//�ð�
	public void insertHour() throws IOException {
		int su =0;
		char ch = 0;
		do {
			bks.menu1();
			bks.time();
			System.out.println("\n\n\n");
			System.out.println("									������ �ð�(HOUR)�� �Է��ϼ���[24�ð���]    ���(c)\n");
			System.out.print("											 ");
			hsu = sc.next();
			System.out.println();
			if(hsu.equals("c") || hsu.equals("C")) {
				return;
			}else {
				hour = Integer.parseInt(hsu);
			}
			if(tyear==year && tmonth==month && tday==day && thour>=hour) {
				bks.menu1();
				bks.time();
				System.out.println("\n\n\n");
				System.out.println("										�����ð� �Է� �Ұ�\n");
				ch = (char) System.in.read();
				System.out.println();
				su=0;
			}else {
				su=1;
			}
		}while(hour<0 || hour>24 || su==0);

	}

	//�����ڸ���ȣ
	public void insertPno() throws IOException {
		int result = 0;
		char ch = 0;
		do {
			BookingTime();
			bks.parkLayout();
			System.out.println();
			System.out.println("										  " + year + "��" + " " + month + "��" + " " + day + "��\n\n");
			System.out.println("									������ �����ڸ���ȣ�� �Է��ϼ���[1~20]    ���(c)\n");
			System.out.print("											");
			psu= sc.next();
			System.out.println();

			if(psu.equals("c") || psu.equals("C")) {
				break;
			}else {
				pno = Integer.parseInt(psu);
			}
			result = BookingTime();			

			if(result==0) {
				bks.parkLayout();
				System.out.println("\n");
				System.out.println("											����Ұ�\n");
				System.out.println("									      �ٸ� �����ڸ��� �̿����ּ���\n");				
				ch = (char) System.in.read();
				System.out.println();
			}		
		}while(pno<1 || pno>20 || result==0);
	}

	//���� ������
	public void changeMonth() {
		bks.menu1();
		Calendar();
		System.out.println("\n\n\n");
		System.out.println("								   ������ ��[P]   �ᳯ¥ ����[S]   ���� ��[N]��    ���(c)\n");
		System.out.print("											");
		dd = sc.next();
		System.out.println();
		if(dd.equals("p") || dd.equals("P")) {
			month-=1;				
		} else if(dd.equals("n") || dd.equals("N")) {
			month+=1;
		} else if(dd.equals("s") || dd.equals("S")) {
			return;
		}
	}

	//���� �Է�
	public void insertBooking() {

		int result = 0;

		try {			
			BookingDTO dto = new BookingDTO();
			dto.setLogid(logid);
			dto.setYear(year);
			dto.setMonth(month);
			dto.setDay(day);
			dto.setHour(hour);
			dto.setPno(pno);
			String mmonth = String.format("%02d",month);
			String startdate = year + "-" + mmonth + "-" + day + " " + hour + ":" + "00" + ":" + "00";
			
			while(true) {
				bks.menu1();
				bks.caroom();
				
				System.out.println("\n									     ������ ��¥ �� �����ڸ���ȣ\n");
				System.out.printf("								    ���೯¥:%20s  �����ڸ���ȣ:%2d\n",startdate,pno);
				System.out.println();
				System.out.println("										�����ϱ�(a)    ���(c)");
				System.out.print("											");
				isu = sc.next();
				System.out.println();
				
				if(isu.equals("c") || isu.equals("C")) {
					return;
				}else if (isu.equals("a") || isu.equals("A")) {
					break;
				}
			}


			BookingDAO dao = new BookingDAO();
			no = 1 + dao.getBookingCount(logid);
			dto.setNo(no);
			dto.setStartdate(startdate);				
			result = dao.insertBooking(dto);
			char ch = 0;
			if(result!=0) {
				bks.menu1();
				bks.caroom();
				System.out.println("\n\n\n");
				System.out.println("										������ �Ϸ� �Ǿ����ϴ�\n");
				ch = (char) System.in.read();
				System.out.println();
			}	

		} catch (Exception e) {
			System.out.println("����");
			System.out.println(e.toString());
		}
	}

	//���� ����
	public void updateBooking() {

		try {
			int nno=0;
			char ch=0;
			int su = 0;
			do {
				bks.menu1();
				bks.caroom();
				getMyBooking();
				System.out.println("\n");
				System.out.println("									������ ���� ��ȣ(No)�� �Է��ϼ���    ���(c)\n");
				System.out.print("											");
				usu = sc.next();
				System.out.println();

				if(usu.equals("c") || usu.equals("C")) {
					return;
				}else {
					no = Integer.parseInt(usu);
				}

				BookingDAO dao = new BookingDAO();

				List<BookingDTO> lists = dao.getBooking(logid);

				Iterator<BookingDTO> it = lists.iterator();

				while(it.hasNext()) {
					BookingDTO dto = it.next();					
					nno = dto.getNo();
					int ppno = dto.getPno();
					if(nno==no) {
						su = 1;						
						break;
					}
				}

				if(su==0 || nno<1 || nno>no) {
					bks.menu1();
					bks.caroom();
					System.out.println();
					System.out.println("										�����ȣ�� �����ϴ�\n");
					System.out.println("										�ٽ��Է����ּ���\n");					
					ch = (char) System.in.read();
					System.out.println();
					su = 0;					
				}

			}while(nno<1 || nno>no || su==0);			

			BookingDTO dto = new BookingDTO();
			insertYear();
			insertMonth();
			changeMonth();
			insertday();
			insertPno();
			insertHour();

			dto.setLogid(logid);
			dto.setYear(year);
			dto.setMonth(month);
			dto.setDay(day);
			dto.setHour(hour);
			dto.setPno(pno);
			dto.setNo(no);
			String mmonth = String.format("%02d",month);
			String startdate = year + "-" + mmonth + "-" + day + " " + hour + ":" + "00" + ":" + "00";
			dto.setStartdate(startdate);

			int result = dao.updateBooking(dto);

			if(result!=0) {
				bks.menu1();
				bks.caroom();
				System.out.println("\n\n\n");
				System.out.println("								������ �����Ǿ����ϴ�\n");
			}else {
				bks.menu1();
				bks.caroom();
				System.out.println("\n\n\n");
				System.out.println("								��������� �����Ͽ����ϴ�\n");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}	
	}

	//���� ����
	public void deleteBooking() {

		try {
			int nno=dao.getBookingCount(logid);
			char ch=0;

			int su = 0;
			do {
				bks.menu1();
				bks.caroom();

				getMyBooking();
				System.out.println("\n");
				System.out.println("									������ ���� ��ȣ(No)�� �Է��ϼ���      ���(c)\n");
				System.out.print("											");
				desu = sc.next();
				System.out.println();

				if(desu.equals("c") || desu.equals("C")) {
					break;
				}else {
					no = Integer.parseInt(desu);
				}
				BookingDAO dao = new BookingDAO();

				List<BookingDTO> lists = dao.getBooking(logid);

				Iterator<BookingDTO> it = lists.iterator();

				while(it.hasNext()) {
					BookingDTO dto = it.next();					
					nno = dto.getNo();
					if(nno==no) {
						su = 1;
						break;
					}
				}
				if(su==0 || nno<1 || nno>no) {
					bks.menu1();
					bks.caroom();
					System.out.println();
					System.out.println("										�����ȣ�� �����ϴ�\n");
					System.out.println("										�ٽ��Է����ּ���\n");					
					ch = (char) System.in.read();
					System.out.println();
					su = 0;	
				}				

			}while(nno<1 || nno>no || su==0);	
			BookingDTO dto = new BookingDTO();
			dto.setLogid(logid);
			dto.setNo(no);
			int result = dao.deleteBooking(dto);

			if(result!=0) {
				bks.menu1();
				bks.caroom();
				System.out.println("\n\n\n");
				System.out.println("								������ ��ҵǾ����ϴ�\n");				
			}else {
				bks.menu1();
				bks.caroom();
				System.out.println("\n\n\n");
				System.out.println("								���� ��� ����\n");				
			}



		} catch (Exception e) {
			System.out.println(e.toString());
		}	
	}

	//�޷�	
	public void Calendar() {

		int i, week;

		cal.set(year,month-1,1);

		week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("\n\n\n\n");
		System.out.println("								" + year + "��" + " " + month + "��");
		System.out.println("								��������������������������������������������������");
		System.out.println("								��	��	ȭ	��	��	��	��");
		System.out.println("								��������������������������������������������������");
		System.out.print("							");
		for(i=1;i<week;i++)
			System.out.print("	");

		for(i=1;i<=cal.getActualMaximum(Calendar.DATE);i++){

			System.out.printf("\t%2d",i);

			week++;

			if(week%7==1) {				
				System.out.println();				
				System.out.println();
				System.out.print("							");				
			}
		}
		if(week%7!=1) {			
			System.out.println();

		}
		System.out.println("								��������������������������������������������������");
		System.out.println("\n");
	}

	//�����ߺ�Ȯ��
	public int BookingTime() {

		BookingDAO dao = new BookingDAO();

		List<BookingDTO> lists = dao.getList();

		Iterator<BookingDTO> it = lists.iterator();

		int result = 1;
		while(it.hasNext()) {
			BookingDTO dto = it.next();
			int ppno = dto.getPno();		

			if(ppno!=0) {				
				bks.pp[ppno-1] = "��";
			}else {
				bks.pp[ppno-1] = "  ";
			}
			if(ppno==pno){
				result = 0;
				break;
			}		
		}
		return result;
	}

	//��ü����Ʈ
	public void getBooking() {

		BookingDAO dao = new BookingDAO();

		List<BookingDTO> lists = dao.getList();

		Iterator<BookingDTO> it = lists.iterator();

		while(it.hasNext()) {
			BookingDTO dto = it.next();
			System.out.println(dto.booking());

		}
	}

	//�� ���ฮ��Ʈ
	public void getMyBooking(){
		char ch=0;
		BookingDAO dao = new BookingDAO();

		List<BookingDTO> lists = dao.getBooking(logid);

		Iterator<BookingDTO> it = lists.iterator();
		bks.menu1();
		bks.caroom();
		System.out.println();
		if(it.hasNext()) {
			while(it.hasNext()) {
				BookingDTO dto = it.next();
				System.out.println(dto.booking());

			}
		}else {
			bks.menu1();
			bks.caroom();
			System.out.println("\n\n\n");
			System.out.println("										���೻���� �����ϴ�\n");			
		}
	}
}
