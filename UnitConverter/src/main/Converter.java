package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args){
		
		int menuSelection = 0;
		
		while (menuSelection != 4){
				
			System.out.println("Please select an option:");
	        System.out.println("1. Cups to Teaspoons");
	        System.out.println("2. Miles to Kilometers");
	        System.out.println("3. US Gallons to Imperial Gallons");
	        System.out.println("4. Quit");
        
	        Scanner sc = new Scanner(System.in);
        
	        menuSelection = sc.nextInt();
        
	        switch (menuSelection) {
				case 1:
					System.out.println("ENTER FIRST UNIT");
					int case1unit1 = sc.nextInt();
					double case1answer = (case1unit1 * 0.0208333);
					System.out.println(case1unit1 + "Cups = " + case1answer + "Teaspoons");
					break;
				case 2:
					System.out.println("ENTER FIRST UNIT");
					int case2unit1 = sc.nextInt();
					double case2answer = (case2unit1 * 0.621371);
					System.out.println(case2unit1 + "Miles = " + case2answer + "Kilometers");
					break;
				case 3:
					System.out.println("ENTER FIRST UNIT");
					int case3unit1 = sc.nextInt();
					double case3answer = (case3unit1 * 0.832674);
					System.out.println(case3unit1 + "Miles = " + case3answer + "Kilometers");
					break;
				case 4:
					System.out.println("THANK YOU, EXITING");
					break;	
			} // END OF SWITCH STATEMENT   
		} // END OF WHILE LOOP
	} // END OF MAIN LOOP
} // END OF CONVERTER CLASS

