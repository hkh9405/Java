package park_project;

import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class ParkMemDAO {

	Scanner sc=new Scanner(System.in);

	public int memData(ParkMemDTO dto) { //회원가입
		int result=0;

		Connection conn=DBconn.getConnection();
		PreparedStatement ps=null;
		String sql;

		try {
			sql="insert into membership values(?,?,?,?,?,?,?,?)";

			ps=conn.prepareStatement(sql);

			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getSex());
			ps.setString(5, dto.getBirth());
			ps.setString(6, dto.getTel());
			ps.setString(7, dto.getAddr());
			ps.setString(8, dto.getCarnum());

			result=ps.executeUpdate();

			ps.close();
			DBconn.close();
		} catch (Exception e) {
			try {ps.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}

		return result;
	}

	public int login(String id,String pwd) {	//로그인
		ParkMemDTO dto=null;
		int result=0;

		Connection conn=DBconn.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql;

		try {
			sql="select id,pwd,name from membership where id=? and pwd=?";

			ps=conn.prepareStatement(sql);

			ps.setString(1, id);
			ps.setString(2, pwd);

			result=ps.executeUpdate();
			rs=ps.executeQuery();

			if(rs.next()) {
				dto=new ParkMemDTO();
				dto.setId(rs.getString(1));
				dto.setPwd(rs.getString(2));
				dto.setName(rs.getString(3));
			}

			rs.close();
			ps.close();
			DBconn.close();
		} catch (Exception e) {
			try {ps.close();} catch (Exception e2) {}
			try {rs.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}

		return result;
	}

	public ParkMemDTO findID(String name,String birth) { //아이디 찾기
		ParkMemDTO dto=null;

		Connection conn=DBconn.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql;

		try {
			sql="select id from membership where name=? and birth=?";

			ps=conn.prepareStatement(sql);

			ps.setString(1, name);
			ps.setString(2, birth);

			rs=ps.executeQuery();

			if(rs.next()) {
				dto=new ParkMemDTO();

				dto.setId(rs.getString(1));
			}

			rs.close();
			ps.close();
			DBconn.close();
		} catch (Exception e) {
			try {ps.close();} catch (Exception e2) {}
			try {rs.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}

		return dto;
	}

	public ParkMemDTO findPwd(String id,String name,String birth) { //비밀번호 찾기
		ParkMemDTO dto=null;

		Connection conn=DBconn.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql;

		try {
			sql="select pwd from membership where id=? and name=? and birth=?";

			ps=conn.prepareStatement(sql);

			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, birth);

			rs=ps.executeQuery();

			if(rs.next()) {
				dto=new ParkMemDTO();

				dto.setPwd(rs.getString(1));
			}

			rs.close();
			ps.close();
			DBconn.close();
		} catch (Exception e) {
			try {ps.close();} catch (Exception e2) {}
			try {rs.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}

		return dto;
	}

	public ParkMemDTO getInfo(String logid) { //내정보
		ParkMemDTO dto=null;

		Connection conn=DBconn.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql;

		try {
			sql="select * from membership where id=?";

			ps=conn.prepareStatement(sql);

			ps.setString(1, logid);

			rs=ps.executeQuery();

			if(rs.next()) {
				dto=new ParkMemDTO();

				dto.setId(rs.getString(1));
				dto.setPwd(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setSex2(rs.getString(4));
				dto.setBirth(rs.getString(5));
				dto.setTel(rs.getString(6));
				dto.setAddr(rs.getString(7));
				dto.setCarnum(rs.getString(8));
			}

			rs.close();
			ps.close();
			DBconn.close();
		} catch (Exception e) {
			try {ps.close();} catch (Exception e2) {}
			try {rs.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}

		return dto;
	}

	public int updateInfo(String logid) { //내 정보 변경
		ParkMemDTO dto=new ParkMemDTO();
		int result=0;
		
		Connection conn=DBconn.getConnection();
		PreparedStatement ps=null;
		String sql;
		try {
			sql="update membership set pwd=?,tel=?,addr=?,carnum=? where id=?";

			ps.setString(1, dto.getPwd());
			ps.setString(2, dto.getTel());
			ps.setString(3, dto.getAddr());
			ps.setString(4, dto.getCarnum());
			ps.setString(5, logid);
			
			ps=conn.prepareStatement(sql);
			
			result=ps.executeUpdate();
			
			ps.close();
			DBconn.close();
		} catch (Exception e) {
			try {ps.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}
		
		return result;
	}
	
	public BookingDTO bookingInfo(String logid) { //예약현황
		BookingDTO dto=null;

		Connection conn=DBconn.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql;

		try {
			sql="select no,id,startdate,pno from booking where id=?";

			ps=conn.prepareStatement(sql);

			ps.setString(1, logid);

			rs=ps.executeQuery();

			if(rs.next()) {
				dto=new BookingDTO();

				dto.setNo(rs.getInt(1));
				dto.setLogid(rs.getString(2));
				dto.setStartdate(rs.getString(3));
				dto.setPno(rs.getInt(4));
			}

			rs.close();
			ps.close();
			DBconn.close();
		} catch (Exception e) {
			try {ps.close();} catch (Exception e2) {}
			try {rs.close();} catch (Exception e2) {}
			try {DBconn.close();} catch (Exception e2) {}
		}

		return dto;
	}
}
