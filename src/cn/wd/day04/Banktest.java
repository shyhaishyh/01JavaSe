package cn.wd.day04;

import java.util.Scanner;

public class Banktest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("1�����\t2��ȡ��\t0���˳�");
		System.out.print("��ѡ����Ҫ�����ҵ��");
		int choice = sc.nextInt();
		System.out.print("����������");
		int add = sc.nextInt();
		
		Bank bank = new Bank();
		bank.sbank(choice, add);
		*/
		
		Scanner sc = new Scanner(System.in);
		Bank02 bank = new Bank02();
		System.out.println("1�����\t2��ȡ��\t0���˳�");
		System.out.print("��ѡ����Ҫ�����ҵ��");
		
		int i = sc.nextInt();
		int money = 0;
		while(i != 0 ){
			if(i == 1){
				System.out.print("���������");
				money = sc.nextInt();
				bank.add(money);
			}else if(i == 2){
				System.out.print("������ȡ���");
				money = sc.nextInt();
				bank.take(money);
			}
			System.out.println("1�����\t2��ȡ��\t0���˳�");
			System.out.print("��ѡ����Ҫ�����ҵ��");
		}
		System.out.println("ллʹ�ã�");
	}

}
