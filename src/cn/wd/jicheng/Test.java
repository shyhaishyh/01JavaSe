package cn.wd.jicheng;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		/*
		Dog dog = new Dog("贝贝",100, 90,"哈士奇");
		System.out.println("名字：" + dog.getName() + "\t健康值：" + dog.getHealth() + "\t亲密度：" + dog.getLove() + 
				"\t品种：" + dog.getStrain());
		
		Penguin pg = new Penguin();
		pg.setName("妞妞");
		pg.setHealth(100);
		pg.setLove(100);
		pg.setSex("Q妹");
		System.out.println("名字：" + pg.getName() + "\t健康值：" + pg.getHealth() + "\t亲密度：" + pg.getLove() + 
				"\t品种：" + pg.getSex());
		*/
		Dog dog = new Dog();
		Penguin pg = new Penguin();
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店");
		System.out.print("请输入要领养宠物的名字：");
		String name = sc.next();
		
		System.out.print("请选择要领养的宠物类型：（1、狗狗  2、企鹅）");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			dog.setName(name);
			System.out.print("请选择狗狗的种类：（1、阿拉斯加  2、喜乐蒂）");
			int choice1 = sc.nextInt();
			switch (choice1) {
			case 1:
				dog.setStrain("阿拉斯加");
				dog.print();
				break;

			case 2:
				dog.setStrain("喜乐蒂");
				dog.print();
				break;
			}
			break;

		case 2:
			pg.setName(name);
			System.out.print("请选择企鹅的性别：（1、Q仔  2、Q妹）");
			int choice2 = sc.nextInt();
			System.out.println("宠物的自白：");
			switch (choice2) {
			case 1:
				pg.setSex("雄");
				pg.print();
				break;

			case 2:
				pg.setSex("雌");
				pg.print();
				break;
			}
			break;
		}
	}

}
