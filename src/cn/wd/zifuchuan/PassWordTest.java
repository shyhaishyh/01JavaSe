package cn.wd.zifuchuan;

import java.util.Scanner;

public class PassWordTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������û�����");
		sc.next();
		System.out.print("���������룺");
		String pwd = sc.next();
		if(pwd.length() < 6){
			System.out.println("���볤�Ȳ���С��6λ��");
		}else{
			System.out.println("ע��ɹ���");
		}
	}
}
