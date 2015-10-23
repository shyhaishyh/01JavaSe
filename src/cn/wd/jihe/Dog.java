package cn.wd.jihe;

public class Dog {
	
	String name;
	String leixing;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeixing() {
		return leixing;
	}
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	public Dog() {
		super();
	}
	public Dog(String name, String leixing) {
		super();
		this.name = name;
		this.leixing = leixing;
	}
	
	@Override
	public String toString() {
		
		return name + "\t" + leixing;
	}
}
