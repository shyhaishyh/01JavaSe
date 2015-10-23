package cn.wd.leiyuduixiang;

import java.util.Scanner;

public class Myself {
	String username;
	String password;
	
	Scanner sc = new Scanner(System.in);
	public void login(){
		System.out.println("\t\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t\t1、登录系统");
		System.out.println("\t\t\t2、退	出");
		System.out.println("*****************************************************************");
		System.out.print("请选择数字：");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			System.out.print("请输入用户名：");
			String username = sc.next();
			System.out.print("请输入密码：");
			String password = sc.next();
			if(username.equals("TOM") && password.equals("1234")){
				System.out.println("恭喜！登录成功！");
				caidan();
			}else{
				System.out.print("用户名或密码错误，您没有权限进入！按0重试！");
				int again = sc.nextInt();
				if(again == 0){
					login();
				}else{
					System.out.println("谢谢使用！");
				}
			}
			break;
		case 2:
			System.out.println("谢谢使用！");
			break;
		default:
			System.out.println("输入有误，请重试！");
			break;
		}
	}
	
	public void caidan(){
		System.out.println("\t\t我行我素购物管理系统主菜单");
		System.out.println("*****************************************************************");
		System.out.println("\t\t\t1、客户信息管理");
		System.out.println("\t\t\t2、真情回馈");
		System.out.println("*****************************************************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			cus();
			break;
		case 2:
			huikui();
			break;
		case 0:
			login();
			break;
		default:
			System.out.println("输入有误，请重试！");
			break;
		}
	}
	
	public void cus(){
		System.out.println("客户管理！按任意键返回！");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			caidan();
			break;
		default:
			caidan();
			break;
		}
	}
	
	public void huikui(){
		System.out.println("\t\t我行我素购物管理系统——>真情回馈");
		System.out.println("*****************************************************************");
		System.out.println("\t\t\t1、幸运大放送");
		System.out.println("\t\t\t2、幸运抽奖");
		System.out.println("*****************************************************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("幸运大放送！");
			break;
		case 2:
			System.out.println("幸运抽奖！");
			break;
		case 0:
			caidan();
			break;
		default:
			break;
		}
		
	}
}
