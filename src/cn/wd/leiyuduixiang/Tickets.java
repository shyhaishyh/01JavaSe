package cn.wd.leiyuduixiang;

public class Tickets {

	String name;
	int age;
	
	public void show(){
		if(age >= 18){
		    System.out.println(name + "������Ϊ��" + age + "����Ʊ�۸�Ϊ20Ԫ");
		}else if(age >= 6){
			System.out.println(name + "������Ϊ��" + age + "����Ʊ�۸�Ϊ10Ԫ");
		}else{
			System.out.println(name + "������Ϊ��" + age + "����Ʊ���");
		}
	}
}