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
		System.out.print("�����������ĳɼ��ǣ�");
		int zhangscore = input.nextInt();
		
		isBig = zhangscore > liscore;
		System.out.println("�����ĳɼ������ĵĸ���" + isBig);
	}

}
