package cn.wd.day02;

import java.util.Scanner;

public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("��������ǣ�");
		int mingci = sc.nextInt();
		switch(mingci){
		case 1:
			System.out.println("�μ���ʡ����ѧ��֯��1��������Ӫ");
			break;
		case 2:
			System.out.println("�������ձʼǱ�����һ��");
			break;
		case 3:
			System.out.println("�����ƶ�Ӳ��һ��");
			break;
		default:
			System.out.println("û���κν���");
			break;
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���������ѽ�");
		int money = sc.nextInt();
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1����50Ԫ����2Ԫ�������¿���1ƿ");
		System.out.println("2����100Ԫ����3Ԫ����500ml����һƿ");
		System.out.println("3����100Ԫ����10Ԫ����5�������");
		System.out.println("4����200Ԫ����10Ԫ����1���ղ������˹�");
		System.out.println("5����200Ԫ����20Ԫ����ŷ����ˬ��ˮһƿ");
		System.out.println("0��������");
		System.out.println("��ѡ��");
		int choice = sc.nextInt();
		if(choice == 0){
			System.out.println("���������ܽ�" + (double)money);
			System.out.println("��������");
		}else{
			double newMoney = 0;
			String sh = null;
			if(money < 50){
				System.out.println("�����㻻��������");
				newMoney = money;
				sh = "������";
			}else if(money < 100)
				switch(choice){
				case 1:
					newMoney = money + 2;
					sh = "���¿���1ƿ";
					break;
				}else if(money < 200){
					switch(choice){	
					case 1:
						newMoney = money + 2;
						sh = "���¿���1ƿ";
						break;
					case 2:
						newMoney = money + 3;
						sh = "500ml����һƿ";
						break;
					case 3:
						newMoney = money + 10;
						sh = "5�������";
						break;
					}
				}else{
						switch(choice){	
						case 1:
							newMoney = money + 2;
							sh = "���¿���1ƿ";
							break;
						case 2:
							newMoney = money + 3;
							sh = "500ml����һƿ";
							break;
						case 3:
							newMoney = money + 10;
							sh = "5�������";
							break;
						case 4:
							newMoney = money + 10;
							sh = "1���ղ������˹�";
							break;
						case 5:
							newMoney = money + 10;
							sh = "ŷ����ˬ��ˮһƿ";
							break;
					}
			}
			System.out.println("���������ܽ�" + newMoney);
			System.out.println("�ɹ�������" + sh);
		}
	}
}
