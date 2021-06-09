package park_project; //DB�� Java�� ���� �ݴ� Ŭ���� ����

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn {
	
	private static Connection dbConn;
	
	//�ڹٿ� ����Ŭ�� �������ִ� �޼ҵ�
	public static Connection getConnection() { 
		if(dbConn==null) {
			try {
				String url="jdbc:oracle:thin:@localhost:1521:TestDB"; //jdbc�� DB�� �����ϱ� ���� ��θ� �˷��ִ� ��ɾ�
				                                                      //thin��� �Ǵ� type4 �� ������� DB�� ���� (DB���� ����� �� 4������ �ִ�)
				String user="park";
				String pwd="123";
				
				Class.forName("oracle.jdbc.driver.OracleDriver"); //OracleDriver�� ����Ŭ�� ���������� ������ �־� �������� ã�� ���� ����
				
				dbConn=DriverManager.getConnection(url,user,pwd);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return dbConn;
	}
	
	//DB�� ������ �����ִ� �޼ҵ�
	public static void close() { 
		if(dbConn!=null) {
			try {
				if(!dbConn.isClosed()) {
					dbConn.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		dbConn=null; //DB�� null�� �ʱ�ȭ�� ����� �����ߴ� ��ΰ� ������ ������鼭 ���� ���� adobter������ ���� �ʴ´�	
	}	
	
}
