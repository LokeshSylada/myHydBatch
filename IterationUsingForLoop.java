package com.technoelevate.collection.iterations;

import java.util.LinkedList;

public class IterationUsingForLoop {
		static LinkedList myList = new LinkedList();
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
			for(int i=0;i<myList.size();i++) {
				Politics list = (Politics) myList.get(i);
				System.out.println(list.getName());
			}
		}

}
