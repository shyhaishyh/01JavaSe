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
		super(name,health,love);	//�̳и���
		this.strain = strain;
	}

	@Override
	public void print() {
		System.out.println("�ҵ����ֽ�" + super.getName() +
					"���ҵĽ���ֵ��" + super.getHealth() +
					"���Һ����˵����̶ܳ���" + super.getLove() +
					"���ҵ�������  " + this.strain );
		
	}
	
	
}
