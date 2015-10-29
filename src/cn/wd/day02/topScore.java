package cn.wd.day02;

import java.util.Arrays;
import java.util.Scanner;

public class topScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.print("第" + (i+1) +"位学员的成绩是：");
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		int top = score[score.length - 1];
		System.out.println("本次成绩最高分是：" + top);
		
	}

}
