package cn.wd.day02;

import java.util.Arrays;
import java.util.Scanner;

public class topScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������5λѧԱ�ĳɼ���");
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.print("��" + (i+1) +"λѧԱ�ĳɼ��ǣ�");
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		int top = score[score.length - 1];
		System.out.println("���γɼ���߷��ǣ�" + top);
		
	}

}
