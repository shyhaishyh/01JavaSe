package cn.wd.day01;

import java.util.Scanner;

public class Luck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ѧ�Ÿ�λ������֮�͵���20�ı�������ѧ��");
		System.out.println("������ѧԱ����λѧ�ţ�");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int qian = num1/1000;
		int bai = num1%1000/100;
		int shi = num1%1000%100/10;
		int ge = num1%1000%100%10;
		int all = qian + bai + shi + ge;
		boolean luck;
		luck = all == 20;
		System.out.println("���ѧ�Ÿ�λ������֮���ǣ�" + all);
		System.out.println("��������ѧ����" + luck);
	}
}
