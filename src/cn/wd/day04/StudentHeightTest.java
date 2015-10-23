package cn.wd.day04;

import java.util.Scanner;

public class StudentHeightTest {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentHeight sh = new StudentHeight();
		
		for (int i = 1; i < 6; i++) {
			System.out.print("请输入第" + i + "名学生的身高（cm）：");
			sh.add(sc.nextInt());
		}
		double avg = sh.getHeight();
		System.out.println("***这5名学生的平均身高为：" + avg + "cm****");
	}

}
