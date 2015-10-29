package cn.wd.jihe;

import java.util.LinkedList;

public class DogTest2 {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("欧欧","雪纳瑞");
		Dog dog2 = new Dog("亚亚","拉布拉多");
		Dog dog3 = new Dog("木木","阿拉斯加");
		Dog dog4 = new Dog("美美","约克夏");
		
		LinkedList<Dog> list = new LinkedList<Dog>();//LinkedList采用链表存储方式。插入、删除元素时效率比较高
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		list.add(dog4);
		
		Dog dogFirst = list.getFirst();
		System.out.println("第一条狗狗的昵称是：" + dogFirst);
		
		Dog dogLast = list.getLast();
		System.out.println("最后一条狗狗的昵称是：" + dogLast);
		
	}
}
