package cn.wd.day04;

public class CustomerDemo {
	
	String[] names = new String[30];
	
	public void add(String name){
		for (int i = 0; i < names.length; i++) {
			if(names[i] == null){
				names[i] = name;
				break;
			}
		}
	}
	
	public void show(){
		System.out.println("*************************************");
		System.out.println("客户姓名列表：");
		System.out.println("*************************************");
		for (int i = 0; i < names.length; i++) {
			if(names[i] == null){
				break;
			}
			System.out.print(names[i] + "\t");
		}
	}
	
	public boolean search(String name){
		for (int i = 0; i < names.length; i++) {
			if(names[i] != null){
				if(names[i].equals(name)){
					return true;
				}
			}else break;
		}
		return false;
	}
}
