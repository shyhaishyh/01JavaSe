package cn.wd.jicheng;

//abstract �������
public abstract class Pet {
	
	private String name;
	private int health = 100;
	private int love = 20;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	
	public Pet() {
		super();
	}
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	//���󷽷���û�з����壬��������ʵ���ࣨDog���Penguin�ࣩ��ʵ�֡�
	public abstract void print();
}
