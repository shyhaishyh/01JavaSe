package cn.wd.zifuchuan;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������û�����");
		String name = sc.next();
		System.out.print("���������룺");
		String pwd = sc.next();
		if("TOM".equalsIgnoreCase(name) && "12345".equals(pwd)){
			System.out.println("��¼�ɹ���");
		}else{
			System.out.println("�û��������벻ƥ�䣬��¼ʧ�ܣ�");
		}
	}
}
