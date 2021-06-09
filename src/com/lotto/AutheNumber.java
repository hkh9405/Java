package com.lotto;

import java.util.Arrays;

class AutheNumber {
	
	public boolean checkString(String str) throws Exception {
		
		String re = str.replaceAll(" ", "");
		//���ڰ˻�
		for(int i=0;i<re.length();i++) {
			
			char ch = re.charAt(i);
		
			if(ch<48 || ch>57) {
				System.out.println("���� �Է¸� ����");
				System.out.println();
				return false;
			}
		}
		return true;
	}
		
	public boolean checKNumber(String str) throws Exception {
				
		String[] ss = str.split(" ");
		int[] num = Arrays.stream(ss).mapToInt(Integer::parseInt).toArray();	
						
		//���� �˻�
		for(int i=0;i<num.length;i++) {
			//���� ũ�� �˻�
			if(num[i]<1 || num[i]>45) {
				System.out.println("���� 1~45������ �Է°���");	
				System.out.println();
				return false;
			}
			//���� ���� �˻�
			for (int j=1;j<num.length;j++) {
				if(j!=i && num[i]==num[j]) {
					System.out.println("������ ���� �Է� �Ұ���");
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
		//�迭 ũ�� �˻�		
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
		//�迭 ũ�� �˻�		
		if(num.length!=4) {				
			return false;
		}
		return true;
	}
}

