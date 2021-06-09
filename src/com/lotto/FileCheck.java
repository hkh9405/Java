package com.lotto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileCheck {	
	
	private File f1 = new File("c:\\lotto\\number.text");
	private File f2 = new File("c:\\lotto\\data\\data.text");	
	private File f3 = new File("c:\\lotto\\data\\");	
	public int count() {
		
		try {			
			if(!f1.getParentFile().exists()) {
				f1.getParentFile().mkdir();			
			}			
		
			if(!f2.getParentFile().exists()) {
				f2.getParentFile().mkdir();			
			}
		} catch (Exception e) {
			System.out.println(e);
		}
			
		File[] flists = f3.listFiles();

		int n = flists.length+1;
		
		return n;		
	}

	public void  readFile() {	
		
		//System.out.println("Ãâ·Â" + n);
		try {			
			FileInputStream fis = new FileInputStream("c:\\lotto\\Number.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			List<LottoVO>lists = (List<LottoVO>)ois.readObject();
			
			fis.close();
			ois.close();
			
			Iterator<LottoVO> it = lists.iterator();
			while(it.hasNext()) {
				LottoVO vo = it.next();					
				for(int su : vo.getNum()) {
					System.out.printf("%4d",su);
				}
				System.out.println();
			}				
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
