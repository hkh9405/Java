package com.lotto;

import java.util.Arrays;

class AutheNumber {
	
	public boolean checkString(String str) throws Exception {
		
		String re = str.replaceAll(" ", "");
		//문자검사
		for(int i=0;i<re.length();i++) {
			
			char ch = re.charAt(i);
		
			if(ch<48 || ch>57) {
				System.out.println("숫자 입력만 가능");
				System.out.println();
				return false;
			}
		}
		return true;
	}
		
	public boolean checKNumber(String str) throws Exception {
				
		String[] ss = str.split(" ");
		int[] num = Arrays.stream(ss).mapToInt(Integer::parseInt).toArray();	
						
		//숫자 검사
		for(int i=0;i<num.length;i++) {
			//숫자 크기 검사
			if(num[i]<1 || num[i]>45) {
				System.out.println("숫자 1~45까지만 입력가능");	
				System.out.println();
				return false;
			}
			//동일 숫자 검사
			for (int j=1;j<num.length;j++) {
				if(j!=i && num[i]==num[j]) {
					System.out.println("동일한 숫자 입력 불가능");
					System.out.println();
					return false;
				}
			}			
		}
		return true;
	}
	
	public boolean checKSemiNnmLength(String str) throws Exception {
		
		String[] ss = str.split(" ");
		int[] num = Arrays.stream(ss).mapToInt(Integer::parseInt).toArray();
		//배열 크기 검사		
		if (num.length>4) {
			return true;
		}else if(num.length!=4) {				
			return false;
		}
		return true;
	}
	
public boolean checKManuNnmLength(String str) throws Exception {
		
		String[] ss = str.split(" ");
		int[] num = Arrays.stream(ss).mapToInt(Integer::parseInt).toArray();
		//배열 크기 검사		
		if(num.length!=4) {				
			return false;
		}
		return true;
	}
}

