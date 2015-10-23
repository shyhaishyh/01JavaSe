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
		System.out.println("====帖子信息====");
		System.out.println("帖子标题：" + title);
		System.out.println("帖子内容：" + content);
		System.out.println("发表时间：" + publishTime);
	}
}
