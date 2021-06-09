package park_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParkMem {

	Scanner sc=new Scanner(System.in);
	ParkMemDAO dao=new ParkMemDAO();
	String logid;
	String logpwd;
	String pwdCheck;
	String welname;

	public void agreement() { //���Ե���
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
		System.out.println("							     ȸ������ ����                                                ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							     �� �̿���                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							      �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�    ");
		System.out.println("							     �ӿ������� ȯ���մϴ�.                                  ��   ");
		System.out.println("							     ��ī�� ���� �� ��ǰ�� �̿��� �ּż� �����մϴ�. �� �� ��   ");
		System.out.println("							     �Ӱ��� �پ��� ī�� ������ �̿�� �����Ͽ� ī�� ���� ��   ");
		System.out.println("							     �Ӹ� �����ϴ� ī��� �̸� �̿��ϴ� ī�� ���� ȸ�� �Ǵ¤�   ");
		System.out.println("							     �Ӻ�ȸ������ ���踦 �����ϸ�, �������� ī�� ���� �̿� ��   ");
		System.out.println("							     �ӿ� ������ �� �� �ִ� ������ ������ �����ϰ� �ֽ��ϴ�  ��   ");
		System.out.println("							      �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�    ");
		System.out.println("							                                                                 ");
		System.out.println("							     �� �������� ���� �� �̿뵿��                                ");
		System.out.println("							                                                                 ");;
		System.out.println("							      �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�    ");
		System.out.println("							     �Ӱ���������ȣ���� ���� ī�뿡 ȸ������ ��û�Ͻô� �в� ��   ");
		System.out.println("							     �Ӽ����ϴ� ���������� �׸�, ���������� ���� �� �̿����,��   ");
		System.out.println("							     �Ӱ��������� ���� �� �̿�Ⱓ, ���� �źα� �� ���� �ź� ��   ");
		System.out.println("							     �ӽ� �����Ϳ� ���� ������ �ȳ� �帮���� �ڼ��� ���� ��  ��   ");
		System.out.println("							     �ӵ����Ͽ� �ֽñ� �ٶ��ϴ�                              ��   ");
		System.out.println("							      �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�    ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");	
		System.out.println("							                 1. ��ü ����            2. ���                  ");
		System.out.println("							                                                                 ");
		System.out.print("											");
	}

	public ParkMemDTO membership() { //ȸ������
		ParkMemDTO dto=new ParkMemDTO();

		try {
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

			while(true) {
				System.out.print("							           ���̵�          : ");dto.setId(sc.next());
				char a = 0;
				for(int i=0;i<dto.getId().length();i++) {
					a=dto.getId().charAt(i);

					if((a<'a' && a>'z') || (a<'A' && a>'Z') || (a<'1' && a>'9')) {
						break;
					}
				}

				if(dto.getId().length()<5 || dto.getId().length()>10) {
					System.out.println("							���̵�� 5~10�ڸ� �̳��� �����Ͽ� �ּ���.");
				} else if((a<'a' && a>'z') || (a<'A' && a>'Z') || (a<'1' && a>'9')) {
					System.out.println("							���� ��ҹ��ڿ� ���ڸ� �Է����ּ���.");
				} else {
					System.out.println();break;
				}
			}

			while(true) {
				System.out.print("							           ��й�ȣ        : ");dto.setPwd(sc.next());
				char ch=0;
				int count=0;
				for(int i=0;i<dto.getPwd().length();i++) {
					ch=dto.getPwd().charAt(i);

					if(ch>='1' && ch<='9') {
						count++;
					}
				}

				for(int i=0;i<dto.getPwd().length();i++) {
					ch=dto.getPwd().charAt(i);

					if((ch<'a' && ch>'z') || (ch<'A' && ch>'Z') || (ch<'1' && ch>'9')) {
						break;
					}
				}

				if(count<1) {
					System.out.println("							��й�ȣ�� �ݵ�� �Ѱ� �̻��� ���ڸ� �����ؾ� �մϴ�");
				} else if((ch<'a' && ch>'z') || (ch<'A' && ch>'Z') || (ch<'1' && ch>'9')) {
					System.out.println("							���� ��ҹ��ڿ� ���ڸ� �Է����ּ���.");
				} else System.out.println();break;
			}

			while(true) {
				System.out.print("							           ��й�ȣ ��Ȯ�� : ");pwdCheck=sc.next();
				if(pwdCheck.equals(dto.getPwd())) {
					System.out.println();break;
				} else {
					System.out.println("							�Է��Ͻ� ��й�ȣ�� �ٸ��ϴ�");
				}
			}

			System.out.print("							           �̸�            : ");dto.setName(sc.next());
			welname=dto.getName();
			System.out.println("							                                                                 ");

			while(true) {
				System.out.print("							           ����[1.�� 2.��] : ");dto.setSex(sc.nextInt());
				if(dto.getSex().equals("��") || dto.getSex().equals("��")) {
					System.out.println();break;
				} else {
					System.out.println("							���ڴ� 1 ���ڴ� 2�� �Է��� �ּ���");
				}
			}

			System.out.print("							           �������        : ");dto.setBirth(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							           Tel             : ");dto.setTel(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							           �ּ�            : ");dto.setAddr(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							           ������ȣ        : ");dto.setCarnum(sc.next());
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                    1. �����ϱ�        2. ���                   ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("											");
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է°����մϴ�");
		} catch(Exception e2) {
			System.out.println(e2);
		}

		return dto;
	}

	public void welcome() { //����Ȯ�� ȭ��

		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println(""+
				"							  .............................................................\r\n"+
				"							  :                                                           :\r\n"+
				"							  :     #      # ###### #       ####   ####  #    # ######    :\r\n" + 
				"							  :     #      # #      #      #    # #    # ##  ## #         :\r\n" + 
				"							  :     #      # #####  #      #      #    # # ## # #         :\r\n" + 
				"							  :     #  ##  # #      #      #      #    # #    # #####     :\r\n" + 
				"							  :     # #  # # #      #      #    # #    # #    # #         :\r\n" + 
				"							  :     ##    ## ###### ######  ####   ####  #    # ######    :\r\n" +
				"							  :                                                           :\r\n"+
				"							  :...........................................................:");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                       �ݰ����ϴ� "+welname+"��                       ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");;
		System.out.println("							                    ȸ�������� �Ϸ�Ǿ����ϴ�!                   ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                      1. Ȯ��      2. �α���                     ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.print("											");
	}

	public void loginError() { //�α��� ����
		try {

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
			System.out.println("							              ���̵�    :       ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							              ��й�ȣ  :       ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("									      _                 _       ");
			System.out.println("									     | |               (_)      ");
			System.out.println("									     | |     ___   __ _ _ _ __  ");
			System.out.println("									     | |    / _ \\ / _` | | '_ \\ ");
			System.out.println("									     | |___| (_) | (_| | | | | |");
			System.out.println("									     \\_____/\\___/ \\__, |_|_| |_|");
			System.out.println("									                   __/ |        ");
			System.out.println("									                  |___/ ");	
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							              ���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�           ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                            1. Ȯ��                              ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");	
			System.out.print("											");		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertId() { //���̵� �Է�
		try {

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
			System.out.println("							              ���̵�    :       ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							              ��й�ȣ  :       ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("									      _                 _       ");
			System.out.println("									     | |               (_)      ");
			System.out.println("									     | |     ___   __ _ _ _ __  ");
			System.out.println("									     | |    / _ \\ / _` | | '_ \\ ");
			System.out.println("									     | |___| (_) | (_| | | | | |");
			System.out.println("									     \\_____/\\___/ \\__, |_|_| |_|");
			System.out.println("									                   __/ |        ");
			System.out.println("									                  |___/ ");		
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							               1. ���̵�/��й�ȣ �Է�   2. ���̵� ã��          ");
			System.out.println("							                                                                 ");
			System.out.println("							               3. ��й�ȣ ã��          4. ���                        ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("										���̵� �Է� : ");

			logid=sc.next();		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertPwd() { //��й�ȣ �Է�
		try {

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
			System.out.println("							              ���̵�    :       "+logid);
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							              ��й�ȣ  :       ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("									      _                 _       ");
			System.out.println("									     | |               (_)      ");
			System.out.println("									     | |     ___   __ _ _ _ __  ");
			System.out.println("									     | |    / _ \\ / _` | | '_ \\ ");
			System.out.println("									     | |___| (_) | (_| | | | | |");
			System.out.println("									     \\_____/\\___/ \\__, |_|_| |_|");
			System.out.println("									                   __/ |        ");
			System.out.println("									                  |___/ ");	
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							               1. ���̵�/��й�ȣ �Է�   2. ���̵� ã��          ");
			System.out.println("							                                                                 ");
			System.out.println("							               3. ��й�ȣ ã��          4. ���                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("										��й�ȣ �Է� : ");

			logpwd=sc.next();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void findId() { //���̵� ã��
		ParkMemDTO dto=new ParkMemDTO();

		try {

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
			System.out.print("							              �̸�      :       ");String name=sc.next();
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("							              ����⵵  :       ");String birth=sc.next();
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");

			dto=dao.findID(name, birth);
			if(dto!=null) {
				System.out.println("							               "+name+"���� ���̵�� "+dto.getId()+" �Դϴ�");
			} else {
				System.out.println("							            �Է��Ͻ� ������ ��ġ�ϴ� ���̵� �����ϴ�");
			}


			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                            1. Ȯ��                              ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("											");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void findPwd() { //��й�ȣ ã��
		ParkMemDTO dto=new ParkMemDTO();

		try {

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
			System.out.print("							              ���̵�    :       ");String id=sc.next();
			System.out.println("							                                                                 ");
			System.out.print("							              �̸�      :       ");String name=sc.next();
			System.out.println("							                                                                 ");
			System.out.print("							              ����⵵  :       ");String birth=sc.next();
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");

			dto=dao.findPwd(id, name, birth);
			if(dto!=null) {
				System.out.println("							               "+name+"���� ��й�ȣ�� "+dto.getPwd()+" �Դϴ�");
			} else {
				System.out.println("							            �Է��Ͻ� ������ ��ġ�ϴ� ��й�ȣ�� �����ϴ�");
			}


			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                            1. Ȯ��                              ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("											");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getInfo() { //������
		try {
			ParkMemDTO dto=dao.getInfo(logid);
			BookingDTO bdto=dao.bookingInfo(logid);
			
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							caroom �� ����                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							   �� ȸ������                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                 ���̵�       "+dto.getId());
			System.out.println("							      ,///rrrr//|Nv,                                             ");
			System.out.println("							    /|rrrr/^^^^\"//rrN,           ��й�ȣ     "+dto.getPwd());
			System.out.println("							   /rrrrr       `rrrrrj                                          ");
			System.out.println("							  /rrrrr|        |rrrrrI         �̸�         "+dto.getName());
			System.out.println("							  rrrrrr|        /rrrrr|                                         ");
			System.out.println("							  |rrrrrrj      /rrrrrr|         ����         "+dto.getSex2());
			System.out.println("							  `rrrrrrr|    |rrrrrr|          �������     "+dto.getBirth());
			System.out.println("							    |rr|k^      \"<|rr/           Tel          "+dto.getTel());
			System.out.println("							                                 �ּ�         "+dto.getAddr());
			System.out.println("							         �� ������               ����ȣ       "+dto.getCarnum());
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");		
			System.out.println("							                                                                 ");
			System.out.println("							   �� ������Ȳ                                                      ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							       "+bdto.getNo()+".      "+bdto.getStartdate()+"      "+bdto.getPno()+"�� �ڸ�");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							             1. ȸ������ ����          2. ���                   ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("											");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void updateInfo() {
		ParkMemDTO dto=new ParkMemDTO();

		try {

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
			System.out.print("							              ��й�ȣ  :       ");dto.setPwd(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							              Tel       :       ");dto.setTel(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							              �ּ�      :       ");dto.setAddr(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							              ����ȣ    :       ");dto.setCarnum(sc.next());
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");

			int result=dao.updateInfo(logid);
			if (result!=0) {
				System.out.println("							                    ȸ�������� �����Ǿ����ϴ�                ");
			} else {
				System.out.println("							                  ȸ������ ������ �����Ͽ����ϴ�             ");
			}
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                            1. Ȯ��                              ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("											");


		} catch (Exception e) {
			System.out.println(e);
		}
	}

}