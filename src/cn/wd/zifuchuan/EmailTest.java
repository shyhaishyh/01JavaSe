package cn.wd.zifuchuan;

import java.util.Scanner;

public class EmailTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("---��ӭ������ҵ�ύϵͳ---");
		System.out.print("������Java�ļ�����");
		String jname = sc.next();
		System.out.print("�������������䣺");
		String ename = sc.next();
		String jlenth = ".java";
		if(!(jname.lastIndexOf(jlenth) == jname.length() - jlenth.length())){
			System.out.println("������Ĳ���java�ļ�\n��ҵ�ύʧ�ܣ�");
		}else if(!(ename.indexOf("@")!=-1 && ename.indexOf(".")>ename.indexOf("@"))){
			//�Ҳ���@�ͷ���-1��!=-1���ǿ����ҵ���
			System.out.println("E-mail��Ч��\n��ҵ�ύʧ�ܣ�");
		}else{
			System.out.println("��ҵ�ύ�ɹ���");
		}
	}
}
