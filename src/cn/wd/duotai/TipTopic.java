package cn.wd.duotai;

public class TipTopic extends Tip {
	
	int topicId;
	int boardId;
	
	public void getInfo(String title,String content,String publicTime){
		System.out.println("====������Ϣ====");
		System.out.println("���ӱ��⣺" + title);
		System.out.println("�������ݣ�" + content);
		System.out.println("����ʱ�䣺" + publicTime);		
	}

	@Override
	public void getInfo() {
		System.out.println("====������Ϣ====");
		System.out.println("���ӱ��⣺" + super.getTitle());
		System.out.println("�������ݣ�" + super.getContent());
		System.out.println("����ʱ�䣺" + super.getPublicTime());	
	}

	public TipTopic() {
		super();
		System.out.println("��������޲ι��췽��");
	}
	
}
