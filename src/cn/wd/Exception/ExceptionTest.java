package cn.wd.Exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 0;
		try {
			System.out.println("异常之前");
			System.out.println("相除的结果是：" + num1/num2);
		} catch (Exception e) {
			System.out.println("异常之后");
//			e.printStackTrace();	//打印异常
		}
		
		System.out.println("相加的结果是：" + (num1+num2));
		System.out.println("相减的结果是：" + (num1-num2));

	}

}
