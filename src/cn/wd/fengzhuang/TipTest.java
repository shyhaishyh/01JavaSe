package cn.wd.fengzhuang;

public class TipTest {

	public static void main(String[] args) {
		
		Tip tip = new Tip();
		tip.title = "我是新手，请大家指教";
		tip.content = "我刚开始学java，请大家指教";
		tip.publishTime = "2007-1-1 10:30:16";
		
		tip.getInfo();

	}

}
