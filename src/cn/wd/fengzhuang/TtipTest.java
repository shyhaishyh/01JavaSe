package cn.wd.fengzhuang;

public class TtipTest {

	
	public static void main(String[] args) {
		
		Ttip ttip = new Ttip();
		Ttip ttip1 = new Ttip("一个经典的Java程序","HelloAccp","2015-10-21 20:05:10");
		ttip.title = "我是新手，请大家指教";
		ttip.content = "我刚开始学java，请大家指教";
		ttip.publishTime = "2015-10-21 20:00:16";
		System.out.println("帖子类的无参构造方法");
		ttip.getInfo();
		System.out.println("帖子类的有参构造方法");
		ttip1.getInfo();

	}
}
