package cn.wd.jihe;

import java.util.LinkedList;

public class DogTest2 {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("ŷŷ","ѩ����");
		Dog dog2 = new Dog("����","��������");
		Dog dog3 = new Dog("ľľ","����˹��");
		Dog dog4 = new Dog("����","Լ����");
		
		LinkedList<Dog> list = new LinkedList<Dog>();//LinkedList��������洢��ʽ�����롢ɾ��Ԫ��ʱЧ�ʱȽϸ�
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		list.add(dog4);
		
		Dog dogFirst = list.getFirst();
		System.out.println("��һ���������ǳ��ǣ�" + dogFirst);
		
		Dog dogLast = list.getLast();
		System.out.println("���һ���������ǳ��ǣ�" + dogLast);
		
	}
}
