package cn.wd.fengzhuang;


public class Wordtests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int x = 4;
//		int y = 2;
//		int z = x^y ;
//		System.out.println(z);
		
/*		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y;
		if(x < 1){
			y = x;
		}else if(x < 10){
			y = 3 * x - 2;
		}else{
			y = 4 * x;
		}
*/	
/*		int k;
		for (k=1;k<=5;k++)
		{
		if (k>4) break;
		System.out.println("k="+k);
		}*/
/*		int sum = 0;
		for (int k = 1; k <= 10; k++) {
			sum += k * k;
		}
		System.out.println(sum);*/
		
/*		System.out.println("输入三个数：");
		Scanner sc = new Scanner(System.in);
		int[] shu = new int[3];
		for (int i = 0; i < shu.length; i++) {
			shu[i]= sc.nextInt();
		}
		Arrays.sort(shu);
		for (int i = shu.length - 1; i >= 0; i--) {
			System.out.print(shu[i] + "\t");
		}*/
		
		/*System.out.println("1~100内的素数为");
		for (int i = 2; i <= 100; i++) {
			int n = i / 2;
			int flag = 1;
			for (int h = 2; h <= n; h++) {
				if (i % h == 0) {
					flag = 0;
					break;
				}
			}
			if (flag != 0)
				System.out.print(i+"\t");
		}*/
/*		int i,j;
		for (i=1;i<10;i++){
		for (j=1;j<10;j++){
		System.out.print(i+"*"+j+"="+i*j+"");
		}
		     System.out.println();
		}
		 */
	/*	  int[] arr = {3,1,6,4,5,10,2,55,-22};
		    Arrays.sort(arr);
		    System.out.println("最大值：" + arr[arr.length-1] +"\n最小值：" + arr[0]);
		    for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+"\t");}*/
		String x = "*";
		for (int i = 1; i <= 4; i++) {
			for (int j = 7; j <= i; j+=2) {
				System.out.print(x);
			}
			System.out.println();
		}
	}	
}
