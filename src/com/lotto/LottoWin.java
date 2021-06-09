package com.lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoWin {

	Scanner sc = new Scanner(System.in);

	int i,j,temp,cnt;
	int[] num1,result;
	int[] num2= {7,18,23,30};
	public int[] getNum2() {
		return num2;
	}

	public void print() {

		try {

			while(true) {

				System.out.print("\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO00000000000000000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000KKKKK0000000000000000000Okxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKKKKKK000000000000000000000Okxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKKKKK00000000000000000000000Okxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000KKKKKKK0000000kdolllldk00000000000Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000KKKK00000000kl'''''''''lk0000000000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO00000000000000000Oc'''''''''''cO0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO000000000000000000k;''''''''''';k0l'''''''''lxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0000000000000000000Ol'''''''''''lOc'''''''''''cxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00l'''''''''l00000OOOo;''''''';o0k;''''''''''';kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00c'''''''''''ck0000000000000000000l'''''''''''lxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k;''''''''''';koxxxxdl:okO0000x:000o;''''''';oxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00l'''''''''''l00000000000o0000d000000000000O0kxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o;''''''';o000000000000lO00l'''''''''l0000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000000000000k000000000000000c'''''''''''c0OOkxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO000000000O0000000000000000k;''''''''''';kOkxxxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000000kl'''''''''l0000000l'''''''''''lOkxxxxxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000Oc'''''''''''c0000000o;''''''';okkxxxxxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk0000k;''''''''''';k00000;0000000000;lxxxxxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00Ol'''''''''''l0000000000000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO00o;''''''';oo000000000000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO000000000000000,000000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO000l'''''''''l000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000Kc'''''''''''c0000000000Okxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKk;''''''''''';k00000000000Okxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKKl'''''''''''l0000000000000Okxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000KKKKKKK0o;''''''';o000k00000000000Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000KKKK0000000000000000000000000000000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0l'''''''''l00000O0000000000000O0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO0c'''''''''''c000000000000000000000000000000xxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0k;''''''''''';k000O00000000000000l'''''''''lxcxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00l'''''''''''l000OOOo00000000000c'''''''''''c;kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l0000o;''''''';ok00000000000000000k;''''''''''';kxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k000000000000;koxxl'''''''''l0x:0l'''''''''''lxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l000000000000000000c'''''''''''cd0000;''''''';okxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o0000000000000k;''''''''''';k0000000000000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000000000000k0000l'''''''''''l000000000000OOkxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO000000000O0000000o;''''''';o00000000000;kOkxxxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000000k0000000000000000000000000000000Okxxxxxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000O0000000000l'''''''''l000000000okkxxxxxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk00000000000000c'''''''''''c00000000;lxxxxxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00O00000000k;''''''''''';k000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO0000000000l'''''''''''l000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO0000000o;''''''';o0000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO00000000000000000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000K00000000000000l'''''''''lxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKk0000000000000c'''''''''''ckxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKK000000000000k;''''''''''';kkxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000l'''''''''l0000000o0l'''''''''''l0Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO0000c'''''''''''c000000000o;''''''';o000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000k;''''''''''';k000000000000O0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO000000l'''''''''''l0000000000000000000000000xxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0k000000o;''''''';oO00l'''''''''l000000000000xcxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO000000000000000000OOOc'''''''''''c00000000000x;kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l000000000000000k00000k;''''''''''';k0000000000xkxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k00000000000000000000l'''''''''''l00000000000xxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00000000000000000000000o;''''''';o00000000000okxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o0l'''''''''l000000000000000k0000000000000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000c'''''''''''c000000000000000000l'''''''''lxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO0k;''''''''''';k0000000000000000c'''''''''''cxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0l'''''''''''l0000000000000000k;''''''''''';kxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO0o;''''''';o000000000000000000l'''''''''''lxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk000000000000000000000000000000o;''''''';oxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00O0000000000000000000000k000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO00000000000000000000000000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO0000000o00000000000000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO00000000000000000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000KKKKK0000000000000000000Okxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKKKKKK000000000000000000000Okxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKKKKK00000000000000000000000Okxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000KKKKKKK0000000kdolllldk00000000000Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000KKKK00000000kl'''''''''lk0000000000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO00000000000000000Oc'''''''''''cO0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO000000000000000000k;''''''''''';k0l'''''''''lxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0000000000000000000Ol'''''''''''lOc'''''''''''cxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00l'''''''''l00000OOOo;''''''';o0k;''''''''''';kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00c'''''''''''ck0000000000000000000l'''''''''''lxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k;''''''''''';koxxxxdl:okO0000x:000o;''''''';oxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00l'''''''''''l00000000000o0000d000000000000O0kxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o;''''''';o000000000000lO00l'''''''''l0000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000000000000k000000000000000c'''''''''''c0OOkxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO000000000O0000000000000000k;''''''''''';kOkxxxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000000kl'''''''''l0000000l'''''''''''lOkxxxxxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000Oc'''''''''''c0000000o;''''''';okkxxxxxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk0000k;''''''''''';k00000;0000000000;lxxxxxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00Ol'''''''''''l0000000000000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO00o;''''''';oo000000000000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO000000000000000,000000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO000l'''''''''l000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000Kc'''''''''''c0000000000Okxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKk;''''''''''';k00000000000Okxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKKl'''''''''''l0000000000000Okxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000KKKKKKK0o;''''''';o000k00000000000Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000KKKK0000000000000000000000000000000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0l'''''''''l00000O0000000000000O0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO0c'''''''''''c000000000000000000000000000000xxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0k;''''''''''';k000O00000000000000l'''''''''lxcxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00l'''''''''''l000OOOo00000000000c'''''''''''c;kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l0000o;''''''';ok00000000000000000k;''''''''''';kxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k000000000000;koxxl'''''''''l0x:0l'''''''''''lxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l000000000000000000c'''''''''''cd0000;''''''';okxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o0000000000000k;''''''''''';k0000000000000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000000000000k0000l'''''''''''l000000000000OOkxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO000000000O0000000o;''''''';o00000000000;kOkxxxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000000k0000000000000000000000000000000Okxxxxxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000O0000000000l'''''''''l000000000okkxxxxxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk00000000000000c'''''''''''c00000000;lxxxxxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00O00000000k;''''''''''';k000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO0000000000l'''''''''''l000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO0000000o;''''''';o0000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO00000000000000000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000K00000000000000l'''''''''lxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKk0000000000000c'''''''''''ckxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKK000000000000k;''''''''''';kkxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000l'''''''''l0000000o0l'''''''''''l0Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO0000c'''''''''''c000000000o;''''''';o000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000k;''''''''''';k000000000000O0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO000000l'''''''''''l0000000000000000000000000xxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0k000000o;''''''';oO00l'''''''''l000000000000xcxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO000000000000000000OOOc'''''''''''c00000000000x;kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l000000000000000k00000k;''''''''''';k0000000000xkxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k00000000000000000000l'''''''''''l00000000000xxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00000000000000000000000o;''''''';o00000000000okxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o0l'''''''''l000000000000000k0000000000000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000c'''''''''''c000000000000000000l'''''''''lxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO0k;''''''''''';k0000000000000000c'''''''''''cxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0l'''''''''''l0000000000000000k;''''''''''';kxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO0o;''''''';o000000000000000000l'''''''''''lxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk000000000000000000000000000000o;''''''';oxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00O0000000000000000000000k000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO00000000000000000000000000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO0000000o00000000000000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO00000000000000000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000KKKKK0000000000000000000Okxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKKKKKK000000000000000000000Okxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKKKKK00000000000000000000000Okxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000KKKKKKK0000000kdolllldk00000000000Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000KKKK00000000kl'''''''''lk0000000000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO00000000000000000Oc'''''''''''cO0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO000000000000000000k;''''''''''';k0l'''''''''lxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0000000000000000000Ol'''''''''''lOc'''''''''''cxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00l'''''''''l00000OOOo;''''''';o0k;''''''''''';kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00c'''''''''''ck0000000000000000000l'''''''''''lxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k;''''''''''';koxxxxdl:okO0000x:000o;''''''';oxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00l'''''''''''l00000000000o0000d000000000000O0kxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o;''''''';o000000000000lO00l'''''''''l0000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000000000000k000000000000000c'''''''''''c0OOkxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO000000000O0000000000000000k;''''''''''';kOkxxxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000000kl'''''''''l0000000l'''''''''''lOkxxxxxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000Oc'''''''''''c0000000o;''''''';okkxxxxxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk0000k;''''''''''';k00000;0000000000;lxxxxxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00Ol'''''''''''l0000000000000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO00o;''''''';oo000000000000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO000000000000000,000000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO000l'''''''''l000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000Kc'''''''''''c0000000000Okxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKk;''''''''''';k00000000000Okxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKKl'''''''''''l0000000000000Okxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000KKKKKKK0o;''''''';o000k00000000000Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000KKKK0000000000000000000000000000000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0l'''''''''l00000O0000000000000O0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO0c'''''''''''c000000000000000000000000000000xxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0k;''''''''''';k000O00000000000000l'''''''''lxcxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00l'''''''''''l000OOOo00000000000c'''''''''''c;kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l0000o;''''''';ok00000000000000000k;''''''''''';kxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k000000000000;koxxl'''''''''l0x:0l'''''''''''lxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l000000000000000000c'''''''''''cd0000;''''''';okxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o0000000000000k;''''''''''';k0000000000000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000000000000k0000l'''''''''''l000000000000OOkxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO000000000O0000000o;''''''';o00000000000;kOkxxxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000000k0000000000000000000000000000000Okxxxxxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000O0000000000l'''''''''l000000000okkxxxxxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk00000000000000c'''''''''''c00000000;lxxxxxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00O00000000k;''''''''''';k000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO0000000000l'''''''''''l000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO0000000o;''''''';o0000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO00000000000000000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000K00000000000000l'''''''''lxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKk0000000000000c'''''''''''ckxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKK000000000000k;''''''''''';kkxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000l'''''''''l0000000o0l'''''''''''l0Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO0000c'''''''''''c000000000o;''''''';o000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000k;''''''''''';k000000000000O0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO000000l'''''''''''l0000000000000000000000000xxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0k000000o;''''''';oO00l'''''''''l000000000000xcxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO000000000000000000OOOc'''''''''''c00000000000x;kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l000000000000000k00000k;''''''''''';k0000000000xkxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k00000000000000000000l'''''''''''l00000000000xxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00000000000000000000000o;''''''';o00000000000okxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o0l'''''''''l000000000000000k0000000000000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000c'''''''''''c000000000000000000l'''''''''lxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO0k;''''''''''';k0000000000000000c'''''''''''cxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0l'''''''''''l0000000000000000k;''''''''''';kxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO0o;''''''';o000000000000000000l'''''''''''lxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk000000000000000000000000000000o;''''''';oxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00O0000000000000000000000k000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO00000000000000000000000000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO0000000o00000000000000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO00000000000000000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000KKKKK0000000000000000000Okxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKKKKKK000000000000000000000Okxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKKKKK00000000000000000000000Okxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000KKKKKKK0000000kdolllldk00000000000Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000KKKK00000000kl'''''''''lk0000000000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO00000000000000000Oc'''''''''''cO0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO000000000000000000k;''''''''''';k0l'''''''''lxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0000000000000000000Ol'''''''''''lOc'''''''''''cxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00l'''''''''l00000OOOo;''''''';o0k;''''''''''';kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00c'''''''''''ck0000000000000000000l'''''''''''lxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k;''''''''''';koxxxxdl:okO0000x:000o;''''''';oxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00l'''''''''''l00000000000o0000d000000000000O0kxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o;''''''';o000000000000lO00l'''''''''l0000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000000000000k000000000000000c'''''''''''c0OOkxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO000000000O0000000000000000k;''''''''''';kOkxxxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000000kl'''''''''l0000000l'''''''''''lOkxxxxxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000Oc'''''''''''c0000000o;''''''';okkxxxxxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk0000k;''''''''''';k00000;0000000000;lxxxxxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00Ol'''''''''''l0000000000000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO00o;''''''';oo000000000000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO000000000000000,000000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO000l'''''''''l000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000Kc'''''''''''c0000000000Okxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKk;''''''''''';k00000000000Okxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKKl'''''''''''l0000000000000Okxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000KKKKKKK0o;''''''';o000k00000000000Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000KKKK0000000000000000000000000000000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0l'''''''''l00000O0000000000000O0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO0c'''''''''''c000000000000000000000000000000xxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0k;''''''''''';k000O00000000000000l'''''''''lxcxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00l'''''''''''l000OOOo00000000000c'''''''''''c;kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l0000o;''''''';ok00000000000000000k;''''''''''';kxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k000000000000;koxxl'''''''''l0x:0l'''''''''''lxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l000000000000000000c'''''''''''cd0000;''''''';okxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o0000000000000k;''''''''''';k0000000000000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000000000000k0000l'''''''''''l000000000000OOkxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO000000000O0000000o;''''''';o00000000000;kOkxxxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000000k0000000000000000000000000000000Okxxxxxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000O0000000000l'''''''''l000000000okkxxxxxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk00000000000000c'''''''''''c00000000;lxxxxxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00O00000000k;''''''''''';k000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO0000000000l'''''''''''l000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO0000000o;''''''';o0000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO00000000000000000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000K00000000000000l'''''''''lxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKk0000000000000c'''''''''''ckxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKK000000000000k;''''''''''';kkxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000l'''''''''l0000000o0l'''''''''''l0Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO0000c'''''''''''c000000000o;''''''';o000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000k;''''''''''';k000000000000O0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO000000l'''''''''''l0000000000000000000000000xxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0k000000o;''''''';oO00l'''''''''l000000000000xcxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO000000000000000000OOOc'''''''''''c00000000000x;kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l000000000000000k00000k;''''''''''';k0000000000xkxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k00000000000000000000l'''''''''''l00000000000xxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00000000000000000000000o;''''''';o00000000000okxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o0l'''''''''l000000000000000k0000000000000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000c'''''''''''c000000000000000000l'''''''''lxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO0k;''''''''''';k0000000000000000c'''''''''''cxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0l'''''''''''l0000000000000000k;''''''''''';kxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO0o;''''''';o000000000000000000l'''''''''''lxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk000000000000000000000000000000o;''''''';oxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00O0000000000000000000000k000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO00000000000000000000000000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO0000000o00000000000000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.print("\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO00000000000000000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000KKKKK0000000000000000000Okxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKKKKKK000000000000000000000Okxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKKKKK00000000000000000000000Okxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000KKKKKKK0000000kdolllldk00000000000Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000KKKK00000000kl'''''''''lk0000000000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO00000000000000000Oc'''''''''''cO0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO000000000000000000k;''''''''''';k0l'''''''''lxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0000000000000000000Ol'''''''''''lOc'''''''''''cxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00l'''''''''l00000OOOo;''''''';o0k;''''''''''';kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00c'''''''''''ck0000000000000000000l'''''''''''lxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k;''''''''''';koxxxxdl:okO0000x:000o;''''''';oxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00l'''''''''''l00000000000o0000d000000000000O0kxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o;''''''';o000000000000lO00l'''''''''l0000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000000000000k000000000000000c'''''''''''c0OOkxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO000000000O0000000000000000k;''''''''''';kOkxxxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000000kl'''''''''l0000000l'''''''''''lOkxxxxxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000Oc'''''''''''c0000000o;''''''';okkxxxxxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk0000k;''''''''''';k00000;0000000000;lxxxxxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00Ol'''''''''''l0000000000000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO00o;''''''';oo000000000000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO000000000000000,000000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO000l'''''''''l000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000Kc'''''''''''c0000000000Okxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKk;''''''''''';k00000000000Okxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKKl'''''''''''l0000000000000Okxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000KKKKKKK0o;''''''';o000k00000000000Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000KKKK0000000000000000000000000000000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0l'''''''''l00000O0000000000000O0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO0c'''''''''''c000000000000000000000000000000xxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0k;''''''''''';k000O00000000000000l'''''''''lxcxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00l'''''''''''l000OOOo00000000000c'''''''''''c;kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l0000o;''''''';ok00000000000000000k;''''''''''';kxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k000000000000;koxxl'''''''''l0x:0l'''''''''''lxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l000000000000000000c'''''''''''cd0000;''''''';okxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o0000000000000k;''''''''''';k0000000000000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000000000000k0000l'''''''''''l000000000000OOkxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO000000000O0000000o;''''''';o00000000000;kOkxxxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000000k0000000000000000000000000000000Okxxxxxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO00000O0000000000l'''''''''l000000000okkxxxxxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk00000000000000c'''''''''''c00000000;lxxxxxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00O00000000k;''''''''''';k000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO0000000000l'''''''''''l000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO0000000o;''''''';o0000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("				oooooooooooooooooooooooooooooooooooooooooooooooooooooollcccccccccclloooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooooodooolcccllloooooooooolllcc:cloooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooooodolcccloxkO00000000000000OOxoc:::looooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooodolc:coxO00000000000000000000000Okdl:::loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooodoodlc:lxO0000K00000000000000l'''''''''lxoc::loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooodoc:lk0000KKKk0000000000000c'''''''''''ckxdc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cx0000KKKKKK000000000000k;''''''''''';kkxxdc;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;oO0000l'''''''''l0000000o0l'''''''''''l0Okxxxl;:oooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO0000c'''''''''''c000000000o;''''''';o000Okxxxl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0000k;''''''''''';k000000000000O0000000000Oxxxxl;:oooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooo:cO000000l'''''''''''l0000000000000000000000000xxxxxc;looooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooc:x0k000000o;''''''';oO00l'''''''''l000000000000xcxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO000000000000000000OOOc'''''''''''c00000000000x;kxxx:;loooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l000000000000000k00000k;''''''''''';k0000000000xkxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodl;l0k00000000000000000000l'''''''''''l00000000000xxxxxxl;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooodo;l00000000000000000000000o;''''''';o00000000000okxxxxxc;coooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooo:cO00o0l'''''''''l000000000000000k0000000000000Oxxxxxd:;loooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodc:d000c'''''''''''c000000000000000000l'''''''''lxxxxxo;:ooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooodo:cO0k;''''''''''';k0000000000000000c'''''''''''cxxxdc;looooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooool;oO0l'''''''''''l0000000000000000k;''''''''''';kxxl;coooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooc;oO0o;''''''';o000000000000000000l'''''''''''lxdl;:ooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooc;lk000000000000000000000000000000o;''''''';oxdc;coooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooool:cxO00O0000000000000000000000k000000:;lxxxdo:;cooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc:lxO00000000000000000000000000000;;ldddoc;:loooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooool::cdOOO0000000o00000000000000000coddl:;:loooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooool:';ldkkxdllc:ooococo,00000cloddl:,';loooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooool;,,;,;;:codddddooooollloooool:;;,,,,,;looooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooo;.';:::;'...'',;;;:::;;;;,,'...';:::;'.;ooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooooooc,',,,,,;;;,,,'''''.....'''',,,;;,,,,',''coooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooool;':::;;,,,,,,,,,,,,,,,,,,,,,,,,,,,,;;:::',looooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooooooooooooooc,;:::::::::::::;;;;;;;;;;;;;::::::::::::;';llllooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooooooooooooool;,::::::::::::::::::::::::::::::::::::::::,':cccccclllllooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooc:cccc:cloo:.','',,;::;,;;;;,;:::::::::::::;,,;,'',:::;',cccccccccccclloooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooool::oxkkxoc;:;,:c:;,,..,,;ldddol;,;:::::::::::,'''''.';;;'..:ccccccccccccclooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo::xOOOOkkxc..;cc::c:;..;dxxxxxdd:';::::::::;;,'.','.......,:ccccccccccclloooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooo;ckkOOOkkkl..;:cccc:;..:dxkkkxxd:..''.................',;:ccccccclllloooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooc;lxkOkkxl;''';::::;'..,cdxxxxdc,.''''''''',,,,,;;::ccllllllloooooooooooooooooooooooooooooooooo");
				System.out.println("				ooooooooooooooooooooooooooc;:cllc:;;c:,''''''';::;::cc:;,;cccccllooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
				System.out.println("				oooooooooooooooooooooooooooolc:::clllccc:::::cccccc::::clllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

				Thread.sleep(200);
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

				break;

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void ball() {

		/*
		Random rd = new Random(); //당첨번호 랜덤생성
		num2 = new int[4];

		while(i<4) {
			num2[i] = rd.nextInt(30) + 1;

			for(j=0;j<i;j++) {

				if(num2[i] == num2[j]) {
					i--; //중복제거
					break;
				}
			}

			for(j=0;j<4;j++) {

				if(num2[i] < num2[j]) {
					temp = num2[i];
					num2[i] = num2[j];
					num2[j] = temp; 
				}
			}

			i++;

		}
		 */

		
		try {
			for(int i=0;i<4;i++) {

				if(num2[i]==1) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■              $$\\           ■□ ");
					System.out.println("								 	□■            $$$$ |          ■□ ");
					System.out.println("									□■            \\_$$ |          ■□ ");
					System.out.println("									□■              $$ |          ■□ ");
					System.out.println("									□■              $$ |          ■□ ");
					System.out.println("									□■              $$ |          ■□ ");
					System.out.println("									□■            $$$$$$\\         ■□ ");
					System.out.println("									□■            \\______|        ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==2) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■           $$$$$$\\          ■□ ");
					System.out.println("									□■          $$  __$$\\         ■□ ");
					System.out.println("									□■          \\__/  $$ |        ■□ ");
					System.out.println("									□■           $$$$$$  |        ■□ ");
					System.out.println("									□■          $$  ____/         ■□ ");
					System.out.println("									□■          $$ |              ■□ ");
					System.out.println("									□■           $$$$$$$$\\        ■□ ");
					System.out.println("									□■           \\________|       ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("								    	      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==3) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■            $$$$$$\\         ■□ ");
					System.out.println("								 	□■           $$ ___$$\\        ■□ ");
					System.out.println("									□■          \\_/   $$ |        ■□ ");
					System.out.println("									□■            $$$$$ /         ■□ ");
					System.out.println("									□■            \\___$$\\         ■□ ");
					System.out.println("									□■          $$\\   $$ |        ■□ ");
					System.out.println("									□■          \\$$$$$$  |        ■□ ");
					System.out.println("									□■           \\______/         ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;	

				} else if(num2[i]==4) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■          $$\\   $$\\         ■□ ");
					System.out.println("								 	□■          $$ |  $$ |        ■□ ");
					System.out.println("									□■          $$ |  $$ |        ■□ ");
					System.out.println("									□■          $$$$$$$$ |        ■□ ");
					System.out.println("									□■          \\_____$$ |        ■□ ");
					System.out.println("									□■                $$ |        ■□ ");
					System.out.println("									□■                $$ |        ■□ ");
					System.out.println("									□■                \\__|        ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==5) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■           $$$$$$$\\         ■□ ");
					System.out.println("								 	□■          $$  ____|         ■□ ");
					System.out.println("									□■          $$ |              ■□ ");
					System.out.println("									□■           $$$$$$$\\         ■□ ");
					System.out.println("									□■          \\_____$$\\         ■□ ");
					System.out.println("									□■          $$\\   $$ |        ■□ ");
					System.out.println("									□■          \\$$$$$$  |        ■□ ");
					System.out.println("									□■           \\______/         ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==6) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■           $$$$$$\\          ■□ ");
					System.out.println("								 	□■          $$  __$$\\         ■□ ");
					System.out.println("									□■          $$ /  \\__|        ■□ ");
					System.out.println("									□■          $$$$$$$\\          ■□ ");
					System.out.println("									□■          $$  __$$\\         ■□ ");
					System.out.println("									□■          $$ /  $$ |        ■□ ");
					System.out.println("									□■           $$$$$$  |        ■□ ");
					System.out.println("									□■           \\______/         ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;	

				} else if(num2[i]==7) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■           $$$$$$$$\\        ■□ ");
					System.out.println("								 	□■          \\____$$  |        ■□ ");
					System.out.println("									□■              $$  /         ■□ ");
					System.out.println("									□■             $$  /          ■□ ");
					System.out.println("									□■            $$  /           ■□ ");
					System.out.println("									□■           $$  /            ■□ ");
					System.out.println("									□■          $$  /             ■□ ");
					System.out.println("									□■          \\__/              ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==8) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■            $$$$$$\\         ■□ ");
					System.out.println("								 	□■           $$  __$$\\        ■□ ");
					System.out.println("									□■          $$ /  $$ |        ■□ ");
					System.out.println("									□■           $$$$$$  |        ■□ ");
					System.out.println("									□■          $$  __$$<         ■□ ");
					System.out.println("									□■          $$ /  $$ |        ■□ ");
					System.out.println("									□■          \\$$$$$$  |        ■□ ");
					System.out.println("									□■           \\______/         ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==9) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■           $$$$$$\\          ■□ ");
					System.out.println("								 	□■          $$  __$$\\         ■□ ");
					System.out.println("									□■          $$ /  $$ |        ■□ ");
					System.out.println("									□■          \\$$$$$$$ |        ■□ ");
					System.out.println("									□■           \\____$$ |        ■□ ");
					System.out.println("									□■          $$\\   $$ |        ■□ ");
					System.out.println("									□■          \\$$$$$$  |        ■□ ");
					System.out.println("									□■           \\______/         ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==10) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■       $$\\      $$$$$$\\     ■□ ");
					System.out.println("								 	□■     $$$$ |    $$$ __$$\\    ■□ ");
					System.out.println("									□■     \\_$$ |    $$$$\\ $$ |   ■□ ");
					System.out.println("									□■       $$ |    $$\\$$\\$$ |   ■□ ");
					System.out.println("									□■       $$ |    $$ \\$$$$ |   ■□ ");
					System.out.println("									□■       $$ |    $$ |\\$$$ |   ■□ ");
					System.out.println("									□■    $$$$$$\\    \\$$$$$$  /   ■□ ");
					System.out.println("									□■    \\______|    \\______/    ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==11) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■        $$\\       $$\\       ■□ ");
					System.out.println("								 	□■      $$$$ |    $$$$ |      ■□ ");
					System.out.println("									□■      \\_$$ |    \\_$$ |      ■□ ");
					System.out.println("									□■        $$ |      $$ |      ■□ ");
					System.out.println("									□■        $$ |      $$ |      ■□ ");
					System.out.println("									□■        $$ |      $$ |      ■□ ");
					System.out.println("									□■     $$$$$$\\    $$$$$$\\     ■□ ");
					System.out.println("									□■     \\______|   \\______|    ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==12) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■      $$\\       $$$$$$\\     ■□ ");
					System.out.println("								 	□■    $$$$ |     $$  __$$\\    ■□ ");
					System.out.println("									□■    \\_$$ |     \\__/  $$ |   ■□ ");
					System.out.println("									□■      $$ |      $$$$$$  |   ■□ ");
					System.out.println("									□■      $$ |     $$  ____/    ■□ ");
					System.out.println("									□■      $$ |     $$ |         ■□ ");
					System.out.println("									□■   $$$$$$\\     $$$$$$$$\\    ■□ ");
					System.out.println("									□■   \\______|    \\________|   ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==13) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■      $$\\       $$$$$$\\     ■□ ");
					System.out.println("								 	□■    $$$$ |     $$ ___$$\\    ■□ ");
					System.out.println("									□■    \\_$$ |    \\_/   $$ |    ■□ ");
					System.out.println("									□■      $$ |       $$$$$ /    ■□ ");
					System.out.println("									□■      $$ |      \\___$$\\     ■□ ");
					System.out.println("									□■      $$ |    $$\\   $$ |    ■□ ");
					System.out.println("									□■   $$$$$$\\    \\$$$$$$  |    ■□ ");
					System.out.println("									□■   \\______|    \\______/     ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==14) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■      $$\\      $$\\   $$\\    ■□ ");
					System.out.println("								 	□■    $$$$ |     $$ |  $$ |   ■□ ");
					System.out.println("									□■    \\_$$ |     $$ |  $$ |   ■□ ");
					System.out.println("									□■      $$ |     $$$$$$$$ |   ■□ ");
					System.out.println("									□■      $$ |     \\_____$$ |   ■□ ");
					System.out.println("									□■      $$ |           $$ |   ■□ ");
					System.out.println("									□■   $$$$$$\\           $$ |   ■□ ");
					System.out.println("									□■   \\______|          \\__|   ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==15) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■      $$\\      $$$$$$$\\     ■□ ");
					System.out.println("								 	□■    $$$$ |     $$  ____|    ■□ ");
					System.out.println("									□■    \\_$$ |     $$ |         ■□ ");
					System.out.println("									□■      $$ |     $$$$$$$\\     ■□ ");
					System.out.println("									□■      $$ |     \\_____$$\\    ■□ ");
					System.out.println("									□■      $$ |     $$\\   $$ |   ■□ ");
					System.out.println("									□■   $$$$$$\\     \\$$$$$$  |   ■□ ");
					System.out.println("									□■   \\______|     \\______/    ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==16) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■      $$\\       $$$$$$\\     ■□ ");
					System.out.println("								 	□■    $$$$ |     $$  __$$\\    ■□ ");
					System.out.println("									□■    \\_$$ |     $$ /  \\__|   ■□ ");
					System.out.println("									□■      $$ |     $$$$$$$\\     ■□ ");
					System.out.println("									□■      $$ |     $$  __$$\\    ■□ ");
					System.out.println("									□■      $$ |     $$ /  $$ |   ■□ ");
					System.out.println("									□■   $$$$$$\\      $$$$$$  |   ■□ ");
					System.out.println("									□■   \\______|     \\______/    ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==17) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■      $$\\      $$$$$$$$\\    ■□ ");
					System.out.println("								 	□■    $$$$ |     \\____$$  |   ■□ ");
					System.out.println("									□■    \\_$$ |         $$  /    ■□ ");
					System.out.println("									□■      $$ |        $$  /     ■□ ");
					System.out.println("									□■      $$ |       $$  /      ■□ ");
					System.out.println("									□■      $$ |      $$  /       ■□ ");
					System.out.println("									□■   $$$$$$\\     $$  /        ■□ ");
					System.out.println("									□■   \\______|    \\__/         ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==18) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■      $$\\       $$$$$$\\     ■□ ");
					System.out.println("								 	□■    $$$$ |     $$  __$$\\    ■□ ");
					System.out.println("									□■    \\_$$ |     $$ /  $$ |   ■□ ");
					System.out.println("									□■      $$ |      $$$$$$  |   ■□ ");
					System.out.println("									□■      $$ |     $$  __$$<    ■□ ");
					System.out.println("									□■      $$ |     $$ /  $$ |   ■□ ");
					System.out.println("									□■   $$$$$$\\     \\$$$$$$  |   ■□ ");
					System.out.println("									□■   \\______|     \\______/    ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==19) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■      $$\\       $$$$$$\\     ■□ ");
					System.out.println("								 	□■    $$$$ |     $$  __$$\\    ■□ ");
					System.out.println("									□■    \\_$$ |     $$ /  $$ |   ■□ ");
					System.out.println("									□■      $$ |     \\$$$$$$$ |   ■□ ");
					System.out.println("									□■      $$ |      \\____$$ |   ■□ ");
					System.out.println("									□■      $$ |     $$\\   $$ |   ■□ ");
					System.out.println("									□■   $$$$$$\\     \\$$$$$$  |   ■□ ");
					System.out.println("									□■   \\______|     \\______/    ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==20) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■    $$$$$$\\     $$$$$$\\     ■□ ");
					System.out.println("								 	□■   $$  __$$\\   $$$ __$$\\    ■□ ");
					System.out.println("									□■   \\__/  $$ |  $$$$\\ $$ |   ■□ ");
					System.out.println("									□■    $$$$$$  |  $$\\$$\\$$ |   ■□ ");
					System.out.println("									□■   $$  ____/   $$ \\$$$$ |   ■□ ");
					System.out.println("									□■   $$ |        $$ |\\$$$ |   ■□ ");
					System.out.println("									□■   $$$$$$$$\\   \\$$$$$$  /   ■□ ");
					System.out.println("									□■   \\________|   \\______/    ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==21) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■     $$$$$$\\       $$\\      ■□ ");
					System.out.println("								 	□■    $$  __$$\\    $$$$ |     ■□ ");
					System.out.println("									□■    \\__/  $$ |   \\_$$ |     ■□ ");
					System.out.println("									□■     $$$$$$  |     $$ |     ■□ ");
					System.out.println("									□■    $$  ____/      $$ |     ■□ ");
					System.out.println("									□■    $$ |           $$ |     ■□ ");
					System.out.println("									□■    $$$$$$$$\\    $$$$$$\\    ■□ ");
					System.out.println("									□■    \\________|   \\______|   ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==22) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■    $$$$$$\\     $$$$$$\\     ■□ ");
					System.out.println("								 	□■   $$  __$$\\   $$  __$$\\    ■□ ");
					System.out.println("									□■   \\__/  $$ |  \\__/  $$ |   ■□ ");
					System.out.println("									□■    $$$$$$  |   $$$$$$  |   ■□ ");
					System.out.println("									□■   $$  ____/   $$  ____/    ■□ ");
					System.out.println("									□■   $$ |        $$ |         ■□ ");
					System.out.println("									□■   $$$$$$$$\\   $$$$$$$$\\    ■□ ");
					System.out.println("									□■   \\________|  \\________|   ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==23) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■    $$$$$$\\      $$$$$$\\    ■□ ");
					System.out.println("								 	□■   $$  __$$\\    $$ ___$$\\   ■□ ");
					System.out.println("									□■   \\__/  $$ |  \\_/   $$ |   ■□ ");
					System.out.println("									□■    $$$$$$  |     $$$$$ /   ■□ ");
					System.out.println("									□■   $$  ____/     \\___$$\\    ■□ ");
					System.out.println("									□■   $$ |        $$\\   $$ |   ■□ ");
					System.out.println("									□■   $$$$$$$$\\   \\$$$$$$  |   ■□ ");
					System.out.println("									□■   \\________|   \\______/    ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==24) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■    $$$$$$\\    $$\\   $$\\    ■□ ");
					System.out.println("								 	□■   $$  __$$\\   $$ |  $$ |   ■□ ");
					System.out.println("									□■   \\__/  $$ |  $$ |  $$ |   ■□ ");
					System.out.println("									□■    $$$$$$  |  $$$$$$$$ |   ■□ ");
					System.out.println("									□■   $$  ____/   \\_____$$ |   ■□ ");
					System.out.println("									□■   $$ |              $$ |   ■□ ");
					System.out.println("									□■   $$$$$$$$\\         $$ |   ■□ ");
					System.out.println("									□■   \\________|        \\__|   ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==25) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■    $$$$$$\\      $$$$$$$\\   ■□ ");
					System.out.println("								 	□■   $$  __$$\\    $$  ____|   ■□ ");
					System.out.println("									□■   \\__/  $$ |   $$ |        ■□ ");
					System.out.println("									□■    $$$$$$  |   $$$$$$$\\    ■□ ");
					System.out.println("									□■   $$  ____/    \\_____$$\\   ■□ ");
					System.out.println("									□■   $$ |         $$\\   $$ |  ■□ ");
					System.out.println("									□■   $$$$$$$$\\    \\$$$$$$  |  ■□ ");
					System.out.println("									□■   \\________|    \\______/   ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==26) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■    $$$$$$\\      $$$$$$\\    ■□ ");
					System.out.println("								 	□■   $$  __$$\\    $$  __$$\\   ■□ ");
					System.out.println("									□■   \\__/  $$ |   $$ /  \\__|  ■□ ");
					System.out.println("									□■    $$$$$$  |   $$$$$$$\\    ■□ ");
					System.out.println("									□■   $$  ____/    $$  __$$\\   ■□ ");
					System.out.println("									□■   $$ |         $$ /  $$ |  ■□ ");
					System.out.println("									□■   $$$$$$$$\\     $$$$$$  |  ■□ ");
					System.out.println("									□■   \\________|    \\______/   ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==27) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■    $$$$$$\\     $$$$$$$$\\   ■□ ");
					System.out.println("								 	□■   $$  __$$\\    \\____$$  |  ■□ ");
					System.out.println("									□■   \\__/  $$ |       $$  /   ■□ ");
					System.out.println("									□■    $$$$$$  |      $$  /    ■□ ");
					System.out.println("									□■   $$  ____/      $$  /     ■□ ");
					System.out.println("									□■   $$ |          $$  /      ■□ ");
					System.out.println("									□■   $$$$$$$$\\    $$  /       ■□ ");
					System.out.println("									□■   \\________|   \\__/        ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==28) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■    $$$$$$\\      $$$$$$\\    ■□ ");
					System.out.println("								 	□■   $$  __$$\\    $$  __$$\\   ■□ ");
					System.out.println("									□■   \\__/  $$ |   $$ /  $$ |  ■□ ");
					System.out.println("									□■    $$$$$$  |    $$$$$$  |  ■□ ");
					System.out.println("									□■   $$  ____/    $$  __$$<   ■□ ");
					System.out.println("									□■   $$ |         $$ /  $$ |  ■□ ");
					System.out.println("									□■   $$$$$$$$\\    \\$$$$$$  |  ■□ ");
					System.out.println("									□■   \\________|    \\______/   ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==29) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■    $$$$$$\\      $$$$$$\\    ■□ ");
					System.out.println("								 	□■   $$  __$$\\    $$  __$$\\   ■□ ");
					System.out.println("									□■   \\__/  $$ |   $$ /  $$ |  ■□ ");
					System.out.println("									□■    $$$$$$  |   \\$$$$$$$ |  ■□ ");
					System.out.println("									□■   $$  ____/     \\____$$ |  ■□ ");
					System.out.println("									□■   $$ |         $$\\   $$ |  ■□ ");
					System.out.println("									□■   $$$$$$$$\\    \\$$$$$$  |  ■□ ");
					System.out.println("									□■   \\________|    \\______/   ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				} else if(num2[i]==30) {
					print();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									□■     $$$$$$\\     $$$$$$\\    ■□ ");
					System.out.println("								 	□■    $$ ___$$\\   $$$ __$$\\   ■□ ");
					System.out.println("									□■   \\_/   $$ |   $$$$\\ $$ |  ■□ ");
					System.out.println("									□■      $$$$$ /   $$\\$$\\$$ |  ■□ ");
					System.out.println("									□■     \\___$$\\    $$ \\$$$$ |  ■□ ");
					System.out.println("									□■   $$\\   $$ |   $$ |\\$$$ |  ■□ ");
					System.out.println("									□■   \\$$$$$$  |   \\$$$$$$  /  ■□ ");
					System.out.println("									□■    \\______/     \\______/   ■□ ");
					System.out.println("									  □■                        ■□   ");
					System.out.println("									    □■■■■■■■■■■■■□     ");
					System.out.println("									      □□□□□□□□□□□□       ");
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					Thread.sleep(1000);
					//break;

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}


	}

	public void check() {

		System.out.println("");
		System.out.println("");
		System.out.println("		              $$$$$$$$$$$$$$$$$$$$$                                                                                                            ");
		System.out.println("		              $$$$$$$$$$$$$$$$$$$$$             $$$$\\            $$$$$$$$$$$$\\   $$$$$$$$$$$$$$$$$\\ $$$$$$$$$$$$$$$$$\\    $$$$$$$$$$$$\\        ");
		System.out.println("		              $$                 $$             $$$ ㅣ          $$$        $$$\\   \\ ____$$$  _____ㅣ \\ ____$$$  _____ㅣ  $$$        $$$\\       ");
		System.out.println("		              $$=================$$             $$$ ㅣ         $$$     _____$$$\\        $$$ ㅣ             $$$ ㅣ       $$$     _____$$$\\      ");
		System.out.println("		             $$$                 $$$            $$$ ㅣ         $$$    /     $$$ \\       $$$ ㅣ             $$$ ㅣ       $$$    /     $$$ \\     ");
		System.out.println("		            $$   $$$$$   $$$$$$$   $$           $$$ ㅣ         $$$   /      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$   /      $$$ ㅣ    ");
		System.out.println("		          $$                         $$         $$$ ㅣ         $$$  ㅣ      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$  ㅣ      $$$ ㅣ    ");
		System.out.println("		        $$      $$$$$$$   $$$$$        $$       $$$ ㅣ         $$$  ㅣ      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$  ㅣ      $$$ ㅣ    ");
		System.out.println("		      $$           $      $$$$$          $$     $$$ ㅣ         $$$  ㅣ      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$  ㅣ      $$$ ㅣ    ");
		System.out.println("		     $$           $$$                     $$    $$$ ㅣ         $$$  ㅣ      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$  ㅣ      $$$ ㅣ    ");
		System.out.println("		    $$           $ $ $   $$$$$$$           $$   $$$ ㅣ         $$$  ㅣ      $$$ ㅣ      $$$ ㅣ             $$$ ㅣ       $$$  ㅣ      $$$ ㅣ    ");
		System.out.println("		     $$         $  $  $  $  $  $          $$    $$$$$$$$$$$$$$  $$$ ㅣ     $$$  ㅣ      $$$ ㅣ             $$$ ㅣ        $$$ ㅣ     $$$  ㅣ    ");
		System.out.println("		       $$      $   $   $ $$$$$$$        $$      $$$$$$$$$$$$$$\\  $$$$$$$$$$$$   /       $$$ ㅣ             $$$ ㅣ         $$$$$$$$$$$$   /     ");
		System.out.println("		        $$.        $     $  $  $       $$       \\____________ㅣ   \\____________/         \\__ㅣ              \\__ㅣ          \\____________/      ");
		System.out.println("		          $$             $$$$$$$      $$                                                                                                       ");
		System.out.println("		            $$                      $$                                                                                                         ");
		System.out.println("		             $$$$$$$$$$$$$$$$$$$$$$$$                                                                                                          ");
		System.out.println("		                                                                                                                                               ");
		System.out.println("");
		System.out.println();
		System.out.println();
		System.out.println("			                                                                 /$$               /$$             /$$     /$$                          ");
		System.out.println("			  /$$$$$$$  /$$$$$$   /$$$$$$$   /$$$$$$    /$$$$$$   /$$$$$$  /$$$$$$   /$$   /$$| $$  /$$$$$$  /$$$$$$   |__/ /$$$$$$  /$$$$$$$       ");
		System.out.println("			 /$$_____/ /$$__  $$| $$__  $$  /$$__  $$  /$$__  $$ |____  $$|_  $$_/  | $$  | $$| $$ |____  $$|_  $$_/   /$$ /$$__  $$| $$__  $$      ");
		System.out.println("			| $$      | $$  \\ $$  $$  \\ $$ | $$  \\ $$ | $$  \\__/  /$$$$$$$  | $$    | $$  | $$| $$  /$$$$$$$  | $$    | $$| $$  \\ $$| $$  \\ $$     ");
		System.out.println("			| $$      | $$  | $$| $$  | $$ | $$  | $$ | $$       /$$__  $$  | $$ /$$| $$  | $$| $$ /$$__  $$  | $$ /$$| $$| $$  | $$| $$  | $$      ");
		System.out.println("			|  $$$$$$$|  $$$$$$/| $$  | $$ |  $$$$$$$ | $$       | $$$$$$$  | $$$$/ |  $$$$$$/| $$ | $$$$$$$  | $$$$/ | $$|  $$$$$$/| $$  | $$      ");
		System.out.println("			 \\_______/ \\______/|__/  |__/   \\____  $$ |__/        \\_______/  \\___/   \\______/ |__/ \\_______/   \\___/  |__/  \\______/|__/  |__/    ");
		System.out.println("			                                /$$  \\ $$");
		System.out.println("			                                | $$$$$$/");
		System.out.println("			                                 \\______/");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("			----------------------------------------------------   당   첨   번   호   ----------------------------------------------------");
		System.out.println();
		for(i=0;i<4;i++) {
			System.out.print(" 				   " + num2[i]);
		}
		System.out.println();
		System.out.println(); 
		System.out.println("			-------------------------------------------------------------------------------------------------------------------------------");

		System.out.print("			-----------------------------------------ㅣ 홈화면으로 돌아가려면 H키를 입력하세요 ㅣ------------------------------------------");
		String yn = sc.next();

		if(yn.equals("h") || yn.equals("H")) {
			return;
		} else
			System.out.print("		-----------------------------------------ㅣ 키를 잘못 누르셨습니다. 다시 입력하세요 ㅣ-----------------------------------------");

	}

}