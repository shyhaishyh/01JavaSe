package cn.wd.jihe;

import java.util.ArrayList;
import java.util.List;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("ŷŷ","ѩ����");
		Dog dog2 = new Dog("����","��������");
		Dog dog3 = new Dog("ľľ","����˹��");
		Dog dog4 = new Dog("����","Լ����");
		
		List<Dog> list = new ArrayList<Dog>();//һά������  ArrayListʵ���˳��ȿɱ�����飬���ڴ��з��������Ŀռ䡣����Ԫ�غ��������Ԫ�ص�Ч�ʱȽϸ�
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		list.add(dog4);
		list.remove(dog4);
		for (int i = 0; i < list.size(); i++) {
/*			Dog dog = list.get(i);
			System.out.println(dog.getName() + "\t" + dog.getLeixing());
			Dog dog = (Dog)list.get(i);
			*/
			System.out.println(list.get(i));
		}
		if(list.contains(dog4)){
			System.out.println("\n�����а�����������Ϣ");
		}else{
			System.out.println("\n�����в�������������Ϣ");
		}
	}
}
