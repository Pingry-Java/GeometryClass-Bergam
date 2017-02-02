public class Runner
{
	public static void main(String[] args)
	{
		Point a = new Point(1,1, "A");
		Point b = new Point(2,2, "B");
		System.out.println("distance: " + a.distanceTo(b));
		
		Segment line = new Segment(a,b);
		System.out.println(line.toString());
		System.out.println("distance: " + line.length());
		
		Circle circ = new Circle(a,b);
		System.out.println(circ.toString());	
		System.out.println("diameter: " + circ.diameter());
		System.out.println("area: " + circ.area());
		System.out.println("circumference: " + circ.area());
	}
}