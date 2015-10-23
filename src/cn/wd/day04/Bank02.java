package cn.wd.day04;

public class Bank02 {
	
	private int newmoney = 0;
	
	public void add(int money){
		newmoney += money;
		System.out.println("存款成功！");
		bank();
	}
	
	public void take(int money){
		newmoney -= money;
		System.out.println("取款成功！");
		bank();
	}
	
	public void bank(){
		System.out.println("****您的账户余额为：" + newmoney + "****\n");
	}

}
