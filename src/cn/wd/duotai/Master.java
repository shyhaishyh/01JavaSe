package cn.wd.duotai;

public class Master {
	
	public void cure(Pet pet){
		pet.cure();
	}
	
	public void play(Pet pet){
		if(pet instanceof Dog){
			Dog dog = (Dog)pet;
			dog.catchingFlyDisc();
		}else if(pet instanceof Penguin){
			Penguin penguin = (Penguin)pet;
			penguin.swimming();
		}
	}
	
	public void eat(Pet pet){
		pet.eat();
	}

}
