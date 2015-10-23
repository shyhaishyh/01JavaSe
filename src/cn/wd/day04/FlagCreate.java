package cn.wd.day04;

public class FlagCreate {

	
	public void creat(int num,String flag){
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(flag);
			}
			System.out.println();
		}
	}
	
}
