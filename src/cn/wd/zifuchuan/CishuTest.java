package cn.wd.zifuchuan;

import java.util.Scanner;

public class CishuTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String word = sc.next();
		System.out.print("请输入要查找的字符：");
		char search = sc.next().charAt(0);
		int num = 0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == search){
				num++;
			}
		}
		System.out.println("“" + word + "”" + "中包含" + num + "个" + "“" +  search + "”");	
	}
}
