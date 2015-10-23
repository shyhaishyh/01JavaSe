package cn.wd.day04;

public class VipManager {
	
	Vip[] vips = new Vip[30];
	
	public void addVip(Vip vip){
		for (int i = 0; i < vips.length; i++) {
			if(vips[i] == null){
//				vips[i].name = vip.name;
//				vips[i].score = vip.score;
				vips[i] = vip;
				break;
			}
		}
	}
	
	public void showVip(){
		System.out.println("***会员列表***");
		System.out.println("编号\t积分");
		for (int i = 0; i < vips.length; i++) {
			if(vips[i] == null){
				break;
			}
			System.out.println(vips[i].name + "\t" +vips[i].score);
		}
	}
	
	public void search(String name){
		for (int i = 0; i < vips.length; i++) {
			if(vips[i] != null){
				if(vips[i].name.equals(name)){
					System.out.println("该会员的积分为：" + vips[i].score);
				}
			}
		}
	}
}
