package cn.wd.fengzhuang;

public class PeopleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		People pp = new People();
		
		//��װǰ
/*		pp.name = "����";
		pp.sex = '��';
		pp.age = 21;*/
		
/*		pp.setAge(121);
		System.out.println("����Ϊ��" + pp.getAge1());
*/
		
		//��װ��
		pp.setName("����");
		pp.setSex('��');
		pp.setAge(22);
		pp.show();
	}

}
