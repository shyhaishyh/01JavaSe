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
			System.out.println("�����û������������");
		}
	}
	
	public String again(){
		System.out.print("\n�����������룺");
		String npwd = sc.next();
		System.out.print("���ٴ����������룺");
		String apwd = sc.next();
		if(npwd.equals(apwd)){
//			System.out.println("�޸�����ɹ�������������Ϊ��" +npwd);
			pwd = npwd;
			return pwd;
		}else{
			System.out.print("������������벻һ�£����������룡");
			again();	
		}	
		return null;
	}
}
