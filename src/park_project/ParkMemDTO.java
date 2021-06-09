package park_project;

public class ParkMemDTO {

	private String id;
	private String pwd;
	private String name;
	private String sex,sex2;
	private String birth;
	private String tel;
	private String addr;
	private String carnum;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(int sexint) {
		if(sexint==1) {
			this.sex="남";
		} else if(sexint==2) {
			this.sex="여";
		} else {
			System.out.println("숫자는 1 또는 2만 입력가능합니다");
		}
	}
	public String getSex2() {
		return sex2;
	}
	public void setSex2(String sex2) {
		this.sex2 = sex2;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCarnum() {
		return carnum;
	}
	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}
	
}
