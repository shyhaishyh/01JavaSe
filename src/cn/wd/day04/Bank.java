package cn.wd.day04;

public class Bank {
	
	private int money = 0;
	public void sbank(int choice,int add){
		
		switch(choice){
		case 1:
			money = money + add;
			System.out.println("���ɹ�\n");
			System.out.println("***��ǰ���Ϊ��" + money + "***");
			break;
		case 2:
			if(money >= add){
				money = money - add;
				System.out.println("***��ǰ���Ϊ��" + money + "***");
			}else{
				System.out.println("���㣡");
			}
			break;
		case 0:
			System.out.println("ллʹ�ã�");
			break;
		default:
			System.out.println("��������");
			break;
		}
	}
}
