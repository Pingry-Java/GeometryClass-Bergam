public class Point
{
	//declare some STATIC fields (all points have it)
	
		
	//declare some instance fields (each point has its over instance/version of this field)
	private double x; //make private so it cant be changed in another class
	private double y;
	public String name;
	
	//declare constructosr
	public Point()
	{
		x = 0;
		y = 0;
		name = "No name given";
	}
	
	public Point(double x, double y) //overloading
	{
		this.x = x; 
		this.y = y; 
		name = "No Name given";
	}
	
	public Point(double a, double b, String n) //overloading
	{ 
		x = a;
		y = b;
		name = n;
	}
	
	
	//ACCESSOR METHODS
	public double getX() //Allows you to access x from a private field , its public
	{	
		return x; 
	}
	
	public double getY() //Allows you to access y from a private field , its public
	{	
		return y; 
	}
	
	//MODIFIER METHOD
	public void setX(double x)
	{
		this.x = x; 
	}
	
	public void setY(double y)
	{
		this.y = y; 
	}
	
	//declare some useful method
	
	
	/**
	 *Calculates and returns this points distance from the origin (0,0
	 *@return The distance from (0,0)
	*/
	//not static bc its an INSTANCE method
	//no parameters so you call it as "p.distanceFromOrigin"
	public double distanceFromOrigin()
	{
		return Math.sqrt(x*x + y*y);
	}
	
	
	public static double distanceBetween(Point a, Point b)
	{
	 	return Math.sqrt((Math.pow((a.x - b.x), 2)) + (Math.pow((a.y - b.y), 2)));
	}
	
	public double distanceTo(Point a)
	{
	 	return Math.sqrt((Math.pow((a.x - x), 2)) + (Math.pow((a.y - y), 2)));
	}
	
	public String toString()
	{
		return name + ": (" + this.x + ", " + this.y + ")"; 
	}
	
	
	
}
	
	
//Static: Constructor, distanceBetween

//Non-Static: private double x and y, accessors (getX), distanceTo, modifiers
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
