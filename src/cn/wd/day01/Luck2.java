package cn.wd.day01;

import java.util.Scanner;

public class Luck2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("学号各位上数字之和等于20的本期幸运学生");
		System.out.println("请输入学员的四位学号：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int qian = num/1000;
		int bai = num%1000/100;
		int shi = num%1000%100/10;
		int ge = num%1000%100%10;
		int sum = qian + bai + shi + ge;
		System.out.println("你的学号个位上数字之和是：" + sum);;
		boolean bl = sum == 20;
		System.out.println("你是幸运学生：" + bl);
	}
}
