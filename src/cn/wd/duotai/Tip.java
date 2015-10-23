package cn.wd.duotai;

public abstract class Tip {
	
	String title;
	String content;
	String publicTime;
	int uid;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPublicTime() {
		return publicTime;
	}
	public void setPublicTime(String publicTime) {
		this.publicTime = publicTime;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public abstract void getInfo();
	
	public Tip() {
		super();
		System.out.println("帖子类的无参构造方法");
	}
}
