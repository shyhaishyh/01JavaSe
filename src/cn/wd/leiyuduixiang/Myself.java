package cn.wd.leiyuduixiang;

import java.util.Scanner;

public class Myself {
	String username;
	String password;
	
	Scanner sc = new Scanner(System.in);
	public void login(){
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ");
		System.out.println("\t\t\t1����¼ϵͳ");
		System.out.println("\t\t\t2����	��");
		System.out.println("*****************************************************************");
		System.out.print("��ѡ�����֣�");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			System.out.print("�������û�����");
			String username = sc.next();
			System.out.print("���������룺");
			String password = sc.next();
			if(username.equals("TOM") && password.equals("1234")){
				System.out.println("��ϲ����¼�ɹ���");
				caidan();
			}else{
				System.out.print("�û��������������û��Ȩ�޽��룡��0���ԣ�");
				int again = sc.nextInt();
				if(again == 0){
					login();
				}else{
					System.out.println("ллʹ�ã�");
				}
			}
			break;
		case 2:
			System.out.println("ллʹ�ã�");
			break;
		default:
			System.out.println("�������������ԣ�");
			break;
		}
	}
	
	public void caidan(){
		System.out.println("\t\t�������ع������ϵͳ���˵�");
		System.out.println("*****************************************************************");
		System.out.println("\t\t\t1���ͻ���Ϣ����");
		System.out.println("\t\t\t2���������");
		System.out.println("*****************************************************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
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
			System.out.println("�������������ԣ�");
			break;
		}
	}
	
	public void cus(){
		System.out.println("�ͻ���������������أ�");
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
		System.out.println("\t\t�������ع������ϵͳ����>�������");
		System.out.println("*****************************************************************");
		System.out.println("\t\t\t1�����˴����");
		System.out.println("\t\t\t2�����˳齱");
		System.out.println("*****************************************************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("���˴���ͣ�");
			break;
		case 2:
			System.out.println("���˳齱��");
			break;
		case 0:
			caidan();
			break;
		default:
			break;
		}
		
	}
}
