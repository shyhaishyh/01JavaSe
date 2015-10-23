package cn.wd.zifuchuan;

public class Goods {
	
	double th1 = 124.23;
	double th2 = 4500.0;
	double th3 = 8800.9;
	double th4 = 5000.88;
	double th5 = 4456.0;
	
	public void show(){
		System.out.println("********欢迎进入商品批发城*********");
		StringBuffer sb = new StringBuffer("\t编号\t");
		sb.append("商品\t");
		sb.append("价格\n");
		sb.append("1\t");
		sb.append("电风扇\t");
		sb.append(th1 + "\n");
		sb.append("2\t");
		sb.append("洗衣机\t");
		sb.append(th2 + "\n");
		sb.append("3\t");
		sb.append("电视机\t");
		sb.append(th3 + "\n");
		sb.append("4\t");
		sb.append("冰箱\t");
		sb.append(th4 + "\n");
		sb.append("5\t");
		sb.append("空调机\t");
		sb.append(th5);
		System.out.println(sb);
		System.out.println("**********************************");
		
		
	}

}
