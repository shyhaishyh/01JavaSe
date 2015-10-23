package cn.wd.day04;

public class Bank {
	
	private int money = 0;
	public void sbank(int choice,int add){
		
		switch(choice){
		case 1:
			money = money + add;
			System.out.println("存款成功\n");
			System.out.println("***当前余额为：" + money + "***");
			break;
		case 2:
			if(money >= add){
				money = money - add;
				System.out.println("***当前余额为：" + money + "***");
			}else{
				System.out.println("余额不足！");
			}
			break;
		case 0:
			System.out.println("谢谢使用！");
			break;
		default:
			System.out.println("输入有误！");
			break;
		}
	}
}
