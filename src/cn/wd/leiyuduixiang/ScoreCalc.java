package cn.wd.leiyuduixiang;

public class ScoreCalc {
	
	int sjava;
	int sc;
	int sdb;
	int sum;
	int avg;
	
	public void show(){
		sum = sjava + sc + sdb;
		avg = sum/3;
		System.out.println("总成绩是：" + sum);
		System.out.println("平均成绩是：" + avg);
	}
	

}
