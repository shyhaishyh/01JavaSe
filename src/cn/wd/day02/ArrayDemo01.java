package cn.wd.day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		System.out.print("学员成绩按升序排列：");
		for (int i = 0; i < score.length; i++) {
			System.out.print("\t" + score[i]);
		}
	}
}
