package cn.wd.zifuchuan;

public class ShopLogin extends Shopp{
	
	public boolean login(String name,String pwd){
		if(super.getName().equals(name)&&super.getPwd().equals(pwd)){
			System.out.println("��¼�ɹ���");
			return true;
		}
		return false;
	}

}
