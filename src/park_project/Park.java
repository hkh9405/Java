package park_project;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Park {
	
	Scanner sc = new Scanner(System.in);
	ParkDAO dao=new ParkDAO();
	ParkPay pp = new ParkPay();
	ParkMem pm = new ParkMem();
	public String logid;	
	
	//������ ���� ���ϱ�
	public void setNo() {
		
		System.out.println("							                                                                 ");
		System.out.println("							     ____      ___   ___  __   _____     _____  ___  __    __   \r\n" + 
				"							    6MMMMb.  6MMMMb  `MM 6MM  6MMMMMb   6MMMMMb `MM 6MMb  6MMb  \r\n" + 
				"							   6M'   Mb 8M'  `Mb  MM69 \" 6M'   `Mb 6M'   `Mb MM69 `MM69 `Mb \r\n" + 
				"							   MM    `'     ,oMM  MM'    MM     MM MM     MM MM'   MM'   MM \r\n" + 
				"							   MM       ,6MM9'MM  MM     MM     MM MM     MM MM    MM    MM \r\n" + 
				"							   MM       MM'   MM  MM     MM     MM MM     MM MM    MM    MM \r\n" + 
				"							   YM.   d9 MM.  ,MM  MM     YM.   ,M9 YM.   ,M9 MM    MM    MM \r\n" + 
				"							    YMMMM9  `YMMM9'Yb_MM_     YMMMMM9   YMMMMM9 _MM_  _MM_  _MM_           ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println();
		System.out.println();
		System.out.println("\n\n\n\n\n");
		System.out.print("									1. �����ϱ�	         2. ���    ");
		System.out.print("\n\n\n\n										       ");
		
	}

	//���� �� ��볻�� �����ֱ�
	public void usedList() {
		dao.update(logid);
		BookingDTO dto=dao.pay(logid);		
		
		System.out.println("							                                                                 ");
		System.out.println("							     ____      ___   ___  __   _____     _____  ___  __    __   \r\n" + 
				"							    6MMMMb.  6MMMMb  `MM 6MM  6MMMMMb   6MMMMMb `MM 6MMb  6MMb  \r\n" + 
				"							   6M'   Mb 8M'  `Mb  MM69 \" 6M'   `Mb 6M'   `Mb MM69 `MM69 `Mb \r\n" + 
				"							   MM    `'     ,oMM  MM'    MM     MM MM     MM MM'   MM'   MM \r\n" + 
				"							   MM       ,6MM9'MM  MM     MM     MM MM     MM MM    MM    MM \r\n" + 
				"							   MM       MM'   MM  MM     MM     MM MM     MM MM    MM    MM \r\n" + 
				"							   YM.   d9 MM.  ,MM  MM     YM.   ,M9 YM.   ,M9 MM    MM    MM \r\n" + 
				"							    YMMMM9  `YMMM9'Yb_MM_     YMMMMM9   YMMMMM9 _MM_  _MM_  _MM_           ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							              ���̵�    :       "+dto.getLogid());
		System.out.println("							                                                                 ");
		System.out.println("							              ������    :       "+dto.getStartdate());
		System.out.println("							                                                                 ");
		System.out.println("							              ������    :       "+dto.getEnddate());
		System.out.println("							                                                                 ");
		System.out.println("							              �̿�ð�  :       "+dto.getUsedtime());
		System.out.println("							                                                                 ");
		System.out.println("							              �����ݾ�  :       "+dto.getCost());
		System.out.println();
		System.out.println();
		System.out.println("\n\n\n\n\n");
		System.out.print("									1. �����ϱ�	         2. ���    ");
		System.out.print("\n\n\n\n										       ");

	}
	
}