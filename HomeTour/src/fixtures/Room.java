package fixtures;

public class Room extends Fixture {
	
	public Room(String name, String shortDescription, String longDescription) {
		
		super(name, shortDescription, longDescription);
		
	}
	
	public void OutputData() {  
		 
	 System.out.println(name + " " + shortDesc + " " + longDesc);  
		  
	}
	
}
