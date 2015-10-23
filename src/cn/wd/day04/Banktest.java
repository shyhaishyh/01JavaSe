package cn.wd.day04;

import java.util.Scanner;

public class Banktest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("1、存款\t2、取款\t0、退出");
		System.out.print("请选择您要办理的业务：");
		int choice = sc.nextInt();
		System.out.print("请输入存入金额：");
		int add = sc.nextInt();
		
		Bank bank = new Bank();
		bank.sbank(choice, add);
		*/
		
		Scanner sc = new Scanner(System.in);
		Bank02 bank = new Bank02();
		System.out.println("1、存款\t2、取款\t0、退出");
		System.out.print("请选择您要办理的业务：");
		
		int i = sc.nextInt();
		int money = 0;
		while(i != 0 ){
			if(i == 1){
				System.out.print("请输入存款金额：");
				money = sc.nextInt();
				bank.add(money);
			}else if(i == 2){
				System.out.print("请输入取款金额：");
				money = sc.nextInt();
				bank.take(money);
			}
			System.out.println("1、存款\t2、取款\t0、退出");
			System.out.print("请选择您要办理的业务：");
		}
		System.out.println("谢谢使用！");
	}

}
