package com.technoelevate.collection.groceryshoppingcart;

import java.util.ArrayList;
import java.util.Scanner;


public class ShoppingCart {
	static ArrayList<Item> myList = new ArrayList<Item>();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		
		boolean x = true;
		while(x) {
			System.out.println("Enter your Choice");
			System.out.println("Enter 1 to Add");
			System.out.println("Enter 2 to View");
			System.out.println("Enter 3 to Remove");
			System.out.println("Enter 4 to Replace");
			System.out.println("Enter 5 to Quit");
			int choice = sc.nextInt();
			
				switch(choice) {
				case 1:
					System.out.println("Enter an products:");
					String input = sc.next();
					System.out.println("enter quantity");
					int a = sc.nextInt();
					System.out.println("enter price");
					int b = sc.nextInt();
					Item i = new Item(input,a,b);
					
					myList.add(i);
					break;
					
				case 2:
					System.out.println(myList.get(choice));
					break;
				    
				case 3:
					System.out.println("Enter an item to remove:");
					int input1 = sc.nextInt();
					
					if (myList.contains(input1))
					{
						myList.remove(input1);
						System.out.println(input1 + " has been removed.");
					}
					else
					{
						System.out.println(input1 + " was not found in your shopping cart.");
					}
					break;
				case 4:
					myList.remove(0);
				
					
				case 5:
					x= false;
					System.out.println("Goodbye");
					break;
				}
		}			
	}
	
}
