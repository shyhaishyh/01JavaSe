package cn.wd.jicheng;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		/*
		Dog dog = new Dog("����",100, 90,"��ʿ��");
		System.out.println("���֣�" + dog.getName() + "\t����ֵ��" + dog.getHealth() + "\t���ܶȣ�" + dog.getLove() + 
				"\tƷ�֣�" + dog.getStrain());
		
		Penguin pg = new Penguin();
		pg.setName("��");
		pg.setHealth(100);
		pg.setLove(100);
		pg.setSex("Q��");
		System.out.println("���֣�" + pg.getName() + "\t����ֵ��" + pg.getHealth() + "\t���ܶȣ�" + pg.getLove() + 
				"\tƷ�֣�" + pg.getSex());
		*/
		Dog dog = new Dog();
		Penguin pg = new Penguin();
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭ�����������");
		System.out.print("������Ҫ������������֣�");
		String name = sc.next();
		
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������  2����죩");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			dog.setName(name);
			System.out.print("��ѡ�񹷹������ࣺ��1������˹��  2��ϲ�ֵ٣�");
			int choice1 = sc.nextInt();
			switch (choice1) {
			case 1:
				dog.setStrain("����˹��");
				dog.print();
				break;

			case 2:
				dog.setStrain("ϲ�ֵ�");
				dog.print();
				break;
			}
			break;

		case 2:
			pg.setName(name);
			System.out.print("��ѡ�������Ա𣺣�1��Q��  2��Q�ã�");
			int choice2 = sc.nextInt();
			System.out.println("������԰ף�");
			switch (choice2) {
			case 1:
				pg.setSex("��");
				pg.print();
				break;

			case 2:
				pg.setSex("��");
				pg.print();
				break;
			}
			break;
		}
	}

}
