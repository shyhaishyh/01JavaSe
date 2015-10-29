package cn.wd.day02;

import java.util.Scanner;

public class index01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入5次成绩：");
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		
	
//		System.out.println("请输入新增成绩：");
//		
//		int score = sc.nextInt();
//		for (int i = 0; i < scores.length; i++) {
//			if(score )
//		}
//		
//		
//		System.out.println("插入成绩的下标是：" + );
//		System.out.println("插入后的成绩信息是：" + );

	}

}
