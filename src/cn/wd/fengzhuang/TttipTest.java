package cn.wd.fengzhuang;

public class TttipTest {

	public static void main(String[] args) {
		
		Tttip tttip = new Tttip();
		System.out.println("��������޲ι��췽��");
		System.out.println("====������Ϣ====");
		
		tttip.setTitle("java��������1");
		tttip.setContent("�㿴�����ң��㿴�����ң�");
		tttip.setPublishTime("2015-10-21 20:10:00");
		System.out.println("���ӱ��⣺" + tttip.getTitle());
		System.out.println("�������ݣ�" + tttip.getContent());
		System.out.println("����ʱ�䣺" + tttip.getPublishTime());	
	}
}
