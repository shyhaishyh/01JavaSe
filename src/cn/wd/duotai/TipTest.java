package cn.wd.duotai;

public class TipTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		TipTopic tt = new TipTopic();
		tt.getInfo("�һ��ü̳���", "����", "2010-10-1");
		TipReply tr = new TipReply();
		tr.getInfo("Re���һ��ü̳���", "��Ҳ��", "2010-10-2");
		*/
		
		Tip tiptopic = new TipTopic();
		tiptopic.setTitle("�һ��ü̳���");
		tiptopic.setContent("����");
		tiptopic.setPublicTime("2010-10-1");
		tiptopic.getInfo();
		
		Tip tipreply = new TipReply();
		tipreply.getInfo();
		
	}
}
