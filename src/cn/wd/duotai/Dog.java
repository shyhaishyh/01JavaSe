package cn.wd.duotai;

public class Dog extends Pet {

	String strain;

	@Override
	public void cure() {
		System.out.println("���������룬��ҩ��");
	}

	public void catchingFlyDisc() {
		System.out.println("�ӷ�����Ϸ��");
	}
	
	public Dog() {
		super();
	}

	public Dog(String name) {
		super.name = name;
	}

	@Override
	public void eat() {
		super.health = super.health + 5;
		if(super.health >= 100){
			super.health = 100;
		}
		System.out.println("����"  + super.getName() +
					"�Ա���������ֵΪ��" + super.health);
		
		
	}

	
}
