package cn.wd.zifuchuan;

public class Goods {
	
	double th1 = 124.23;
	double th2 = 4500.0;
	double th3 = 8800.9;
	double th4 = 5000.88;
	double th5 = 4456.0;
	
	public void show(){
		System.out.println("********��ӭ������Ʒ������*********");
		StringBuffer sb = new StringBuffer("\t���\t");
		sb.append("��Ʒ\t");
		sb.append("�۸�\n");
		sb.append("1\t");
		sb.append("�����\t");
		sb.append(th1 + "\n");
		sb.append("2\t");
		sb.append("ϴ�»�\t");
		sb.append(th2 + "\n");
		sb.append("3\t");
		sb.append("���ӻ�\t");
		sb.append(th3 + "\n");
		sb.append("4\t");
		sb.append("����\t");
		sb.append(th4 + "\n");
		sb.append("5\t");
		sb.append("�յ���\t");
		sb.append(th5);
		System.out.println(sb);
		System.out.println("**********************************");
		
		
	}

}
