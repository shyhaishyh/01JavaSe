package cn.wd.leiyuduixiang;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		Tickets tk = new Tickets();
		Scanner sc = new Scanner(System.in);
		String choice;
		do{
		System.out.print("������������");
		tk.name = sc.next();
		System.out.print("���������䣺");
		tk.age = sc.nextInt();
		tk.show();
		System.out.println("�Ƿ��������(y/n)");
		choice = sc.next();
	    }while(!choice.equals("n"));
		System.out.println("�˳�����");*/
		
		/*Admin admin1 = new Admin();
		admin1.name = "admin1";
		admin1.pwd = "11111";
		admin1.show();
		
		Admin admin2 = new Admin();
		admin2.name = "admin2";
		admin2.pwd = "22222";
		admin2.show();
		*/
		
		Change ch = new Change();
		Scanner sc = new Scanner(System.in);
		System.out.print("�������û�����");
		ch.name = sc.next();
		System.out.print("���������룺");
		ch.pwd = sc.next();
		ch.show();
	}
}
