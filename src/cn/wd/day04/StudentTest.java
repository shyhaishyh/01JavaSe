package cn.wd.day04;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		/*
		StudentBiz st = new StudentBiz();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("������ѧ��������");
            String newName = input.next();	
            st.addName(newName);
        }
        st.showName();	*/
		
		String name;
		Scanner input = new Scanner(System.in);
		StudentDemo sd = new StudentDemo();
		for(int i=0;i<5;i++){
			System.out.print("������ѧ��������");
			name = input.next();
			sd.add(name);
		} 
		System.out.println("����ѧ���б�");
		sd.show();
		
		System.out.print("\n\n������Ҫ�޸ĵ�ѧ��������");
		String oldname = input.next();
		System.out.print("�������µ�ѧ��������");
		String newname = input.next();
		System.out.println("*****�޸Ľ��*****");
		if( sd.editName(oldname, newname) ){
			System.out.println("�ҵ����޸ĳɹ���");
		}else{
			System.out.println("û�ҵ���ѧ����");
		}
		sd.show();	
	}
}
