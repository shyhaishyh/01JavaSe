package cn.wd.day02;

public class breakTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	        for (int i = 0; i < 5; i++) {
	            System.out.println("I 的值是："+i);
	            for (int j = 0; j < 4; j++) {
	                System.out.println("J 的值是："+j);
	                for (int m = 0; m < 3; m++) {
	                    if(m==2){
	                        System.out.println("M 的值是："+m+" 跳出最里层循环");
	                        break;
	                    }else{
	                        System.out.println("M 的值是："+m);
	                    }
	                }
	            }
	        }
	    }
	}

