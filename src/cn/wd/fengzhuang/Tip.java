package cn.wd.fengzhuang;

public class Tip {
	
	String title;
	String content;
	String publishTime;
	String uid;
	
	public void getInfo(){
		System.out.println("帖子类的无参构造方法");
		System.out.println("====帖子信息====");
		System.out.println("帖子标题：" + title);
		System.out.println("帖子内容：" + content);
		System.out.println("发表时间：" + publishTime);
	}

}
