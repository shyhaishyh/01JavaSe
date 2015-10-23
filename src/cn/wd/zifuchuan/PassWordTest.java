package cn.wd.zifuchuan;

import java.util.Scanner;

public class PassWordTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入用户名：");
		sc.next();
		System.out.print("请输入密码：");
		String pwd = sc.next();
		if(pwd.length() < 6){
			System.out.println("密码长度不能小于6位！");
		}else{
			System.out.println("注册成功！");
		}
	}
}
