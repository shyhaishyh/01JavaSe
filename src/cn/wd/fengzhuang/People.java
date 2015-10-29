package cn.wd.fengzhuang;

public class People {
	
	//加了private，对People进行封装
	private String name;
	private char sex;
	private int age;
	
	public void show(){
		if (age > 120 || age < 0) {
			System.out.println("您输入的年龄有误！");
		}else{
		System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
		}
	}
	public void setAge1(int age){
		if (age > 120 || age < 0) {
			System.out.println("您输入的年龄有误！");
		}else{
			this.age = age;
		}
	}
	public int getAge1(){
		return age;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public People() {
		super();
	}
	
	public People(String name, char sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	

}
