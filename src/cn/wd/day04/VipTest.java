package cn.wd.day04;

import java.util.Scanner;

public class VipTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		VipManager vm = new VipManager();
		String index;
		do {
			Vip vip = new Vip();
			System.out.print("�����Ա��ţ�");
			vip.name = sc.next();
			System.out.print("�����Ա���֣�");
			vip.score = sc.nextInt();
			vm.addVip(vip);
		    System.out.print("�Ƿ�������루y/n����");
		    index = sc.next();
		} while (index.equals("y"));
		vm.showVip();

		System.out.println("������Ҫ���ҵĻ�Ա��ţ�");
		vm.search(sc.next());
		
	}
}
