package com.lotto;

import java.util.Calendar;
import java.util.Scanner;

public class LottoHome extends Thread{
	
	Scanner sc=new Scanner(System.in);
	FileCheck fc = new FileCheck();

	//열린상자 메소드
	public void chessOpen() {

		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");	
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW:WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNWWWW:::::WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW:WWWWWWWWWWWWWWWWWWWWWNWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWW:NNWWNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWW:::::WWNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWW:NNWWNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNWWNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWNOl;'','....;cllcccc::ccccccclllllc,..'....'',,,,.,';0WWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWO:'.,:;,',c'.',,,'',,''',,''.':::c:;,','.',;;;;;,';;;kWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWKo,,;;:;,,;l:'';;;;;;;;;;;;;;;,'',,,,,;;'',,,;;;;',c:;dNWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWXc'::,:;,;;lc',;;,,,,,,,,,,,,,,,,;;;;;;;'.',,,,,;',l:,cKWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWXl,::,:;,;;lc',;;,,,,,,,,,,,;;;;;;;;;;;;,.',,,,,;''cc.;OWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWNd,::,;:,;,cc',;;,,,,,,,,,,,,,,,,;;;;;;;;,.';;;;;,.:o'.xWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWO::c,;:,,,:c',;;;,,,,,,,'''''''',,'''',::;...,;;;',oc.lXWWWWWWW;WWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWd,:;;:,,,,:,,,,,,,'''''''''''';,'':c:lk00kl..',,'.cd,:KWWWWWW;;;;;WWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWd,:;;:,,,,:,,,,,,,'''''''''''';,'':c:lk00kl..',,'.cd,:KWWWWWWWW:WWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWo.':;'',:,''.',.:OKKKx;cOocxOOdokOkkkxx0OldOxdOO:.,:cxKNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWo.,;'',c;'..:xkllOKKkoccl,,oxdc:dOkxdooOKxll:;dK0ocxdcldxKWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWO;;,.,c;.';;lddox0K0oo0K0xcxkoolcodoodOKKK0x:':odllox00Ol:dXWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWNd'..',;lk0kolldOKK0o:xOkoodclxxxxxOKKKKOkk0Oocllll:lxddl;,;o0NWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWNd...lOKKKOxocckKKKOdoddx0kclxkkxcdKK00kxdooO0kkO0Oc'lxk0Oc:coKWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWO;;clx0KKK0kk0KKK0kxxddk0K0xoododOK0ooOOOo:xKOxdddox0KOxddO0dlkNWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWK:,llcldOKKKK00KOlokkxc:kKKKKKKKOddkOdodook0KKK0OO00Okkxxxxddc;kWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWW;NWWNl';:cllccokkod0Oooddoox0KKKOdddddxOKKKK0Okxddooollc:::clllol,cKWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWW;;;;;WWk,,:::col:;;;lx0K0OO0KKKK00Oxooooooooolllcccllooddoolllccc:,'xWWNWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWNWWW;WWWWK:';;::;:ooc,;okxxxxddooolllllccllooodl;;ldolc:::::;;;;,,'.:ONNWWWWWWWWWWWWWWWWWWWWM");
		System.out.println("				WWWWWWWWWWWWWWWWNWWWWWWWWNo,::,;::;:lol'.,cllllooodoooolllccccdl..:d;.,;:cc::::c:;';0WWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWk,,;:;,;:;',;...:lcc::::;;;;;;;;;;;,;oc;ll'.:cccc::::cl:;xWWWWWWWWWWWWWWWWWWWWWWWWM");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWK:,;,;:;,,,'...';;;:::cccccc:::::cc:,,;;;,,;cc::::::::;'lXWWWWWWWWWWWWWWWNWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWo,cc;,;:;,,'..:ccc:::;;;;;;;;;:::ccc:::cccc:;;,,,,;::;,kWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWO;;::c;,;:,,,';ccccccccc::::;;;;::ccccccc:::;;;;:::cc,lXWWWWWWWWWWWWWWWWNWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWMXl,:;;::;,;:;';ccc:::;;;;;;;::::::::::;;;;;;;;;;::cc;;kWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWO;';;;,::,,;,;cccccccccc::;;;;;;;;;;;;;;;;;;;;,;:c:'oNWWWWWWWWWWWW;WWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWKx:',,,;::;,;:::;::cc;;;;;::cccc:::;;;;;;;;;;;;:c,;0WWWWWWWWWWW;;;;;WWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNXk:'',,;:,,:::::::::ccccccccccc:;;;;;;:cccllolc:xNWWWWWWWWWNWWW;WWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWNWWWWNOc'.;c,';:;;;;;::::::;;;::clloxkkO0KXXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKdc;..,;,,,,;;::clodk00KXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNOc;clodkO0KXNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.print("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");




	}

	//닫힌상자 메소드
	public void chessClose() {

		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNNNNNNNNNNNNNNNXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNXKKKKKK0000OOOOOOkkkkkxxxkxxxxxxdxxdddddddddoodkKXNNWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWNXKK0000KK0kdooooolllllllllllllllloooooooooooooooooooooolcclx0KXNWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWX0OxxxxxkkO0000kdooooooooooooooooooooooooooooooooooooooooooooc:oO00KNWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWN0xoccllodxxxkO000Oxoloooolooolllllloooooollooloolooooooooooooool:lO000O0NWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWN0xc,:cccccldxxxO0000xolooooooooooooooooooooooooooooooooooooooooodoco000o,l0NWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWXkd;;cccccccloxxxO0000xooooooooooooooooooooooooooooooooooooooooooooc:x00k;.,xNWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWKkdc;::cccccccdxxxO000Odooolllooooooooooooooooooooolllllllllllllllol;o00Oc..,kWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWKxxxdolc:::cccldxxkO000koloooooooollllllllllloooooooooooooooooooolol;cOK0c...:KWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWKkxxxxxxxolcc::lxxxk000OdlooollllllllllcccccccccccccccccccllllllloooldOKOc...'kWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWNOxxxxxxxxxxxdooxxxkO000xccclllllllloooooooodddoldxxxxkkkkkOOOO00000000KO:....dWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWN0xxlldxxxxxxxxxxxxxO0000OOOOO000000000000000K0l,d0000000000OOOOkkkkxxxdl'....dWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWKkxc:llooddxxxxxxxxkO000000OOOOOOOOOOOO0000000x:o000000xollllcccc::::::,....'xWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWXkxl:cllllloodddxxxxdlllllllllllccccccldOOOkkkxooxxxdddl::cccccc;;:::::,....,OWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWN0ko::lllllllllodxxxl::::::::cccccccccclolllllllllllllllllllllol;;::::;'....:KWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWKkd::lllclclllldxxxo:::clllllllloooloooollllllllllllllllllloool;;::::,.....oNWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWXkxc;lllllllllldxxxdc::cllllllllllllllllllllllllllllllllooooooc;;::::'....'kWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWW0kl;clcllllllldxxxdc::cllllllllllllllllllllllllllllllllllllloc,;:::;'....;0WWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWKko;:lllcclllldxxxdc::cooooollllllllllllllllllllllllllllllllo:,::::,.....lNWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWNOd:;clllllllldxxxdc::clooooooooooooooooooooooooooooooooooooo:;::::'....'xWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWNKkdlcc::clllldxxxdc::clolollllllllllllllllllllllllllllcccccc;;:::;'....;0WWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWNK0Okxdolcc:coxxkdc:::lllllllllcccccc:::::::::::::::;;;;;;;;;:::;,.....oNWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWNXxloxxxoloxxkdc::::::::::::::;;;;;;;;;;;;;;;;;;;;;,,,,,'''''......'kWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWO;',:cldxxkkdc::::;;:::::;;;;;;;;;,,,,'''''......................:KWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWN0xoc,.',:cll;,,,,,,''''''.'..'''.......................'',;::cllkNWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWNNWWWWNKOdc;'.................'...........'',;::ccloodxkkkO0KKXNWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXOxoc,'......'',;;:ccllloddxkOO00KXNNWWWWWWWNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNX0kdxxkO00KKXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.print("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

	}

