package cn.wd.day04;

import java.util.Scanner;


public class CustomerTest {

	
	public static void main(String[] args) {
		
		CustomerDemo cd = new CustomerDemo();
		Scanner sc = new Scanner(System.in);
		String index;
		do {
			System.out.print("������ͻ���������");
			String name = sc.next();
			cd.add(name);
			System.out.print("���������𣿣�y/n����");
			index = sc.next();
		} while (index.equals("y"));
		cd.show();	
		
		System.out.println("\n������Ҫ���ҵĿͻ�������");
		if(cd.search(sc.next()) == true){
			System.out.println("�ҵ��ˣ�");
		}else{
			System.out.println("û�ҵ���");
		}
		
	}
}
