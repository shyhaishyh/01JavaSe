package cn.wd.leiyuduixiang;

public class Test4 {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			System.out.print(i + ",");
			while (++i < 5) {
				continue;
			}
			System.out.print(i);
		}

	}

}
