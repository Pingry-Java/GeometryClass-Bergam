public class Segment
{   
	private Point start;
	private Point end;
	//private double length; NO! data could inconsistant
	
	private static int numSegments = 0;
	
	
	//default constructors because it has no Args
	//overrides default constructor of Object
	public Segment()
	{
		start = new Point();
		end = new Point();
		
		//this(new Point(), new Point())
	}
	
	public Segment(Point start, Point end)
	{
		this.start = start;
		this.end = end;
		
		//Remember to increment the counter of all line segments
		numSegments++;
	}
	
	public static int getNumSegments()
	{
		return numSegments; //if the field is stati the accessor should be too
	}
	
	public double slope()
	{
		return (end.getY() - start.getY())/(end.getX() - start.getX());
	}
	
	public String name()
	{
		return start.name + end.name; 
	}
	
	public String toString()
	{
		return start.toString() +  " " + end.toString();
	}
	
	public double length()
	{
		return Point.distanceBetween(start, end);
	}
}