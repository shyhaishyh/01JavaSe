package cn.wd.duotai;

public class Penguin extends Pet {

	@Override
	public void cure() {
		System.out.println("企鹅：吃药，疗养！");
		
	}

	public void swimming() {
		System.out.println("游泳");
	}
	
	public Penguin(){
		
	}
	public Penguin(String name){
		super.name = name;
	}

	@Override
	public void eat() {
		System.out.println("企鹅" + super.getName() + 
		"吃饱啦！健康值增加3");
		
	}

}
