package cn.wd.duotai;

public abstract class Pet {
	
	String name;
	int health = 100;
	int love = 70;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public abstract void cure();
	
	public abstract void eat();
}
