package cn.wd.duotai;

public class Test {

	
	public static void main(String[] args) {
		
		Master master = new Master();
		Pet pet = new Dog("à½à½");
/*		Pet pet = new Penguin();
		master.cure(pet);
*/
	
		master.eat(pet);
		master.play(pet);
		master.cure(pet);
	}
}
