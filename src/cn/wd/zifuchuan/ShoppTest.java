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
		System.out.print("请输入用户名：");
		String name = sc.next();
		System.out.print("请输入密码：");
		String pwd = sc.next();
		if (sl.login(name,pwd)) {
			gd.show();
			System.out.print("请输入您批发的商品编号：");
			int i = sc.nextInt();
			System.out.print("请输入批发数量：");
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
			System.out.println("您需要付款：" + sum);
		}else{
			System.out.println("用户名或密码错误！");
		}
	}

}
