package cn.wd.day04;

public class StudentHeight {
	
	int[] heights = new int[5];
	
	public void add(int name){
		for (int i = 0; i < 5; i++) {
			if(heights[i] == 0){
				heights[i] = name;
				break;
			}
		}
	}
	
	public double getHeight(){
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < heights.length; i++) {
			sum += heights[i];
			avg = sum/heights.length;
		}
		return avg;
	}

}
