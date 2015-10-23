package cn.wd.zifuchuan;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("****欢迎进入注册系统****\n");
		boolean bl;
		do {
			System.out.print("请输入用户名：");
			String name = sc.next();
			System.out.print("请输入密码：");
			String pwd = sc.next();
			System.out.print("请再次输入密码：");
			String repwd = sc.next();

			if (name.length() < 3 || pwd.length() < 6) {
				bl = true;
				System.out.println("用户名长度不能小于3，密码长度不能小于6！");
			} else if (!pwd.equals(repwd)) {
				bl = true;
				System.out.println("两次输入的密码不相同！");
			} else {
				bl = false;
				System.out.println("注册成功！请牢记用户名和密码。");
			}
		} while (bl);
	}
}
