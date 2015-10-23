package cn.wd.day04;

public class StudentBiz {
	
	String[] names = new String[30];
	
	public void addName(String name){
		for (int i = 0; i < names.length;i++) {
			if(names[i] == null){
				names[i] = name;
				break; 
			}
		}
	}
	
	public void showName(){
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				break;
				}
				System.out.print(" " + names[i]);
			}
		}
	}

