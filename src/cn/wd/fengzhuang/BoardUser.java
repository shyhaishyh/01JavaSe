package cn.wd.fengzhuang;

public class BoardUser {
	
	int uId;
	String uName;
	String uPass;
	char uSex;
	
	public void getUserInfo(){
		System.out.println("====�û���Ϣ====");
		System.out.println("�û�����" + uName);
		System.out.println("�û����룺" + uPass);
		System.out.println("�Ա�" + uSex);
		
	}

}
