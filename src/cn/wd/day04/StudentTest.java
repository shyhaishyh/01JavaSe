package cn.wd.day04;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		/*
		StudentBiz st = new StudentBiz();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("请输入学生姓名：");
            String newName = input.next();	
            st.addName(newName);
        }
        st.showName();	*/
		
		String name;
		Scanner input = new Scanner(System.in);
		StudentDemo sd = new StudentDemo();
		for(int i=0;i<5;i++){
			System.out.print("请输入学生姓名：");
			name = input.next();
			sd.add(name);
		} 
		System.out.println("本班学生列表：");
		sd.show();
		
		System.out.print("\n\n请输入要修改的学生姓名：");
		String oldname = input.next();
		System.out.print("请输入新的学生姓名：");
		String newname = input.next();
		System.out.println("*****修改结果*****");
		if( sd.editName(oldname, newname) ){
			System.out.println("找到并修改成功！");
		}else{
			System.out.println("没找到该学生！");
		}
		sd.show();	
	}
}
