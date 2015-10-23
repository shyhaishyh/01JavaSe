package cn.wd.day04;

import java.util.Arrays;

public class FiveStudent {
	
/*	String[] students = new String[30];  */
	String[] students = new String[5];
	
	public void add(String name){
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null){
				students[i] = name;
				break;
			}
		}
	}
	
	/*public void show(){
		System.out.println("****ÅÅÐòºó****");
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null){
				Arrays.sort(students);
				System.out.print(students[i] + "\t");
				break;
			}
		}
	}*/
	public String[] show(){
		Arrays.sort(students);
		return students;
	}
	
}
