package cn.wd.jiekou;

import java.util.Scanner;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UserDaoImpl ud = new UserDaoImpl();
		System.out.println("====用户信息====");
		System.out.print("请输入要查找的用户名：");
		ud.findUser(sc.next());
		

	}
}
