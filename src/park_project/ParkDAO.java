package park_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

public class ParkDAO {

	Calendar cal = Calendar.getInstance();
	
	//결제 전 사용내역
	public BookingDTO pay(String logid) {
		BookingDTO dto = null;
		
		Connection conn = DBconn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {	
			sql = "select id,startdate,enddate,usedtime,cost from booking where id = ?";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, logid);
			
			rs = pstmt.executeQuery();

			if(rs.next()) {
				dto = new BookingDTO();

				dto.setLogid(rs.getString(1));
				dto.setStartdate(rs.getString(2));
				dto.setEnddate(rs.getString(3));
				dto.setUsedtime(rs.getInt(4));
				dto.setCost(rs.getInt(5));
				dto.setNo(rs.getInt(6));
			}	
			
			rs.close();
			pstmt.close();
			DBconn.close();
		} catch (Exception e) {
			try {rs.close();} catch (Exception e2) {}
			try {pstmt.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}

		return dto;
	}

	public int update(String logid) {
		int result = 0;

		Connection conn = DBconn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {
			sql = "update booking set enddate = sysdate,usedtime = ceil((sysdate-startdate)*24),cost = ceil((sysdate-startdate)*24)*2000 ";
			sql+= "where id = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, logid);

			result = pstmt.executeUpdate();
			
			pstmt.close();
			DBconn.close();
		} catch (Exception e) {
			try {pstmt.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}

		return result;		
	}
	
	public int delete(String logid) {
		int result = 0;

		Connection conn = DBconn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {
			sql = "delete booking where id = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, logid);
			
			result = pstmt.executeUpdate();


			pstmt.close();
			DBconn.close();
		} catch (Exception e) {
			try {pstmt.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}

		return result;		
	}
}
