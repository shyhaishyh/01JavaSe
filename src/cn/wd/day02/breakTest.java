package cn.wd.day02;

public class breakTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	        for (int i = 0; i < 5; i++) {
	            System.out.println("I ��ֵ�ǣ�"+i);
	            for (int j = 0; j < 4; j++) {
	                System.out.println("J ��ֵ�ǣ�"+j);
	                for (int m = 0; m < 3; m++) {
	                    if(m==2){
	                        System.out.println("M ��ֵ�ǣ�"+m+" ���������ѭ��");
	                        break;
	                    }else{
	                        System.out.println("M ��ֵ�ǣ�"+m);
	                    }
	                }
	            }
	        }
	    }
	}

