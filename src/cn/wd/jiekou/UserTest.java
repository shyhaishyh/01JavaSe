package cn.wd.jiekou;

import java.util.Scanner;

//������
public class UserTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UserDaoImpl ud = new UserDaoImpl();
		System.out.println("====�û���Ϣ====");
		System.out.print("������Ҫ���ҵ��û�����");
		ud.findUser(sc.next());
		
	}
}
