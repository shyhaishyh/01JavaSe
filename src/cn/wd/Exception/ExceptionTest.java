package cn.wd.Exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 0;
		try {
			System.out.println("�쳣֮ǰ");
			System.out.println("����Ľ���ǣ�" + num1/num2);
		} catch (Exception e) {
			System.out.println("�쳣֮��");
//			e.printStackTrace();	//��ӡ�쳣
		}
		
		System.out.println("��ӵĽ���ǣ�" + (num1+num2));
		System.out.println("����Ľ���ǣ�" + (num1-num2));

	}

}
