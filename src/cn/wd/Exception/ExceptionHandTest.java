package cn.wd.Exception;

import java.util.Scanner;

public class ExceptionHandTest {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ExceptionHand exh = new ExceptionHand();
		System.out.print("������ѡ��Ŀγ̣�");
		try {
			exh.Exceptions(sc.nextInt());
		} catch (Exception e) {			
			System.out.println("��������");
			e.printStackTrace();
		}finally{   //finally��������������Σ�����ܻ�����˷���
			System.out.println("��ӭ������飡");
		}

	}
}
