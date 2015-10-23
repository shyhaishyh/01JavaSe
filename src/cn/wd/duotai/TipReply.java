package cn.wd.duotai;

public class TipReply extends Tip {
	
	int replyId;
	int topicId;
	
	public void getInfo(String title1,String content1,String publicTime1){
		System.out.println("====帖子信息====");
		System.out.println("帖子标题：" + title);
		System.out.println("帖子内容：" + content);
		System.out.println("发表时间：" + publicTime);	
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("====帖子信息====");
		System.out.println("帖子标题：" + super.getTitle());
		System.out.println("帖子内容：" + super.getContent());
		System.out.println("发表时间：" + super.getPublicTime());
	}

	public TipReply() {
		super();
		System.out.println("回复类的无参构造方法");
	}
	
}
