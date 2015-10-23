package cn.wd;

import java.util.Scanner;

public class Boolean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int liscore = 80;
		boolean isBig ;
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入张三的成绩是：");
		int zhangscore = input.nextInt();
		
		isBig = zhangscore > liscore;
		System.out.println("张三的成绩比李四的高吗？" + isBig);
	}

}