	public void chessClose1() {
		
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXKK0OkkxdooollccloxOKKXNNNWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXKK0OkkkxdooollllooooooooolcccxO00KKKNWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXXK0Okkxdoolllooooooooooooooooooooooolclk00Ol:oONWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXK0OOkxdoolllooooooooooooooooolllolloooooooodocck00Oc.'c0WWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWNX0Okxddolllooooooooooooooooolloooooooooooooooooooooll:ck00x;..,kNWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWNNXKKK00Okxoooooooooooooolllooooooooooooooooooooooollllllolol;lOK0l...,kWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWNX0OkkkkkOO000Okdooollllllooooooooolooooooooooooolllllooooooollc;;x00x,...:KWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWX0xoodddxxxkkO000OxooooooooooooooooooooooooolllloooooollccccllooddxO0Kk;....dWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWXOo::cccclodxxkO0000OdoooooolooooooooollllooooollccccclooddxkO000K00Okkd;....cXWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWN0x:,cccccccloxxxkO0000xollooooooloooooolllcccclloodxxkO0000000Okxdoolc::,....;0WWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWNOd:,cccccccccldxxkO0000xoollooollcccccllloodxkkocx000000Okxdolc:::::::::,....,OWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWNOxoccc::::::ccldxxkO000Odcc::cclloddxkO00000000d;cO00000xc:::cccc:;:::::,....'kWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWKkxkxxddoollccccdxxxO000koodxkO00000000000000000xoxkxddolclllllooc;;::::,.....xWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWNOxxxxxxxxkkxxxdxxxxkO0000000000OkkxddoooxOkkxddoollllloollllllool;;::::,.....dNWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWXkxxddxxxxxxxxxxxxxxkOOOkxxdoolcc:::::cclollllllllllllllllllooooo:,::::,.....oNWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWKkxl:loooddddxxxxxxxxlc:::::::ccccllllooollllllllllllooooollllloc,;:::;.....lNWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWN0kdc:lllllllloooxxxxl:::ccllllolllllllllllllllolllllllllllllllol;;:::;.....lXWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWXOxo:clllllllllldxxxdc::clollllllllllllllllllllllllllllooooooooo:;:::;'....cXWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWXOxl:cllllclllloxxxxo:::clllllllllllllllllloooooooollllllllc:::;;:::;.....cXWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWKkdc:lllllllllldxxxdc::cloooooooooooooooooollllllllc:::::;;;;;;;,,''.....:KWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWN0ko::llclllllloxxxxo:::looooooooollllllllllc::::::;;;;;;;,,''...........cKWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWN0xl;clllcccllldxxxdc::clollllllllllccc:::::;;;;;;;,,''...........';coxOKNWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWNOxc;ccclllllloxxxxl:::clllllcc:::::;;;;:;;;,,''...........';cldk0KNWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWXOdllccccc:cccoxxxdc:::c:::;;;;;;::;;,,,'...........';codk0XNNWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWX0OOkkxxdoolloxxxdl::::;::;;,,,'''...........';cldk0XWWWWWWNWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWNN0l:clloddxxxxo:;;,,,'........'....';cldO0XNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNkc:;,''',;;:;''...........',;codk0XNWWWWWWWWWWWWWWWWWWWWWWWWWMWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXX0Okdol:;,'......';codxO0XWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNXK0OkxxxOKXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.print("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

	}
	
	public void chessClose2() {
		
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWNNXXXXNXNNNNNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWNK0OkxxxkkO0000kxxkOO00KKXXNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWNKOdccclodxxxkO000xooollloooddxkkOOO0KXXXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWNKko;;clcccldxxkO000koooooooooooolllllooodxxxkO00KXXNNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWKkd;;cccccccldxxk000OdllooooooooooooooooooooollllooddxkOO0KXXNWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWMWWWWWWWNOxxoc::ccccccoxxxO000koloolllllllllooooooooooooooooooolllloooodOXNWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWXkxxxxdl:::cccldxxk0000xooooooooooooooooooooollloooooooooooooooc:oOKXWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWKkxxxxxxxoc::cldxxk0000xooooooooooooooooooooooooooooooooooloooool:lOKKNWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWW0xxddxxxxxxdlccdxxkO000xoloooooooooooooooooooooooooooooooooooooool:o000XWNWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWW0xdccddxxxxxxxddxxkO000xoooooooolloooooooooooooooooooooooooooooooolck000KNWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWNOko:cllodxxxxxxxxxkO000xlccc:cccclllooooooolllllllllloooooooooooool:d00OclKWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWNOxl;clllllodxxxxxxk00000OOkxxddooolllccccccccclllooooooloollllllllc:d00O:.cKWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWXOxl:clllllllooxxxxxxxkkOO00000000000OOOkxxddoollllccccccclllooooooc;d00k;..oNWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWXkdc:llllcclllldxxxoc::cclloddxxkkOO00000000Kkcck0OOkxxddoooolllccc;:k00d'..:KWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWXkd::llllllclloxxxxl:::cc::::::::cclox0000000k;:O000000K0K0000Okkxxdx0KO:...:KWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWKko;:lcllllllloxxxxl::clllllllcccccccoddxxxkkxodO00000kdxxkkkOOO0000000o'...cXWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWKkl;clllcclllldxxxoc::cllllllllloooollllllllllooooddddc:::::ccclllooodl,....dNWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWKko::cllllllloxxxxl:::lollllllllllllllllllllllloollllllllccccc:;:::::;'....;0WWWWWWWWWWWWWWM\r\n" + 
				"				WWWWWWWWWWWWWWWWWXOkdlc::clllldxxxdc::coooooolllllllllllllllllllllllllllllllloc;;:::::,....'xNWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWNK0kxdlc:cloxxxxo:::cloooooooolllllllllllllllooooollllllolll:;:::::,.....lXWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWNo:oxxolcoxxxdc:::lllllooooooooooooolllllllllllllllllooooc,;::::,.....cKWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWNd,';cdxxxxxxo:::clllllllllllllllllllooooooolllllllllllll;;::::,.....;0WWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWNNWWX0d:.';ldxkdc::::::::::::::cccccclllllllllllllooooooool:;::::;'....,kWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWNWWWWXkl,.';cc;;;;;;:::;;;;;;;;;;::::::::::::::cccllloool;;:::;'....'xNWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWNKd:'.......'''''',,,,,;;;;;;;;;;;;;;;;;;;;;;::::;;:::;'.....oXWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWNOd:'...............''''....'''''',,,,,,;;;;;;;;::;,.....lXWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNOdc;;,,'''.................................''''.....cKWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWMMMWWWWWWWWWWWWWWWWWWWWWWNNXKK00OOkxxdoollc::;;,,''.......................;0WWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNNXXKK0OOkkxddolllc::;,,,'''.;OWWWWWWWWWWWWWWWWWWWWWWWWW");
		
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.println("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		System.out.print("				WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		
	}

	//메인화면
	public void menu() {

		System.out.println("\n\n		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ-");
		System.out.println("		ㅣ                                                                                                                                             ㅣ");
		System.out.println("		ㅣ                                                                                                                                             ㅣ");
		System.out.println("		ㅣ             $$$$$$$$$$$$$$$$$$$$$                                                                                                           ㅣ");
		System.out.println("		ㅣ             $$$$$$$$$$$$$$$$$$$$$             $$$$\\            $$$$$$$$$$$$\\   $$$$$$$$$$$$$$$$$\\ $$$$$$$$$$$$$$$$$\\    $$$$$$$$$$$$\\       ㅣ");
		System.out.println("		ㅣ             $$                 $$             $$$ ㅣ          $$$        $$$\\   \\ ____$$$  _____ㅣ \\ ____$$$  _____ㅣ  $$$        $$$\\      ㅣ");
		System.out.println("		ㅣ             $$=================$$             $$$ ㅣ         $$$     _____$$$\\        $$$ ㅣ             $$$ ㅣ       $$$     _____$$$\\     ㅣ");
		System.out.println("		ㅣ            $$$                 $$$            $$$ ㅣ         $$$    /     $$$ \\       $$$ ㅣ             $$$ ㅣ       $$$    /     $$$ \\    ㅣ");
		System.out.println("		ㅣ           $$   $$$$$   $$$$$$$   $$           $$$ ㅣ         $$$   /      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$   /      $$$ ㅣ   ㅣ");
		System.out.println("		ㅣ         $$                         $$         $$$ ㅣ         $$$  ㅣ      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$  ㅣ      $$$ ㅣ   ㅣ");
		System.out.println("		ㅣ       $$      $$$$$$$   $$$$$        $$       $$$ ㅣ         $$$  ㅣ      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$  ㅣ      $$$ ㅣ   ㅣ");
		System.out.println("		ㅣ     $$           $      $$$$$          $$     $$$ ㅣ         $$$  ㅣ      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$  ㅣ      $$$ ㅣ   ㅣ");
		System.out.println("		ㅣ    $$           $$$                     $$    $$$ ㅣ         $$$  ㅣ      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$  ㅣ      $$$ ㅣ   ㅣ");
		System.out.println("		ㅣ   $$           $ $ $   $$$$$$$           $$   $$$ ㅣ         $$$  ㅣ      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$  ㅣ      $$$ ㅣ   ㅣ");
		System.out.println("		ㅣ    $$         $  $  $  $  $  $          $$    $$$$$$$$$$$$$$  $$$ ㅣ     $$$  ㅣ      $$$ ㅣ             $$$ ㅣ        $$$ ㅣ     $$$  ㅣ   ㅣ");
		System.out.println("		ㅣ      $$      $   $   $ $$$$$$$        $$      $$$$$$$$$$$$$$\\  $$$$$$$$$$$$   /       $$$ ㅣ             $$$ ㅣ         $$$$$$$$$$$$   /    ㅣ");
		System.out.println("		ㅣ       $$.        $     $  $  $       $$       \\____________ㅣ   \\____________/         \\__ㅣ              \\__ㅣ          \\____________/     ㅣ");
		System.out.println("		ㅣ         $$             $$$$$$$      $$                                                                                                      ㅣ");
		System.out.println("		ㅣ           $$                      $$                                                                                                        ㅣ");
		System.out.println("		ㅣ            $$$$$$$$$$$$$$$$$$$$$$$$                                                                                                         ㅣ");
		System.out.println("		ㅣ                                                                                                                                             ㅣ");
		System.out.println("		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ-");

		Calendar now=Calendar.getInstance();

		int y,m,week;

		y=now.get(Calendar.YEAR);
		m=now.get(Calendar.MONTH);
		week=now.get(Calendar.WEEK_OF_MONTH);

		System.out.println("\n										"+y+"년"+(m+1)+"월"+week+"주차");

		int n= fc.count();
		System.out.println("\n										제"+(n+1)+"회차 복권");

		System.out.println("\n\n		------------------------------------------------ㅣ			Menu			ㅣ------------------------------------------------");

		System.out.println("\n\n				1. 사용설명서					2. 복권 구매					3. 복권 번호 추첨");

		System.out.println("\n\n				4. 당첨확인					5. 회차별 당첨 정보				6. 프로그램 종료");

		System.out.println("\n\n		--------------------------------------------------------------------------------------------------------------------------------------------------");
				
	}

	@Override
	public void run() {//상자플레이

		try {

			for(int i=0;i<6;i++) {
				
				if(i<2) {
					chessClose1();
					sleep(200);
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					
					chessClose2();
					sleep(200);					
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					
					chessClose();
					sleep(1000);
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				} else {
					chessClose1();
					sleep(100);
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");	
					
					chessClose2();
					sleep(100);
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

