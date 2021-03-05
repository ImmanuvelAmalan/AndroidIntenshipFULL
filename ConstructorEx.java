class ConstructorDemo{
	// Default Constructor
	public  ConstructorDemo()
	{
	System.out.println("Default Constructor");
	}
	
	// Parameterized Constructor
	public ConstructorDemo(String st){
	System.out.println("Parameterized Constructor");
	}
}
class ConstructorEx{
	public static void main(String args[])
	{
	ConstructorDemo cd=new ConstructorDemo(); // Default Constructor Call
	ConstructorDemo cd2=new ConstructorDemo("Hello"); // Parameterized Constructor Call
	}
}