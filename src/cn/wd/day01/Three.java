package cn.wd.day01;

import java.util.Scanner;

public class Three {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("张三的JAVA课成绩是：");
		double zjava = input.nextDouble();
		System.out.print("张三的SQL课成绩是：");
		double zsql = input.nextDouble();
		System.out.print("张三的数学课成绩是：");
		double zmath = input.nextDouble();
		
		double differ = zjava - zsql;
		System.out.println("JAVA和SQL课的分数之差为：" + differ);
		double avg = (zjava + zsql + zmath)/3;
		System.out.println("3门课的平均分是：" + avg);
		
	}

}
