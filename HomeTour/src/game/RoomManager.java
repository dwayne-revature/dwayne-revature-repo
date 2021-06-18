package game;

import java.util.Scanner;

import fixtures.Room;


public class RoomManager {
	
	//Instance Variables
	private Room startingRoom;
	private Room nextRoom;
	
	//Exits
	private Room[] exits = new Room[3];
	
	//Constructor
	public RoomManager() {

		System.out.println("Room Manager Constructor Called!");
		
	}
	
	public void init() {
		
		Room R1 = new Room("Living Room, ", "A room for relaxing and socializing, ", "Typically has a TV, Sofa, Coffee Table, etc...");
		Room R2 = new Room("Kitchen, ", "An area where food is prepared and cooked, ", "Has a Sink, Stove, Refridgerator, etc...");
		Room R3 = new Room("Bedroom, ", "A room for sleeping in, ", "Has a Bedroom Set, Closet, etc..");
		Room R4 = new Room("Bathroom, ", "A room for bathing, ", "Has Toilet, Shower, etc..");
		
		startingRoom = R1;
		nextRoom = R2;
		
		exits[0] = R2;
		exits[1] = R3;
		exits[2] = R4;
		
	}
	
	// Get & Set Functions
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	
	// Input Collection 
	public int collectInput() {
		
	    Scanner Scan = new Scanner(System.in);  // Create a Scanner object

	    int direction = Scan.nextInt();  // Read user input
	    
	    //Scan.close();
	    
	    return direction;
	    
	}
	
	// Print to Starting Room to Screen	
	public void printStartingRoom() {
		
		startingRoom.OutputData();
		
	}
	
	public void setNextRoom() {
		
		int x = 1;
		nextRoom = exits[x];
		x = x + 1;
	}
	
	// Print to Next Room to Screen	
	public void printNextRoom() {
		
		nextRoom.OutputData();
		
	}
}
