package cn.wd.Exception;

public class ExceptionHand {
									
	public void Exceptions(int num) throws Exception {/*�׳��쳣*/
		switch (num) {
		case 1:
			System.out.println("ѧϰC#");
			break;
		case 2:
			System.out.println("ѧϰJava");
			break;
		case 3:
			System.out.println("ѧϰHtml");
			break;
		default:
			//�ֶ������쳣
			throw new Exception("��������");
//			break;  //�Ѿ���ֹ������break
		}
	}
}
