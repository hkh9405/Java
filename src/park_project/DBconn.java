package park_project; //DB와 Java를 열고 닫는 클래스 생성

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn {
	
	private static Connection dbConn;
	
	//자바와 오라클을 연결해주는 메소드
	public static Connection getConnection() { 
		if(dbConn==null) {
			try {
				String url="jdbc:oracle:thin:@localhost:1521:TestDB"; //jdbc가 DB와 연결하기 위한 경로를 알려주는 명령어
				                                                      //thin방식 또는 type4 의 방식으로 DB를 연결 (DB연결 방법은 총 4가지가 있다)
				String user="park";
				String pwd="123";
				
				Class.forName("oracle.jdbc.driver.OracleDriver"); //OracleDriver가 오라클의 차례정보를 가지고 있어 나머지를 찾아 실행 가능
				
				dbConn=DriverManager.getConnection(url,user,pwd);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return dbConn;
	}
	
	//DB와 연결을 끊어주는 메소드
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
		
		dbConn=null; //DB를 null로 초기화를 해줘야 연결했던 통로가 깨끗히 비워지면서 다음 사용시 adobter오류가 뜨지 않는다	
	}	
	
}
