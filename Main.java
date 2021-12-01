package com.technoelevate.collection.iterations;

public class Main {
	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList(2);
		list.addElement("Donald");
		list.addElement("Swamy");
		list.addElement("Sachin");
		System.out.println(list.size());
		list.addElement("Vijay");
		list.addElement("Lokesh");
		list.addElement("Rajesh");
		list.addElement("Ravi");
		list.addElement("Teja");
		System.out.println(list.size());
		
		System.out.println(list.getElement(5));
		list.getAllElements();
		
	}

}
