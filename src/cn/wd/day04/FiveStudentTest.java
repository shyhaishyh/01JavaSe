package cn.wd.day04;

import java.util.Scanner;

public class FiveStudentTest {

	public static void main(String[] args) {
		
		FiveStudent fs = new FiveStudent();
		System.out.println("������¼��5��ѧ����������");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			fs.add(name);	
		}
		
		String[] names = fs.show();
		System.out.println("****�����****");
		for (int i = 0; i < names.length; i++) {
			if(names[i] != null){
				System.out.print(names[i] + "\t");
			}
		}
	}
}
