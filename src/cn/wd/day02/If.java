package cn.wd.day02;

import java.util.Scanner;

public class If {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("请输入张浩的JAVA成绩：");
		int zhangScore = sc.nextInt();
		if(zhangScore > 90){
			System.out.println("获得奖励！");
		}else{
			System.out.println("没有奖励！");
		}*/
		
		/*System.out.print("请输入张浩的JAVA成绩：");
		int zhangJava = sc.nextInt();
		System.out.print("请输入张浩的音乐成绩：");
		int zhangMusic = sc.nextInt();
		if((zhangJava > 98 && zhangMusic >80)||(zhangJava == 100 && zhangMusic >70)){
			System.out.println("老师奖励他！");
		}else{
			System.out.println("没有奖励！");
		}*/
		
		System.out.println("请输入是否是会员：是（y）/否（n）");
		String vip = sc.next();
		System.out.println("请输入购物金额：");
		int money = sc.nextInt();
		double nowMoney;
		if(vip.equals("y")){
			if(money >= 200){
				nowMoney = money * 0.75;
			}else{
				nowMoney = money * 0.8;
			}
		}else if(money >= 100){
			nowMoney = money * 0.9;
		}else{
			nowMoney = money;
		}
		System.out.println("实际支付：" + nowMoney);
	}

}
