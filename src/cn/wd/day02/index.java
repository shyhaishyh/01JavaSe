package cn.wd.day02;

import java.util.Scanner;

public class index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入新增成绩：");
		int num = sc.nextInt();
		int[] score = {99,85,83,62,60};
		int[] list = new int[score.length + 1];
		int index = score.length;
		for (int i = 0; i < score.length; i++) {
			if(num > score[i]){
				index = i;
				list[index] = num;
				break;
			}else{
				list[i] = score[i];
			}
		}
		if (index==score.length)
		{
			list[index]=num;
		}
		for (int i = list.length - 1; i > index; i--) {
			list[i] = score[i-1];
		}
		for (int i = 0; i < list.length; i++) {
			System.out.print("\t" + list[i]);
		}
	}
}
