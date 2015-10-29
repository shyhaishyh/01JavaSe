package cn.wd.jihe;

import java.util.ArrayList;
import java.util.List;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("欧欧","雪纳瑞");
		Dog dog2 = new Dog("亚亚","拉布拉多");
		Dog dog3 = new Dog("木木","阿拉斯加");
		Dog dog4 = new Dog("美美","约克夏");
		
		List<Dog> list = new ArrayList<Dog>();//一维数组型  ArrayList实现了长度可变的数组，在内存中分配连续的空间。遍历元素和随机访问元素的效率比较高
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
			System.out.println("\n集合中包含美美的信息");
		}else{
			System.out.println("\n集合中不包含美美的信息");
		}
	}
}
