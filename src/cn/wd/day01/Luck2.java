package cn.wd.day01;

import java.util.Scanner;

public class Luck2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ѧ�Ÿ�λ������֮�͵���20�ı�������ѧ��");
		System.out.println("������ѧԱ����λѧ�ţ�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int qian = num/1000;
		int bai = num%1000/100;
		int shi = num%1000%100/10;
		int ge = num%1000%100%10;
		int sum = qian + bai + shi + ge;
		System.out.println("���ѧ�Ÿ�λ������֮���ǣ�" + sum);;
		boolean bl = sum == 20;
		System.out.println("��������ѧ����" + bl);
	}
}
