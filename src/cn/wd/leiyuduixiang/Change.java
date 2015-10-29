package cn.wd.leiyuduixiang;

import java.util.Scanner;

public class Change {
	
	String name;
	String pwd;
	String npwd;
	String apwd;
	Scanner sc = new Scanner(System.in);
	public void show(){
		if(name.equals("admin1") && pwd.equals("11111")){
			again();
		}else{
			System.out.println("输入用户名或密码错误！");
		}
	}
	
	public String again(){
		System.out.print("\n请输入新密码：");
		String npwd = sc.next();
		System.out.print("请再次输入新密码：");
		String apwd = sc.next();
		if(npwd.equals(apwd)){
//			System.out.println("修改密码成功，您的新密码为：" +npwd);
			pwd = npwd;
			return pwd;
		}else{
			System.out.print("两次输入的密码不一致，请重新输入！");
			again();	
		}	
		return null;
	}
}
