package cn.wd.zifuchuan;

import java.util.Scanner;

public class CishuTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ���ַ�����");
		String word = sc.next();
		System.out.print("������Ҫ���ҵ��ַ���");
		char search = sc.next().charAt(0);
		int num = 0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == search){
				num++;
			}
		}
		System.out.println("��" + word + "��" + "�а���" + num + "��" + "��" +  search + "��");	
	}
}
