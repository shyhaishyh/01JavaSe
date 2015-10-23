package cn.wd.jihe;

import java.util.LinkedList;
import java.util.Scanner;

public class DogTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String flag;
		LinkedList<Dog> list = new LinkedList<Dog>();
		do {
			Dog dog = new Dog();
			System.out.print("请输入狗狗的名字：");
			dog.name = sc.next();
			System.out.print("请输入狗狗的种类：");
			dog.leixing = sc.next(); 
			System.out.print("是否继续输入：（y/n）");
			flag = sc.next();
			list.add(dog);
		} while ("y".equals(flag));
		
		Dog dog1 = new Dog();
		System.out.print("请输入第一条狗狗的名字：");
		dog1.name = sc.next();
		System.out.print("请输入第一条狗狗的类型：");
		dog1.leixing = sc.next();
		list.addFirst(dog1);
		
		Dog dog2 = new Dog();
		System.out.print("请输入最后一条狗狗的名字：");
		dog2.name = sc.next();
		System.out.print("请输入最后一条狗狗的类型：");
		dog2.leixing = sc.next();
		list.addFirst(dog2);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("\n" + list.get(i));
//		}
		list.removeFirst();
		System.out.println();
		for(Dog dog : list){
			System.out.println(dog);
		}				
	}
}
