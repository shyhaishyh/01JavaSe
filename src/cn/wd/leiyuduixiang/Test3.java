package cn.wd.leiyuduixiang;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ScoreCalc score = new ScoreCalc();
		System.out.print("请输入Java的成绩：");
		score.sjava = sc.nextInt();
		System.out.print("请输入C#的成绩：");
		score.sc = sc.nextInt();
		System.out.print("请输入DB的成绩：");
		score.sdb = sc.nextInt();
		score.show();
	}
}
