package cn.wd.fengzhuang;

public class BoardUser {
	
	int uId;
	String uName;
	String uPass;
	char uSex;
	
	public void getUserInfo(){
		System.out.println("====用户信息====");
		System.out.println("用户名：" + uName);
		System.out.println("用户密码：" + uPass);
		System.out.println("性别：" + uSex);
		
	}

}
