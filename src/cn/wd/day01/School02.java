package cn.wd.day01;

import java.util.Scanner;

public class School02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money1 = 20;
		int money2 = 30;
		int money3 = 10;
		int money4 = 30;
		System.out.println("--��ӭ�����Ĵ����--");
		System.out.println("�Ĵ�γ̷���");
		System.out.println("1��java�������ʦ��ѵ����ѧ�ѣ�" + money1 + "RMB��");
		System.out.println("2��Android�ֻ�������ѵ����ѧ�ѣ�" + money2 + "RMB��");
		System.out.println("3���Ա�����Ӫ����ѵ����ѧ�ѣ�" + money3 + "RMB��");
		System.out.println("4��Ƕ��ʽ����ʦ��ѵ����ѧ�ѣ�" + money4 + "RMB��");
		System.out.print("������μ�java�������ʦ��ѵ��ѧԱ������");
		int num1 = sc.nextInt();
		System.out.print("������μ�Android�ֻ�������ѵ��ѧԱ������");
		int num2 = sc.nextInt();
		System.out.print("������μ��Ա�����Ӫ����ѵ��ѧԱ������");
		int num3 = sc.nextInt();
		System.out.print("������μ�Ƕ��ʽ����ʦ��ѵ��ѧԱ������");
		int num4 = sc.nextInt();
		System.out.println("�����������ܵ��ۿ���8���Żݣ�����");
		double sum = num1 * money1 + num2 * money2 + num3 * money3 + num4* money4;
		System.out.println("�����ǰ֧����ѧ�ѣ�" + sum);
		double newsum = 0.8 * sum;
		System.out.println("�ۺ���Ӧ��֧����ѧ�ѣ�" + newsum);
		System.out.println("��֧����");
		double cost = sc.nextInt();
		System.out.println("ʵ��֧����" + cost);
		double zhaoling = cost - newsum;
		int score = (int) (sum / 100);
		System.out.println("���㣺" + zhaoling);
		System.out.println("���û��֣�" + score);
		System.out.println("ף��ѧϰ��죡");
		
	}
}
