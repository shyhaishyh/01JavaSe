package cn.wd.zifuchuan;

public class StudentScore {

	
	public static void main(String[] args) {
		
		int sqls = 80;
		int javas = 90;
		double htmls = 86.7;
		
		StringBuilder sb = new StringBuilder("Ñ§¿Æ\t");
		sb.append("³É¼¨\n");
		sb.append("SQL\t");
		sb.append(sqls + "\n");
		sb.append("Java\t");
		sb.append(javas +"\n");
		sb.append("HTML\t");
		sb.append(htmls);
		System.out.println(sb);
		
	}
}
