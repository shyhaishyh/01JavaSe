package cn.wd.day02;

import java.util.Scanner;

public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("你的名次是：");
		int mingci = sc.nextInt();
		switch(mingci){
		case 1:
			System.out.println("参加麻省理工大学组织的1个月夏令营");
			break;
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
			break;
		case 3:
			System.out.println("奖励移动硬盘一个");
			break;
		default:
			System.out.println("没有任何奖励");
			break;
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		int money = sc.nextInt();
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1：满50元，加2元换购百事可乐1瓶");
		System.out.println("2：满100元，加3元换购500ml可乐一瓶");
		System.out.println("3：满100元，加10元换购5公斤面粉");
		System.out.println("4：满200元，加10元换购1个苏泊尔炒菜锅");
		System.out.println("5：满200元，加20元换购欧莱雅爽肤水一瓶");
		System.out.println("0：不换购");
		System.out.println("请选择：");
		int choice = sc.nextInt();
		if(choice == 0){
			System.out.println("本次消费总金额：" + (double)money);
			System.out.println("不换购！");
		}else{
			double newMoney = 0;
			String sh = null;
			if(money < 50){
				System.out.println("不满足换购条件！");
				newMoney = money;
				sh = "不换购";
			}else if(money < 100)
				switch(choice){
				case 1:
					newMoney = money + 2;
					sh = "百事可乐1瓶";
					break;
				}else if(money < 200){
					switch(choice){	
					case 1:
						newMoney = money + 2;
						sh = "百事可乐1瓶";
						break;
					case 2:
						newMoney = money + 3;
						sh = "500ml可乐一瓶";
						break;
					case 3:
						newMoney = money + 10;
						sh = "5公斤面粉";
						break;
					}
				}else{
						switch(choice){	
						case 1:
							newMoney = money + 2;
							sh = "百事可乐1瓶";
							break;
						case 2:
							newMoney = money + 3;
							sh = "500ml可乐一瓶";
							break;
						case 3:
							newMoney = money + 10;
							sh = "5公斤面粉";
							break;
						case 4:
							newMoney = money + 10;
							sh = "1个苏泊尔炒菜锅";
							break;
						case 5:
							newMoney = money + 10;
							sh = "欧莱雅爽肤水一瓶";
							break;
					}
			}
			System.out.println("本次消费总金额：" + newMoney);
			System.out.println("成功换购：" + sh);
		}
	}
}
