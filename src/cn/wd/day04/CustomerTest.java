package cn.wd.day04;

import java.util.Scanner;


public class CustomerTest {

	
	public static void main(String[] args) {
		
		CustomerDemo cd = new CustomerDemo();
		Scanner sc = new Scanner(System.in);
		String index;
		do {
			System.out.print("请输入客户的姓名：");
			String name = sc.next();
			cd.add(name);
			System.out.print("继续输入吗？（y/n）：");
			index = sc.next();
		} while (index.equals("y"));
		cd.show();	
		
		System.out.println("\n请输入要查找的客户姓名：");
		if(cd.search(sc.next()) == true){
			System.out.println("找到了！");
		}else{
			System.out.println("没找到！");
		}
		
	}
}
