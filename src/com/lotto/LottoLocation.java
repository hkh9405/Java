package com.lotto;

import java.util.Scanner;

public class LottoLocation extends Thread{

	LottoVO vo=new LottoVO();

	Scanner sc=new Scanner(System.in);
	
	private boolean flag;
	
	private String loca;
	
	public boolean isFlag() {
		return flag;
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getLoca() {
		return loca;
	}

	//기본 지도만
	public void printStore() { 

		vo.paring();

		System.out.println("\n\n\n\n\n\n\n");

		System.out.println("		위치선정\n");

		System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
		System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
		System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
		System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
		System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
		System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
		System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
		System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
		System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
		System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
		System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
		System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
		System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
		System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
		System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
		System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
		System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
		System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
		System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
		System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
		System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
		System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
		System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
		System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
		System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
		System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
		System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
		System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
		System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
		System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		System.out.print("		현재 판매소를 입력하세요 : ");

		vo.setLoca(sc.next());
		
		loca=vo.getLoca();
		
		flag=false;

		System.out.println("\n\n\n");

	}


	//위치 입력후 화면(지도상 위치★ 스레드로 표시, 판매소명 및 주소, 다시or다음)
	public void threadMap1(String num) { 

		if(num.equals("1")) {

			System.out.println("\n		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   ★      *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("2")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            ★         %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("3")) {
			
			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println();
			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    ★      *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("4")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%           ★                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("5")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *         ★            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("6")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *      ★        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("7")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                   ★      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("8")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%    ★                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("9")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *      ★                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("10")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888  ★  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("11")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *         *             *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                  ★     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("12")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                    ★       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("13")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@           ★                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();

		}

		if(num.equals("14")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S          ★            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t     *                 ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("15")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                 ★   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("16")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                 ★      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("17")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t     ★                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("18")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::    ★                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("19")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                               ★   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("20")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *             ★    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("21")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *      ★         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("22")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                 ★    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("23")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S    ★                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("24")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@ ★                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("25")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%: ★    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("26")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *           ★  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("27")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X  ★  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("28")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t   ★                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("29")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *    ★         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("30")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:            ★              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("31")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::     ★          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("32")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8 ★                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("33")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%           ★             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                 *       tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("34")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                 ★       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

	}

	//위치 입력후 화면(지도상 위치☆ 스레드로 표시, 판매소명 및 주소, 다시or다음)
	public void threadMap2(String num) {
		if(num.equals("1")) {

			System.out.println("\n		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   ☆      *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("2")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            ☆         %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("3")) {
			
			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println();
			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    ☆      *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("4")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%           ☆                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("5")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *         ☆            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("6")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *      ☆        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("7")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                   ☆      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("8")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%    ☆                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("9")) {

			System.out.println();
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *      ☆                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("10")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888  ☆  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("11")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *         *             *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                  ☆     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("12")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                    ☆       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("13")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@           ☆                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();

		}

		if(num.equals("14")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S          ☆            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t     *                 ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("15")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                 ☆   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("16")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                 ☆      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("17")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t     ☆                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("18")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::    ☆                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("19")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                               ☆   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("20")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *             ☆    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("21")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *      ☆         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("22")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                 ☆    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("23")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S    ☆                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("24")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@ ☆                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("25")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%: ☆    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("26")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *           ☆  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("27")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X  ☆  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("28")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t   ☆                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("29")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *    ☆         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("30")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:            ☆              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("31")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::     ☆          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("32")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8 ☆                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("33")) {

			System.out.println();

			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%           ☆             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                 *       tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                  *       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("34")) {

			System.out.println();
			
			System.out.println("		위치선정\n");

			System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			System.out.print("		ㅣ                                                   ;8@8tS                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                                                 8;tt   :%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                            %%SXt:@SSX@tStt@@8888X   *  X%                                ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ;%            *             SX                                 ㅣ		");System.out.println();
			System.out.print("		ㅣ                           ::     *                   @t                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          .%                  *      tt:                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                          ;%S           *            %%                                   ㅣ		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		ㅣ                          @8  *                  *   8%      %SS@%                        ㅣ		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		ㅣ                            @t      *                ;;    .8X    t8                      ㅣ		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		ㅣ                            tt:            *          %t@888   *  @S                      ㅣ		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		ㅣ                            %t:                        ;S        8X                       ㅣ		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		ㅣ                           :::      *          *            *  .8%                        ㅣ		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		ㅣ                          ;%%            *                     :;:                        ㅣ		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		ㅣ                         .;%%     *                    *      :;:                         ㅣ		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		ㅣ                         XS;                                  tX                          ㅣ		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		ㅣ                        %:                   *       *        X                           ㅣ		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		ㅣ                       ttt    *       *                       8                           ㅣ		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		ㅣ                      t;;                                *   S@                           ㅣ		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		ㅣ                     tt;                 ☆       *         @%                            ㅣ		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		ㅣ                    ;;t    *                              .:.;                            ㅣ		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		ㅣ                    @@            *                  *    @S%                             ㅣ		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		ㅣ                   S8                   *     *         @XX                               ㅣ		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		ㅣ                  8@  *                               ;:8                                 ㅣ		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		ㅣ                 %t:             *              *    8@;                                  ㅣ		");System.out.println();
			System.out.print("		ㅣ                ;;S     *                         ;88;                                    ㅣ		");System.out.println();
			System.out.print("		ㅣ                %X8                     *       @.;                                       ㅣ		");System.out.println();
			System.out.print("		ㅣ                 t888S:                      :@88@                                        ㅣ		");System.out.println();
			System.out.print("		ㅣ                    :S8888@X%:  *    ;%S%%X888;                                           ㅣ		");System.out.println();
			System.out.print("		ㅣ                           :;S@XXXX%t%%;                                                  ㅣ		");System.out.println();
			System.out.print("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("\n		현재 판매소를 입력하세요 : "+num);
			System.out.print("\n		현재 판매소 : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		주소 : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------ㅣ	1. 위치 다시입력	2. 다음		ㅣ------------------------------------------------ ");

			System.out.println();
		}

	}

	@Override
	public void run() {
		try {
			while(flag==false) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				threadMap1(vo.getLoca());
				sleep(500);

				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");	
				threadMap2(vo.getLoca());
				sleep(500);
			}
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			threadMap1(vo.getLoca());
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
