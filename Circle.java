public class Circle
{
	private Point center;
	private double radius; 
	
	
	//diff contractors based on input
	public Circle()
	{
		radius = 0;
		center = new Point();
	}
	
	public Circle(Point center)
	{
		radius = 0;
		this.center = center;
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
		center = new Point();
	}
	
	public Circle(Point center, double radius)
	{
		this.radius = radius;
		this.center = center;
	}
	
	public Circle(Point center, Point b)
	{
		radius = center.distanceTo(b);
		this.center = center;
	}
	
	/**
	* This method returns the diameter of your circle
	* @return Returns the diameter as a double
	*/	 
	public double diameter()
	{
		return radius * 2;
	}

	/**
	* This method returns the circumference of your circle
	* @return Returns the circumference as a double
	*/
	public double circumference()
	{
		return radius * 2 * Math.PI;
	}
	
	/**
	* This method returns the area of your circle
	* @return Returns the area as a double
	*/
	public double area()
	{
		return Math.pow(radius, 2) * Math.PI;
	}
	
	/**
	* This method prints the center point and radius length of the circle in type String
	* @return Returns the string form identifying the circle
	*/
	public String toString()
	{
		return "Circle " + center.name + "'s center is (" + center.getX() + ", " + center.getY() + ") and its radius has a length of " + radius + "."; 
	}
	

}