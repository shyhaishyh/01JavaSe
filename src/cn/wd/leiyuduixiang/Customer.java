package cn.wd.leiyuduixiang;

public class Customer {
	
	String card;
	int score;
	
	public void show(){
		if(card.equals("��") && score >1000 
				|| card.equals("�տ�") && score>5000){
			System.out.println("���֣�" + score +"�������ͣ�" + card);
			System.out.println("����500���֣�");
		}else{
			System.out.println("���֣�" + score +"�������ͣ�" + card);
			System.out.println("���������������");
		}
	}

}
