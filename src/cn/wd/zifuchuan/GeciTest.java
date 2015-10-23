package cn.wd.zifuchuan;

public class GeciTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山";
		String[ ] printword = words.split(" ");
		for (int i = 0; i < printword.length; i++) {
			System.out.println(printword[i]);
		}
	}
}
