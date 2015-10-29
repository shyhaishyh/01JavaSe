package cn.wd.fengzhuang;

public class PeopleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		People pp = new People();
		
		//封装前
/*		pp.name = "张三";
		pp.sex = '男';
		pp.age = 21;*/
		
/*		pp.setAge(121);
		System.out.println("年龄为：" + pp.getAge1());
*/
		
		//封装后
		pp.setName("李四");
		pp.setSex('男');
		pp.setAge(22);
		pp.show();
	}

}
