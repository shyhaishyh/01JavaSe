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
		System.out.println("�ܳɼ��ǣ�" + sum);
		System.out.println("ƽ���ɼ��ǣ�" + avg);
	}
	

}
