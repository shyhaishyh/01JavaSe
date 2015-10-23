package cn.wd.leiyuduixiang;

public class Customer {
	
	String card;
	int score;
	
	public void show(){
		if(card.equals("金卡") && score >1000 
				|| card.equals("普卡") && score>5000){
			System.out.println("积分：" + score +"，卡类型：" + card);
			System.out.println("回馈500积分！");
		}else{
			System.out.println("积分：" + score +"，卡类型：" + card);
			System.out.println("不满足回馈条件！");
		}
	}

}
