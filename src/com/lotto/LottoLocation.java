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

	//�⺻ ������
	public void printStore() { 

		vo.paring();

		System.out.println("\n\n\n\n\n\n\n");

		System.out.println("		��ġ����\n");

		System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
		System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
		System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
		System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
		System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
		System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
		System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
		System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
		System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
		System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
		System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
		System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
		System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
		System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
		System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
		System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
		System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
		System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
		System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
		System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
		System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
		System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
		System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
		System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
		System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
		System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
		System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
		System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
		System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
		System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		System.out.print("		���� �ǸżҸ� �Է��ϼ��� : ");

		vo.setLoca(sc.next());
		
		loca=vo.getLoca();
		
		flag=false;

		System.out.println("\n\n\n");

	}


	//��ġ �Է��� ȭ��(������ ��ġ�� ������� ǥ��, �ǸżҸ� �� �ּ�, �ٽ�or����)
	public void threadMap1(String num) { 

		if(num.equals("1")) {

			System.out.println("\n		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   ��      *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("2")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            ��         %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("3")) {
			
			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println();
			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    ��      *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("4")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%           ��                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("5")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *         ��            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("6")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *      ��        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("7")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                   ��      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("8")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%    ��                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("9")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *      ��                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("10")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888  ��  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("11")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *         *             *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                  ��     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("12")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                    ��       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("13")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@           ��                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();

		}

		if(num.equals("14")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S          ��            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t     *                 ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("15")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                 ��   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("16")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                 ��      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("17")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t     ��                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("18")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::    ��                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("19")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                               ��   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("20")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *             ��    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("21")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *      ��         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("22")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                 ��    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("23")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S    ��                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("24")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@ ��                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("25")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%: ��    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("26")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *           ��  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("27")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X  ��  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("28")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t   ��                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("29")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *    ��         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("30")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:            ��              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("31")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::     ��          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("32")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8 ��                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("33")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%           ��             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                 *       tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("34")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                 ��       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

	}

	//��ġ �Է��� ȭ��(������ ��ġ�� ������� ǥ��, �ǸżҸ� �� �ּ�, �ٽ�or����)
	public void threadMap2(String num) {
		if(num.equals("1")) {

			System.out.println("\n		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   ��      *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("2")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            ��         %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("3")) {
			
			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println();
			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    ��      *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("4")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%           ��                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("5")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *         ��            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("6")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *      ��        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("7")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                   ��      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("8")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%    ��                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("9")) {

			System.out.println();
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *      ��                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("10")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888  ��  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("11")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *         *             *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                  ��     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("12")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                    ��       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("13")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@           ��                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();

		}

		if(num.equals("14")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S          ��            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t     *                 ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("15")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                 ��   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("16")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                 ��      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("17")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t     ��                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("18")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::    ��                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("19")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                               ��   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("20")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *             ��    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("21")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *      ��         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("22")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                 ��    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("23")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S    ��                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("24")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@ ��                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("25")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%: ��    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("26")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *           ��  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("27")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X  ��  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("28")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t   ��                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("29")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *    ��         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("30")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:            ��              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("31")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::     ��          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("32")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8 ��                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("33")) {

			System.out.println();

			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%           ��             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                 *       tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                  *       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

			System.out.println();
		}

		if(num.equals("34")) {

			System.out.println();
			
			System.out.println("		��ġ����\n");

			System.out.println("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
			System.out.print("		��                                                   ;8@8tS                                 ��		");System.out.println();
			System.out.print("		��                                                 8;tt   :%                                ��		");System.out.println();
			System.out.print("		��                            %%SXt:@SSX@tStt@@8888X   *  X%                                ��		");System.out.println();
			System.out.print("		��                           ;%            *             SX                                 ��		");System.out.println();
			System.out.print("		��                           ::     *                   @t                                  ��		");System.out.println();
			System.out.print("		��                          .%                  *      tt:                                  ��		");System.out.println();
			System.out.print("		��                          ;%S           *            %%                                   ��		");System.out.printf("%2d. %10s	",1,vo.getStore()[1]);System.out.printf("%2d. %10s\n",18,vo.getStore()[18]);
			System.out.print("		��                          @8  *                  *   8%      %SS@%                        ��		");System.out.printf("%2d. %10s	",2,vo.getStore()[2]);System.out.printf("%2d. %10s\n",19,vo.getStore()[19]);
			System.out.print("		��                            @t      *                ;;    .8X    t8                      ��		");System.out.printf("%2d. %10s	",3,vo.getStore()[3]);System.out.printf("%2d. %10s\n",20,vo.getStore()[20]);
			System.out.print("		��                            tt:            *          %t@888   *  @S                      ��		");System.out.printf("%2d. %10s	",4,vo.getStore()[4]);System.out.printf("%2d. %10s\n",21,vo.getStore()[21]);
			System.out.print("		��                            %t:                        ;S        8X                       ��		");System.out.printf("%2d. %10s	",5,vo.getStore()[5]);System.out.printf("%2d. %10s\n",22,vo.getStore()[22]);
			System.out.print("		��                           :::      *          *            *  .8%                        ��		");System.out.printf("%2d. %10s	",6,vo.getStore()[6]);System.out.printf("%2d. %10s\n",23,vo.getStore()[23]);
			System.out.print("		��                          ;%%            *                     :;:                        ��		");System.out.printf("%2d. %10s	",7,vo.getStore()[7]);System.out.printf("%2d. %10s\n",24,vo.getStore()[24]);
			System.out.print("		��                         .;%%     *                    *      :;:                         ��		");System.out.printf("%2d. %10s	",8,vo.getStore()[8]);System.out.printf("%2d. %10s\n",25,vo.getStore()[25]);
			System.out.print("		��                         XS;                                  tX                          ��		");System.out.printf("%2d. %10s	",9,vo.getStore()[9]);System.out.printf("%2d. %10s\n",26,vo.getStore()[26]);
			System.out.print("		��                        %:                   *       *        X                           ��		");System.out.printf("%2d. %10s	",10,vo.getStore()[10]);System.out.printf("%2d. %10s\n",27,vo.getStore()[27]);
			System.out.print("		��                       ttt    *       *                       8                           ��		");System.out.printf("%2d. %10s	",11,vo.getStore()[11]);System.out.printf("%2d. %10s\n",28,vo.getStore()[28]);
			System.out.print("		��                      t;;                                *   S@                           ��		");System.out.printf("%2d. %10s	",12,vo.getStore()[12]);System.out.printf("%2d. %10s\n",29,vo.getStore()[29]);
			System.out.print("		��                     tt;                 ��       *         @%                            ��		");System.out.printf("%2d. %10s	",13,vo.getStore()[13]);System.out.printf("%2d. %10s\n",30,vo.getStore()[30]);
			System.out.print("		��                    ;;t    *                              .:.;                            ��		");System.out.printf("%2d. %10s	",14,vo.getStore()[14]);System.out.printf("%2d. %10s\n",31,vo.getStore()[31]);
			System.out.print("		��                    @@            *                  *    @S%                             ��		");System.out.printf("%2d. %10s	",15,vo.getStore()[15]);System.out.printf("%2d. %10s\n",32,vo.getStore()[32]);
			System.out.print("		��                   S8                   *     *         @XX                               ��		");System.out.printf("%2d. %10s	",16,vo.getStore()[16]);System.out.printf("%2d. %10s\n",33,vo.getStore()[33]);
			System.out.print("		��                  8@  *                               ;:8                                 ��		");System.out.printf("%2d. %10s	",17,vo.getStore()[17]);System.out.printf("%2d. %10s\n",34,vo.getStore()[34]);
			System.out.print("		��                 %t:             *              *    8@;                                  ��		");System.out.println();
			System.out.print("		��                ;;S     *                         ;88;                                    ��		");System.out.println();
			System.out.print("		��                %X8                     *       @.;                                       ��		");System.out.println();
			System.out.print("		��                 t888S:                      :@88@                                        ��		");System.out.println();
			System.out.print("		��                    :S8888@X%:  *    ;%S%%X888;                                           ��		");System.out.println();
			System.out.print("		��                           :;S@XXXX%t%%;                                                  ��		");System.out.println();
			System.out.print("		 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

			System.out.print("\n		���� �ǸżҸ� �Է��ϼ��� : "+num);
			System.out.print("\n		���� �Ǹż� : "+vo.getStore()[Integer.parseInt(vo.getLoca())]);
			System.out.print("\n		�ּ� : "+vo.getAddress()[Integer.parseInt(vo.getLoca())]);
			System.out.println("\n");

			System.out.print("		------------------------------------------------��	1. ��ġ �ٽ��Է�	2. ����		��------------------------------------------------ ");

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
