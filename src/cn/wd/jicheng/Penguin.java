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
		System.out.println("�ҵ����ֽ�" + super.getName() +
				"���ҵĽ���ֵ��" + super.getHealth() +
				"���Һ����˵����̶ܳ���" + super.getLove() +
				"���ҵ��Ա���  " + this.sex );
	}
}
