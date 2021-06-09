package park_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class BookingDAO {	

	//예약입력
	public int insertBooking(BookingDTO dto) {		

		int result = 0;

		Connection conn = DBconn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "insert into booking (no,id,startdate,pno) ";
			sql+= "values (?,?,to_date(?,'yyyy-mm-dd hh24:mi:ss'),?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getNo());
			pstmt.setString(2, dto.getLogid());
			pstmt.setString(3, dto.getStartdate());
			pstmt.setInt(4, dto.getPno());

			result = pstmt.executeUpdate();

			pstmt.close();			

		} catch (Exception e) {
			System.out.println("에러"); System.out.println(e.toString());
			try {pstmt.close();} catch (Exception e2) {}			
			try {DBconn.close();} catch (Exception e2) {}	
		}		
		return result;		
	}

	//예약수정
	public int updateBooking(BookingDTO dto) {		

		int result = 0;

		Connection conn = DBconn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "update booking set startdate=to_date(?,'yyyy-mm-dd hh24:mi:ss'),pno=? where id=? and no=?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getStartdate());
			pstmt.setInt(2, dto.getPno());
			pstmt.setString(3, dto.getLogid());
			pstmt.setInt(4, dto.getNo());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			try {pstmt.close();} catch (Exception e2) {}			
			try {DBconn.close();} catch (Exception e2) {}	
		}		
		return result;		
	}

	//예약삭제
	public int deleteBooking(BookingDTO dto) {

		int result = 0;

		Connection conn = DBconn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "delete booking where id=? and no=?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getLogid());
			pstmt.setInt(2, dto.getNo());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			try {pstmt.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}		
		return result;
	}

	//예약ID검색
	public List<BookingDTO> getBooking(String logid) {

		List<BookingDTO> lists = new ArrayList<>();

		Connection conn = DBconn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "select no, id,to_char(startdate,'yyyy-mm-dd hh24:mi:ss') startdate,pno from booking where id = ? ";
			sql+= "order by no";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, logid);

			rs = pstmt.executeQuery();

			while(rs.next()) {

				BookingDTO dto = new BookingDTO();

				dto.setNo(rs.getInt("no"));
				dto.setLogid(rs.getString("id"));
				dto.setStartdate(rs.getString("startdate"));
				dto.setPno(rs.getInt("pno"));	

				lists.add(dto);

			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}

	//전체검색
	public List<BookingDTO> getList() {

		List<BookingDTO> lists = new ArrayList<>();

		Connection conn = DBconn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "select id,to_char(startdate,'yyyy-mm-dd hh24:mi:ss') startdate,pno from booking";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while(rs.next()) {

				BookingDTO dto = new BookingDTO();

				dto.setLogid(rs.getString("id"));
				dto.setStartdate(rs.getString("startdate"));
				dto.setPno(rs.getInt("pno"));	

				lists.add(dto);

			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return lists;
	}

	//id 카운트
	public int getBookingCount(String logid) {	

		Connection conn = DBconn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int no=0;
		String sql;

		try {

			sql = "select count(*) from booking where id = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, logid);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				BookingDTO dto = new BookingDTO();
				no = rs.getInt(1);
			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return no;
	}	
}
