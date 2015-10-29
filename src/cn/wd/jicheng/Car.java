package cn.wd.jicheng;

public class Car {
	
	private int site = 4;
	
	public int getSite() {
		return site;
	}
	public void setSite(int site){
	    this.site = site;
	}
	 
	 public Car(){
		System.out.println("载客量是：" + site + " 人");
	}
	 
	public void print(){
	        System.out.print("载客量是"+site+"人");
	    }
}
