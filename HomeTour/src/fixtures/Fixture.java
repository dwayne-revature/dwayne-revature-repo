package fixtures;

public abstract class Fixture {
	
	protected String name;
	
	protected String shortDesc;
	
	protected String longDesc;
	
	// Parameterized Constructor
	public Fixture(String name, String shortDesc, String longDesc) {
		super();
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}
	
}
