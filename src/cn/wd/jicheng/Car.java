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
		System.out.println("�ؿ����ǣ�" + site + " ��");
	}
	 
	public void print(){
	        System.out.print("�ؿ�����"+site+"��");
	    }
}
