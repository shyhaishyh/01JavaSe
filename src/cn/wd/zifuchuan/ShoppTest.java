package cn.wd.zifuchuan;

import java.util.Scanner;

public class ShoppTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Goods gd = new Goods();
		ShopLogin sl = new ShopLogin();
		Scanner sc = new Scanner(System.in);
		System.out.print("�������û�����");
		String name = sc.next();
		System.out.print("���������룺");
		String pwd = sc.next();
		if (sl.login(name,pwd)) {
			gd.show();
			System.out.print("����������������Ʒ��ţ�");
			int i = sc.nextInt();
			System.out.print("����������������");
			int j = sc.nextInt();
			double sum = 0;
			switch (i) {
			case 1:
				sum = gd.th1 * j;
				break;
			case 2:
				sum = gd.th2 * j;
				break;
			case 3:
				sum = gd.th3 * j;
				break;
			case 4:
				sum = gd.th4 * j;
				break;
			case 5:
				sum = gd.th5 * j;
				break;
			}
			System.out.println("����Ҫ���" + sum);
		}else{
			System.out.println("�û������������");
		}
	}

}
