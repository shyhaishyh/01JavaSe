package cn.wd.day04;

public class Bank02 {
	
	private int newmoney = 0;
	
	public void add(int money){
		newmoney += money;
		System.out.println("���ɹ���");
		bank();
	}
	
	public void take(int money){
		newmoney -= money;
		System.out.println("ȡ��ɹ���");
		bank();
	}
	
	public void bank(){
		System.out.println("****�����˻����Ϊ��" + newmoney + "****\n");
	}

}
