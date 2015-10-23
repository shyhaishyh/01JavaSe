package cn.wd.jicheng;

public class Dog extends Pet {
	
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public Dog() {
		super();
	}
	
	public Dog(String name,int health,int love,String strain){
		super(name,health,love);	//继承父类
		this.strain = strain;
	}

	@Override
	public void print() {
		System.out.println("我的名字叫" + super.getName() +
					"，我的健康值是" + super.getHealth() +
					"，我和主人的亲密程度是" + super.getLove() +
					"，我的种类是  " + this.strain );
		
	}
	
	
}
