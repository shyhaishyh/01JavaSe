package cn.wd.zifuchuan;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String name = sc.next();
		System.out.print("请输入密码：");
		String pwd = sc.next();
		if("TOM".equalsIgnoreCase(name) && "12345".equals(pwd)){
			System.out.println("登录成功！");
		}else{
			System.out.println("用户名或密码不匹配，登录失败！");
		}
	}
}
