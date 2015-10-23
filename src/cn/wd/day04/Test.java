package cn.wd.day04;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入行数：");
		int num = sc.nextInt();
		System.out.print("请输入符号：");
		String flag = sc.next();
		
		FlagCreate fc = new FlagCreate();
		fc.creat(num, flag);	
	}

}
