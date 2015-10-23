package cn.wd.jicheng;

public class Penguin extends Pet {
	
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void print() {
		System.out.println("我的名字叫" + super.getName() +
				"，我的健康值是" + super.getHealth() +
				"，我和主人的亲密程度是" + super.getLove() +
				"，我的性别是  " + this.sex );
	}
}
