package cn.wd.leiyuduixiang;

public class Tickets {

	String name;
	int age;
	
	public void show(){
		if(age >= 18){
		    System.out.println(name + "的年龄为：" + age + "，门票价格为20元");
		}else if(age >= 6){
			System.out.println(name + "的年龄为：" + age + "，门票价格为10元");
		}else{
			System.out.println(name + "的年龄为：" + age + "，门票免费");
		}
	}
}