package cn.wd.day01;

import java.util.Scanner;

public class School02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money1 = 20;
		int money2 = 30;
		int money3 = 10;
		int money4 = 30;
		System.out.println("--欢迎来到文达教育--");
		System.out.println("文达课程服务：");
		System.out.println("1、java软件工程师培训。（学费：" + money1 + "RMB）");
		System.out.println("2、Android手机开发培训。（学费：" + money2 + "RMB）");
		System.out.println("3、淘宝开店营销培训。（学费：" + money3 + "RMB）");
		System.out.println("4、嵌入式工程师培训。（学费：" + money4 + "RMB）");
		System.out.print("请输入参加java软件工程师培训的学员人数：");
		int num1 = sc.nextInt();
		System.out.print("请输入参加Android手机开发培训的学员人数：");
		int num2 = sc.nextInt();
		System.out.print("请输入参加淘宝开店营销培训的学员人数：");
		int num3 = sc.nextInt();
		System.out.print("请输入参加嵌入式工程师培训的学员人数：");
		int num4 = sc.nextInt();
		System.out.println("！！！你享受的折扣是8折优惠！！！");
		double sum = num1 * money1 + num2 * money2 + num3 * money3 + num4* money4;
		System.out.println("你打折前支付总学费：" + sum);
		double newsum = 0.8 * sum;
		System.out.println("折后你应该支付的学费：" + newsum);
		System.out.println("请支付：");
		double cost = sc.nextInt();
		System.out.println("实际支付：" + cost);
		double zhaoling = cost - newsum;
		int score = (int) (sum / 100);
		System.out.println("找零：" + zhaoling);
		System.out.println("你获得积分：" + score);
		System.out.println("祝您学习愉快！");
		
	}
}
