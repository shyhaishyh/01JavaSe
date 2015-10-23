package cn.wd.day04;

import java.util.Scanner;

public class VipTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		VipManager vm = new VipManager();
		String index;
		do {
			Vip vip = new Vip();
			System.out.print("输入会员编号：");
			vip.name = sc.next();
			System.out.print("输入会员积分：");
			vip.score = sc.nextInt();
			vm.addVip(vip);
		    System.out.print("是否继续输入（y/n）：");
		    index = sc.next();
		} while (index.equals("y"));
		vm.showVip();

		System.out.println("请输入要查找的会员编号：");
		vm.search(sc.next());
		
	}
}
