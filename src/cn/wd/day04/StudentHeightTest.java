package cn.wd.day04;

import java.util.Scanner;

public class StudentHeightTest {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentHeight sh = new StudentHeight();
		
		for (int i = 1; i < 6; i++) {
			System.out.print("�������" + i + "��ѧ������ߣ�cm����");
			sh.add(sc.nextInt());
		}
		double avg = sh.getHeight();
		System.out.println("***��5��ѧ����ƽ�����Ϊ��" + avg + "cm****");
	}

}
