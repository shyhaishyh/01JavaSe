package cn.wd.day02;

import java.util.Scanner;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼��");
		double[] money = new double[5];
		for (int i = 0; i < money.length; i++) {
			System.out.print("�������" + (i+1) + "�ʹ����");
			money[i] = sc.nextDouble();
		}
		
		double sum = 0;
		System.out.println("���\t\t��Ԫ��");
		for (int i = 0; i < money.length; i++) {
			System.out.println((i+1) + "\t\t" + money[i]);
			sum += money[i];
		}
		System.out.println("�ܽ�\t\t" + sum);
	}
}
