package cn.wd.duotai;

public class TipReply extends Tip {
	
	int replyId;
	int topicId;
	
	public void getInfo(String title1,String content1,String publicTime1){
		System.out.println("====������Ϣ====");
		System.out.println("���ӱ��⣺" + title);
		System.out.println("�������ݣ�" + content);
		System.out.println("����ʱ�䣺" + publicTime);	
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("====������Ϣ====");
		System.out.println("���ӱ��⣺" + super.getTitle());
		System.out.println("�������ݣ�" + super.getContent());
		System.out.println("����ʱ�䣺" + super.getPublicTime());
	}

	public TipReply() {
		super();
		System.out.println("�ظ�����޲ι��췽��");
	}
	
}
