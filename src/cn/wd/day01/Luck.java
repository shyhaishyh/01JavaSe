package cn.wd.day01;

import java.util.Scanner;

public class Luck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("学号各位上数字之和等于20的本期幸运学生");
		System.out.println("请输入学员的四位学号：");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int qian = num1/1000;
		int bai = num1%1000/100;
		int shi = num1%1000%100/10;
		int ge = num1%1000%100%10;
		int all = qian + bai + shi + ge;
		boolean luck;
		luck = all == 20;
		System.out.println("你的学号各位上数字之和是：" + all);
		System.out.println("你是幸运学生：" + luck);
	}
}
