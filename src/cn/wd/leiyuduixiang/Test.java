package cn.wd.leiyuduixiang;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		Tickets tk = new Tickets();
		Scanner sc = new Scanner(System.in);
		String choice;
		do{
		System.out.print("请输入姓名：");
		tk.name = sc.next();
		System.out.print("请输入年龄：");
		tk.age = sc.nextInt();
		tk.show();
		System.out.println("是否继续输入(y/n)");
		choice = sc.next();
	    }while(!choice.equals("n"));
		System.out.println("退出程序！");*/
		
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
		System.out.print("请输入用户名：");
		ch.name = sc.next();
		System.out.print("请输入密码：");
		ch.pwd = sc.next();
		ch.show();
	}
}
