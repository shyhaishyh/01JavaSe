package cn.wd.fengzhuang;

public class TtipTest {

	
	public static void main(String[] args) {
		
		Ttip ttip = new Ttip();
		Ttip ttip1 = new Ttip("һ�������Java����","HelloAccp","2015-10-21 20:05:10");
		ttip.title = "�������֣�����ָ��";
		ttip.content = "�Ҹտ�ʼѧjava������ָ��";
		ttip.publishTime = "2015-10-21 20:00:16";
		System.out.println("��������޲ι��췽��");
		ttip.getInfo();
		System.out.println("��������вι��췽��");
		ttip1.getInfo();

	}
}
