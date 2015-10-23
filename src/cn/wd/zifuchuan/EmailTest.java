package cn.wd.zifuchuan;

import java.util.Scanner;

public class EmailTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("---欢迎进入作业提交系统---");
		System.out.print("请输入Java文件名：");
		String jname = sc.next();
		System.out.print("请输入您的邮箱：");
		String ename = sc.next();
		String jlenth = ".java";
		if(!(jname.lastIndexOf(jlenth) == jname.length() - jlenth.length())){
			System.out.println("您输入的不是java文件\n作业提交失败！");
		}else if(!(ename.indexOf("@")!=-1 && ename.indexOf(".")>ename.indexOf("@"))){
			//找不到@就返回-1，!=-1就是可以找到。
			System.out.println("E-mail无效！\n作业提交失败！");
		}else{
			System.out.println("作业提交成功！");
		}
	}
}
