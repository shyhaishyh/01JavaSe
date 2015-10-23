package cn.wd.zifuchuan;

import java.util.Scanner;

public class PointTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÒ»´®×Ö·û£º");
		StringBuffer sb = new StringBuffer(sc.next());
		for (int i = sb.length() - 3; i > 0; i = i - 3) {
			sb.insert(i, ",");
		}
		System.out.println(sb);
	}

}
