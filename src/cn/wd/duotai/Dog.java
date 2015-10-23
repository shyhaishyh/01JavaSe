package cn.wd.duotai;

public class Dog extends Pet {

	String strain;

	@Override
	public void cure() {
		System.out.println("¹·¹·£º´òÕë£¬³ÔÒ©£¡");
	}

	public void catchingFlyDisc() {
		System.out.println("½Ó·ÉÅÌÓÎÏ·£¡");
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
		System.out.println("¹·¹·"  + super.getName() +
					"³Ô±¥À²£¡½¡¿µÖµÎª£º" + super.health);
		
		
	}

	
}
