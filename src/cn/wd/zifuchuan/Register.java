package cn.wd.zifuchuan;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("****��ӭ����ע��ϵͳ****\n");
		boolean bl;
		do {
			System.out.print("�������û�����");
			String name = sc.next();
			System.out.print("���������룺");
			String pwd = sc.next();
			System.out.print("���ٴ��������룺");
			String repwd = sc.next();

			if (name.length() < 3 || pwd.length() < 6) {
				bl = true;
				System.out.println("�û������Ȳ���С��3�����볤�Ȳ���С��6��");
			} else if (!pwd.equals(repwd)) {
				bl = true;
				System.out.println("������������벻��ͬ��");
			} else {
				bl = false;
				System.out.println("ע��ɹ������μ��û��������롣");
			}
		} while (bl);
	}
}
