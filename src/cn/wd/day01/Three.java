package cn.wd.day01;

import java.util.Scanner;

public class Three {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("������JAVA�γɼ��ǣ�");
		double zjava = input.nextDouble();
		System.out.print("������SQL�γɼ��ǣ�");
		double zsql = input.nextDouble();
		System.out.print("��������ѧ�γɼ��ǣ�");
		double zmath = input.nextDouble();
		
		double differ = zjava - zsql;
		System.out.println("JAVA��SQL�εķ���֮��Ϊ��" + differ);
		double avg = (zjava + zsql + zmath)/3;
		System.out.println("3�ſε�ƽ�����ǣ�" + avg);
		
	}

}
