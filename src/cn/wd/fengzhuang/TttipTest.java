package cn.wd.fengzhuang;

public class TttipTest {

	public static void main(String[] args) {
		
		Tttip tttip = new Tttip();
		System.out.println("帖子类的无参构造方法");
		System.out.println("====帖子信息====");
		
		tttip.setTitle("java板块测试帖1");
		tttip.setContent("你看不见我！你看不见我！");
		tttip.setPublishTime("2015-10-21 20:10:00");
		System.out.println("帖子标题：" + tttip.getTitle());
		System.out.println("帖子内容：" + tttip.getContent());
		System.out.println("发表时间：" + tttip.getPublishTime());	
	}
}
