package cn.wd.jdbc;

public class Student {

	private String name;
	private int scode;
	private String saddress;
	private int sgrade;
	private String semail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScode() {
		return scode;
	}
	public void setScode(int scode) {
		this.scode = scode;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getSgrade() {
		return sgrade;
	}
	public void setSgrade(int sgrade) {
		this.sgrade = sgrade;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", saddress=" + saddress + ", scode="
				+ scode + ", semail=" + semail + ", sgrade=" + sgrade + "]";
	}
	
}
