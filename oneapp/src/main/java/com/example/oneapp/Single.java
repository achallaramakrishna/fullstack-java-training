package com.example.oneapp;

// refactor this code
public class Single {
	
	// private static int count;
	private int num;
	
	private static Single single;
	
	// private constructor
	private Single() {
		//count++;
	}
	
	public static Single getInstance() {
		if(single == null) {
			single = new Single();
		}
		return single;
	}
	
	//public static int getCount() {
	//	return count;
	//}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	

}
