package cn.wd.duotai;

public class TipTopic extends Tip {
	
	int topicId;
	int boardId;
	
	public void getInfo(String title,String content,String publicTime){
		System.out.println("====帖子信息====");
		System.out.println("帖子标题：" + title);
		System.out.println("帖子内容：" + content);
		System.out.println("发表时间：" + publicTime);		
	}

	@Override
	public void getInfo() {
		System.out.println("====帖子信息====");
		System.out.println("帖子标题：" + super.getTitle());
		System.out.println("帖子内容：" + super.getContent());
		System.out.println("发表时间：" + super.getPublicTime());	
	}

	public TipTopic() {
		super();
		System.out.println("主题类的无参构造方法");
	}
	
}
