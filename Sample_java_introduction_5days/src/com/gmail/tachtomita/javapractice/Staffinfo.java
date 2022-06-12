package com.gmail.tachtomita.javapractice;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello, " + this.name);
	}
}

public class Staffinfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Staff yamada = new Staff();
		yamada.name = "Yamada Takayuki";
		yamada.staffid = 1232;
		
		System.out.println(yamada);
		yamada.sayhello();
	}
}
