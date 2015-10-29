package cn.wd.Exception;

public class ExceptionHand {
									
	public void Exceptions(int num) throws Exception {/*抛出异常*/
		switch (num) {
		case 1:
			System.out.println("学习C#");
			break;
		case 2:
			System.out.println("学习Java");
			break;
		case 3:
			System.out.println("学习Html");
			break;
		default:
			//手动输入异常
			throw new Exception("输入有误！");
//			break;  //已经终止，无需break
		}
	}
}
