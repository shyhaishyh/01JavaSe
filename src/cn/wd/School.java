package cn.wd;

import java.util.Scanner;

public class School {
	
	public static void main(String[] args) {
		System.out.println("--��ӭ�����Ĵ����--");
		System.out.println("�Ĵ�γ̷���");
		int x = 20;
		int y = 30;
		int z = 10;
		int w = 30;
		System.out.println("1��java�������ʦ��ѵ����ѧ�ѣ�" + x + "RMB��");
		System.out.println("2��Android�ֻ�������ѵ����ѧ�ѣ�" + y + "RMB��");
		System.out.println("3���Ա�����Ӫ����ѵ����ѧ�ѣ�" + z + "RMB��");
		System.out.println("4��Ƕ��ʽ����ʦ��ѵ����ѧ�ѣ�" + w + "RMB��");
		
		Scanner input = new Scanner(System.in);
		System.out.println("������μ�java�������ʦ��ѵ��ѧԱ������");
		int zjava = input.nextInt();
		System.out.println("������μ�Android�ֻ�������ѵ��ѧԱ������");
		int zand = input.nextInt();
		System.out.println("������μ��Ա�����Ӫ����ѵ��ѧԱ������");
		int ztao = input.nextInt();
		System.out.println("������μ�Ƕ��ʽ����ʦ��ѵ��ѧԱ������");
		int zqian = input.nextInt();
		
		System.out.println("�����������ܵ��ۿ���8���Żݣ�����");
		int zall = zjava*x + zand*y + ztao*z +zqian*w;
		System.out.println("�����ǰ֧������ѧ���ǣ�" + zall);
		double nowmoney = zall * 0.8;
		System.out.println("�ۺ���Ӧ��֧����ѧ���ǣ�" + nowmoney);
		System.out.println("��֧����");
		int giveMoney = input.nextInt();
	    System.out.println("ʵ��֧����" + (double)giveMoney);
	    double zhao = giveMoney - nowmoney;
	    System.out.println("���㣺" + zhao);
	    int score = (int) (nowmoney/100);
	    System.out.println("���û��֣�" + score);
	    System.out.println("ף��ѧϰ��죡");
	}

}
