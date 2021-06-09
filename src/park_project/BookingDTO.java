package park_project;

import java.util.Calendar;

public class BookingDTO {
	
	private String logid;	
	private String startdate;	
	private int no;
	private int pno;
	private int year;
	private int month;
	private int day;
	private int hour;
	private String enddate;
	private int usedtime;
	private int cost;
	Calendar now = Calendar.getInstance();
	
	public String getLogid() {
		return logid;
	}
	public void setLogid(String logid) {
		this.logid = logid;
	}	
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		int y=now.get(Calendar.YEAR); //년
		int m=now.get(Calendar.MONTH)+1; //월(0~11)
		int d=now.get(Calendar.DATE); //일
		int w=now.get(Calendar.DAY_OF_WEEK); //주의수(1~7 : 일요일 1)
		int h=now.get(Calendar.HOUR_OF_DAY);
		int min=now.get(Calendar.MINUTE);
		int s=now.get(Calendar.SECOND);
		enddate=y+"-"+m+"-"+d+" "+h+":"+min+":"+s;
		this.enddate = enddate;
	}
	public int getUsedtime() {
		return usedtime;
	}
	public void setUsedtime(int usedtime) {
		this.usedtime = usedtime;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String booking() {
		String str = String.format("							No:%2d  ID: %-10s  예약날짜:%20s  주차자리번호:%2d",no,logid,startdate,pno);
		return str;
	}		
}
