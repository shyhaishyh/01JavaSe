package cn.wd.duotai;

public class Penguin extends Pet {

	@Override
	public void cure() {
		System.out.println("��죺��ҩ��������");
		
	}

	public void swimming() {
		System.out.println("��Ӿ");
	}
	
	public Penguin(){
		
	}
	public Penguin(String name){
		super.name = name;
	}

	@Override
	public void eat() {
		System.out.println("���" + super.getName() + 
		"�Ա���������ֵ����3");
		
	}

}
