package cn.wd.day02;

import java.util.Scanner;

public class If {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("�������źƵ�JAVA�ɼ���");
		int zhangScore = sc.nextInt();
		if(zhangScore > 90){
			System.out.println("��ý�����");
		}else{
			System.out.println("û�н�����");
		}*/
		
		/*System.out.print("�������źƵ�JAVA�ɼ���");
		int zhangJava = sc.nextInt();
		System.out.print("�������źƵ����ֳɼ���");
		int zhangMusic = sc.nextInt();
		if((zhangJava > 98 && zhangMusic >80)||(zhangJava == 100 && zhangMusic >70)){
			System.out.println("��ʦ��������");
		}else{
			System.out.println("û�н�����");
		}*/
		
		System.out.println("�������Ƿ��ǻ�Ա���ǣ�y��/��n��");
		String vip = sc.next();
		System.out.println("�����빺���");
		int money = sc.nextInt();
		double nowMoney;
		if(vip.equals("y")){
			if(money >= 200){
				nowMoney = money * 0.75;
			}else{
				nowMoney = money * 0.8;
			}
		}else if(money >= 100){
			nowMoney = money * 0.9;
		}else{
			nowMoney = money;
		}
		System.out.println("ʵ��֧����" + nowMoney);
	}

}
