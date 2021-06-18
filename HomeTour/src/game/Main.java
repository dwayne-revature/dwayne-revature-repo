package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	
	//Instance Variables
	private static RoomManager room_manager = new RoomManager();
	
	private static Player player = new Player();
	
	private static boolean LoopVar = true;
		
 
	
	//Main Function
	public static void main(String[] args) {
		
		// Introduction
		System.out.println();
		System.out.println("Welcome to My Home Tour Program! "
				+ "The Following Directions Provided Will Navigate Your Way!");
		
		// This line initializes our house
		System.out.println();
		System.out.println("Intitializing Room Details");
		room_manager.init();
		System.out.println();
		
		// This line initializes our starting room
		System.out.println("Intitializing Starting Room");
		System.out.println();
		room_manager.printStartingRoom();
		System.out.println();
		
		player.setCurrentRoom(room_manager.getStartingRoom());
		
	    System.out.println("Select A Direction: "
	    		+ "(1)North " + "(2)South " + "(3)East " + "(4)West ");
		
		int[] nextRoom = new int[]{1,2,3};
		int index = 0;
		
		while(LoopVar == true) {
			
			// This line will get input from user and store in the variable "next_location"
			int next_location = room_manager.collectInput();
		
			if(next_location == nextRoom[index]) {
				System.out.println("Current Room: ");
				room_manager.printNextRoom();
				room_manager.setNextRoom();
			}
			else {
				System.out.println("Not a Valid Direction, Please Select Another Entry");
			}
			
			if(nextRoom[index] == 3) {
				System.out.println("That is the final room!");
				System.exit(0);
			}
			System.out.println("Continue? (1 = Yes) (2 = No)");
			
		    Scanner Scan = new Scanner(System.in);  // Create a Scanner object
		    int x = Scan.nextInt();  // Read user input
		    //Scan.close();
		    
		    if(x == 1) {
		    System.out.println("Select Another Direction:"
		    		+ "(1)North " + "(2)South " + "(3)East " + "(4)West ");
		    index = index + 1;
		    }
		    
		    else if(x == 2) {
		    	System.out.println("Thank You Visitor!");
		    	LoopVar = false;
		    }
		
		}
		

			
	}
		
}
