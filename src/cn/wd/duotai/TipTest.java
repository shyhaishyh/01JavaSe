package cn.wd.duotai;

public class TipTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		TipTopic tt = new TipTopic();
		tt.getInfo("我会用继承了", "如题", "2010-10-1");
		TipReply tr = new TipReply();
		tr.getInfo("Re：我会用继承了", "俺也会", "2010-10-2");
		*/
		
		Tip tiptopic = new TipTopic();
		tiptopic.setTitle("我会用继承了");
		tiptopic.setContent("如题");
		tiptopic.setPublicTime("2010-10-1");
		tiptopic.getInfo();
		
		Tip tipreply = new TipReply();
		tipreply.getInfo();
		
	}
}
