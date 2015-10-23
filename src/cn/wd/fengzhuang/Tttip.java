package cn.wd.fengzhuang;

public class Tttip {

	private String title;
	private String content;
	private String publishTime;
	private String uid;
	
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
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public Tttip() {
		super();
	}
	
	public Tttip(String title, String content, String publishTime, String uid) {
		super();
		this.title = title;
		this.content = content;
		this.publishTime = publishTime;
		this.uid = uid;
	}
}
