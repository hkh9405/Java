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

	public void agreement() { //가입동의
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
		System.out.println("							     회원가입 동의                                                ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							     ◎ 이용약관                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							      ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ    ");
		System.out.println("							     ㅣ여러분을 환영합니다.                                  ㅣ   ");
		System.out.println("							     ㅣ카룸 서비스 및 제품을 이용해 주셔서 감사합니다. 본 약 ㅣ   ");
		System.out.println("							     ㅣ관은 다양한 카룸 서비스의 이용과 관련하여 카룸 서비스 ㅣ   ");
		System.out.println("							     ㅣ를 제공하는 카룸과 이를 이용하는 카룸 서비스 회원 또는ㅣ   ");
		System.out.println("							     ㅣ비회원과의 관계를 설명하며, 여러분의 카룸 서비스 이용 ㅣ   ");
		System.out.println("							     ㅣ에 도움이 될 수 있는 유익한 정보를 포함하고 있습니다  ㅣ   ");
		System.out.println("							      ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ    ");
		System.out.println("							                                                                 ");
		System.out.println("							     ◎ 개인정보 수집 및 이용동의                                ");
		System.out.println("							                                                                 ");;
		System.out.println("							      ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ    ");
		System.out.println("							     ㅣ개인정보보호법에 따라 카룸에 회원가입 신청하시는 분께 ㅣ   ");
		System.out.println("							     ㅣ수집하는 개인정보의 항목, 개인정보의 수집 및 이용목적,ㅣ   ");
		System.out.println("							     ㅣ개인정보의 보유 및 이용기간, 등의 거부권 및 동의 거부 ㅣ   ");
		System.out.println("							     ㅣ시 불이익에 관한 사항을 안내 드리오니 자세히 읽은 후  ㅣ   ");
		System.out.println("							     ㅣ동의하여 주시기 바랍니다                              ㅣ   ");
		System.out.println("							      ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ    ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");	
		System.out.println("							                 1. 전체 동의            2. 취소                  ");
		System.out.println("							                                                                 ");
		System.out.print("											");
	}

	public ParkMemDTO membership() { //회원가입
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
				System.out.print("							           아이디          : ");dto.setId(sc.next());
				char a = 0;
				for(int i=0;i<dto.getId().length();i++) {
					a=dto.getId().charAt(i);

					if((a<'a' && a>'z') || (a<'A' && a>'Z') || (a<'1' && a>'9')) {
						break;
					}
				}

				if(dto.getId().length()<5 || dto.getId().length()>10) {
					System.out.println("							아이디는 5~10자리 이내로 생성하여 주세요.");
				} else if((a<'a' && a>'z') || (a<'A' && a>'Z') || (a<'1' && a>'9')) {
					System.out.println("							영어 대소문자와 숫자만 입력해주세요.");
				} else {
					System.out.println();break;
				}
			}

			while(true) {
				System.out.print("							           비밀번호        : ");dto.setPwd(sc.next());
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
					System.out.println("							비밀번호는 반드시 한개 이상의 숫자를 포함해야 합니다");
				} else if((ch<'a' && ch>'z') || (ch<'A' && ch>'Z') || (ch<'1' && ch>'9')) {
					System.out.println("							영어 대소문자와 숫자만 입력해주세요.");
				} else System.out.println();break;
			}

			while(true) {
				System.out.print("							           비밀번호 재확인 : ");pwdCheck=sc.next();
				if(pwdCheck.equals(dto.getPwd())) {
					System.out.println();break;
				} else {
					System.out.println("							입력하신 비밀번호가 다릅니다");
				}
			}

			System.out.print("							           이름            : ");dto.setName(sc.next());
			welname=dto.getName();
			System.out.println("							                                                                 ");

			while(true) {
				System.out.print("							           성별[1.남 2.여] : ");dto.setSex(sc.nextInt());
				if(dto.getSex().equals("남") || dto.getSex().equals("여")) {
					System.out.println();break;
				} else {
					System.out.println("							남자는 1 여자는 2를 입력해 주세요");
				}
			}

			System.out.print("							           생년월일        : ");dto.setBirth(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							           Tel             : ");dto.setTel(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							           주소            : ");dto.setAddr(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							           차량번호        : ");dto.setCarnum(sc.next());
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                    1. 가입하기        2. 취소                   ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("											");
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력가능합니다");
		} catch(Exception e2) {
			System.out.println(e2);
		}

		return dto;
	}

	public void welcome() { //가입확인 화면

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
		System.out.println("							                       반갑습니다 "+welname+"님                       ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");;
		System.out.println("							                    회원가입이 완료되었습니다!                   ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                      1. 확인      2. 로그인                     ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.println("							                                                                 ");
		System.out.print("											");
	}

	public void loginError() { //로그인 실패
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
			System.out.println("							              아이디    :       ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							              비밀번호  :       ");
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
			System.out.println("							              아이디 또는 비밀번호가 일치하지 않습니다           ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                            1. 확인                              ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");	
			System.out.print("											");		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertId() { //아이디 입력
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
			System.out.println("							              아이디    :       ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							              비밀번호  :       ");
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
			System.out.println("							               1. 아이디/비밀번호 입력   2. 아이디 찾기          ");
			System.out.println("							                                                                 ");
			System.out.println("							               3. 비밀번호 찾기          4. 취소                        ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("										아이디 입력 : ");

			logid=sc.next();		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertPwd() { //비밀번호 입력
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
			System.out.println("							              아이디    :       "+logid);
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							              비밀번호  :       ");
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
			System.out.println("							               1. 아이디/비밀번호 입력   2. 아이디 찾기          ");
			System.out.println("							                                                                 ");
			System.out.println("							               3. 비밀번호 찾기          4. 취소                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("										비밀번호 입력 : ");

			logpwd=sc.next();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void findId() { //아이디 찾기
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
			System.out.print("							              이름      :       ");String name=sc.next();
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("							              출생년도  :       ");String birth=sc.next();
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");

			dto=dao.findID(name, birth);
			if(dto!=null) {
				System.out.println("							               "+name+"님의 아이디는 "+dto.getId()+" 입니다");
			} else {
				System.out.println("							            입력하신 정보와 일치하는 아이디가 없습니다");
			}


			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                            1. 확인                              ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("											");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void findPwd() { //비밀번호 찾기
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
			System.out.print("							              아이디    :       ");String id=sc.next();
			System.out.println("							                                                                 ");
			System.out.print("							              이름      :       ");String name=sc.next();
			System.out.println("							                                                                 ");
			System.out.print("							              출생년도  :       ");String birth=sc.next();
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");

			dto=dao.findPwd(id, name, birth);
			if(dto!=null) {
				System.out.println("							               "+name+"님의 비밀번호는 "+dto.getPwd()+" 입니다");
			} else {
				System.out.println("							            입력하신 정보와 일치하는 비밀번호가 없습니다");
			}


			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                            1. 확인                              ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.print("											");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getInfo() { //내정보
		try {
			ParkMemDTO dto=dao.getInfo(logid);
			BookingDTO bdto=dao.bookingInfo(logid);
			
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							caroom 내 정보                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							   ◎ 회원정보                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                 아이디       "+dto.getId());
			System.out.println("							      ,///rrrr//|Nv,                                             ");
			System.out.println("							    /|rrrr/^^^^\"//rrN,           비밀번호     "+dto.getPwd());
			System.out.println("							   /rrrrr       `rrrrrj                                          ");
			System.out.println("							  /rrrrr|        |rrrrrI         이름         "+dto.getName());
			System.out.println("							  rrrrrr|        /rrrrr|                                         ");
			System.out.println("							  |rrrrrrj      /rrrrrr|         성별         "+dto.getSex2());
			System.out.println("							  `rrrrrrr|    |rrrrrr|          생년월일     "+dto.getBirth());
			System.out.println("							    |rr|k^      \"<|rr/           Tel          "+dto.getTel());
			System.out.println("							                                 주소         "+dto.getAddr());
			System.out.println("							         내 프로필               차번호       "+dto.getCarnum());
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");		
			System.out.println("							                                                                 ");
			System.out.println("							   ◎ 예약현황                                                      ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							       "+bdto.getNo()+".      "+bdto.getStartdate()+"      "+bdto.getPno()+"번 자리");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							             1. 회원정보 수정          2. 취소                   ");
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
			System.out.print("							              비밀번호  :       ");dto.setPwd(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							              Tel       :       ");dto.setTel(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							              주소      :       ");dto.setAddr(sc.next());
			System.out.println("							                                                                 ");
			System.out.print("							              차번호    :       ");dto.setCarnum(sc.next());
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");

			int result=dao.updateInfo(logid);
			if (result!=0) {
				System.out.println("							                    회원정보가 수정되었습니다                ");
			} else {
				System.out.println("							                  회원정보 수정에 실패하였습니다             ");
			}
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                                                                 ");
			System.out.println("							                            1. 확인                              ");
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