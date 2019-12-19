package com.class32;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		
		ArrayList<String>ArrList=new ArrayList<>();
		ArrList.add("John");
		ArrList.add("mia");
		ArrList.add("nick");
		ArrList.add("tom");
		ArrList.add("nil");
		
		System.out.println(ArrList.isEmpty());
       System.out.println(ArrList.contains("John"));
       System.out.println(ArrList.size());
       System.out.println(ArrList);

	}

}

