package com.technoelevate.collection.iterations;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratingArrayListUsingListIteratorForward {

	private static LinkedList<Politics> myList = new LinkedList<Politics>();

	public static void main(String[] args) {

		Politics p1 = new Politics("NTR         ", "  Andhra Pradesh");
		Politics p2 = new Politics("KCR         ", "  Telangana");
		Politics p3 = new Politics("Jayalalitha ", "  Tamil Nadu");
		Politics p4 = new Politics("Bommai      ", "  Karanataka");
		
		myList.add(p1);
		myList.add(p2);
		myList.add(p3);
		myList.add(p4);
		
		getPolitics();

	}
	
    public static void getPolitics() {
	
	ListIterator itr = myList.listIterator();
	
	while(itr.hasNext()) {
		Politics list = (Politics) itr.next();
		System.out.println(list.getName()+" rules "+list.getState());
	}
}	

}
