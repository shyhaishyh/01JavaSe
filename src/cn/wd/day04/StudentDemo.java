package cn.wd.day04;

public class StudentDemo {
	
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
		for (int i = 0; i < names.length; i++) {
			if(names[i] == null){
				break;
			}
			System.out.print(names[i] + "\t");
		}
	}
	
	public boolean editName(String oldName,String newName){
		boolean find = false;  // �Ƿ��ҵ����޸ĳɹ���ʶ		
		  // ѭ�����飬�ҵ�����ΪoldName��Ԫ�أ��޸�ΪnewName
		  for(int i=0;i<names.length;i++){
			  if(names[i].equals(oldName)){
				  names[i] = newName;
				  find=true;
				  break;
			  }
		  }
		  return find;
	  }
}
