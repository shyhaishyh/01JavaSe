package cn.wd.fengzhuang;

public class Ttip {

	String title;
	String content;
	String publishTime;
	String uid;
	
	public Ttip(){
		this.title = "11";
		this.content = "22";
		this.publishTime = "33";
	}
	
	public Ttip(String title,String content,String publishTime){
		this.title = title;
		this.content = content;
		this.publishTime = publishTime;
	}
	
	public void getInfo(){
		System.out.println("====������Ϣ====");
		System.out.println("���ӱ��⣺" + title);
		System.out.println("�������ݣ�" + content);
		System.out.println("����ʱ�䣺" + publishTime);
	}
}
