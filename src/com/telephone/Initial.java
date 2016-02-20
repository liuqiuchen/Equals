package com.telephone;

public class Initial {
	public static void main(String[] args) {
		//创建两个子类对象，引用地址不同，属性的值都相同
		Telephone2 t1 = new Telephone2();
		Telephone2 t2 = new Telephone2();
		
		if(t1.equals(t2)){
			System.out.println("值相同");
		}else{
			System.out.println("值不同");
		}
	}
}
