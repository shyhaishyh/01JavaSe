package cn.wd.leiyuduixiang;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ScoreCalc score = new ScoreCalc();
		System.out.print("������Java�ĳɼ���");
		score.sjava = sc.nextInt();
		System.out.print("������C#�ĳɼ���");
		score.sc = sc.nextInt();
		System.out.print("������DB�ĳɼ���");
		score.sdb = sc.nextInt();
		score.show();
	}
}
