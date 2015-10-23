package cn.wd;

import java.util.Scanner;

public class School {
	
	public static void main(String[] args) {
		System.out.println("--欢迎来到文达教育--");
		System.out.println("文达课程服务：");
		int x = 20;
		int y = 30;
		int z = 10;
		int w = 30;
		System.out.println("1、java软件工程师培训。（学费：" + x + "RMB）");
		System.out.println("2、Android手机开发培训。（学费：" + y + "RMB）");
		System.out.println("3、淘宝开店营销培训。（学费：" + z + "RMB）");
		System.out.println("4、嵌入式工程师培训。（学费：" + w + "RMB）");
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入参加java软件工程师培训的学员人数：");
		int zjava = input.nextInt();
		System.out.println("请输入参加Android手机开发培训的学员人数：");
		int zand = input.nextInt();
		System.out.println("请输入参加淘宝开店营销培训的学员人数：");
		int ztao = input.nextInt();
		System.out.println("请输入参加嵌入式工程师培训的学员人数：");
		int zqian = input.nextInt();
		
		System.out.println("！！！你享受的折扣是8折优惠！！！");
		int zall = zjava*x + zand*y + ztao*z +zqian*w;
		System.out.println("你打折前支付的总学费是：" + zall);
		double nowmoney = zall * 0.8;
		System.out.println("折后你应该支付的学费是：" + nowmoney);
		System.out.println("请支付：");
		int giveMoney = input.nextInt();
	    System.out.println("实际支付：" + (double)giveMoney);
	    double zhao = giveMoney - nowmoney;
	    System.out.println("找零：" + zhao);
	    int score = (int) (nowmoney/100);
	    System.out.println("你获得积分：" + score);
	    System.out.println("祝你学习愉快！");
	}

}
