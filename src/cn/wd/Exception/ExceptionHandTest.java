package cn.wd.Exception;

import java.util.Scanner;

public class ExceptionHandTest {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ExceptionHand exh = new ExceptionHand();
		System.out.print("请输入选择的课程：");
		try {
			exh.Exceptions(sc.nextInt());
		} catch (Exception e) {			
			System.out.println("输入有误！");
			e.printStackTrace();
		}finally{   //finally：无论上面结果如何，最后总会输出此方法
			System.out.println("欢迎提出建议！");
		}

	}
}
