//Driver file

public class Demo8
{
	public static void main(String [] args)
	{
	
//7. 
//Create 4 points with two of them equal
	Point p1 = new Point(1,2);
	//System.out.println(p1.count);
	
	Point p2 = new Point(2,3);
	//System.out.println(p2.count);
	
	Point p3 = new Point(1,2);
	//System.out.println(p3.count);
	
	Point p4 = new Point(4,5);
	//System.out.println(p4.count);
	
	//p1.printPoint();
	//p2.printPoint();
	
	//System.out.println(p1.eq(p4));
	//System.out.println(p4.eq(p2));
	//System.out.println(p2.eq(p3));
	//p1.eq means to to the p1 function in the eq space
	
	//System.out.println(Point.sEq(p1,p3));
	
	//System.out.println(p1.woop(p1,p2));
	//not correct, you dont have to send it p1 because it is already in the space
	
	
	
	
	
//8. 
//test a getter and then create a is equal method in the point file

//10. 
//Test equal method
//Why don't you have to send it two points?
	//System.out.println(p1.eq(p4));
	
//Go to the line file

//16. 
//Create a new line from two of the created points
	MyLine line1 = new MyLine(p1,p4);
	line1.printLine();

//17. 
//Print out point coordinates 

	//System.out.println(line1.getP1().getX());

//return to line to create a length function

//19. 
//Test get length function
	
	//System.out.println(line1.getLength());
	
//go to point file

//22. test that the distance and length are the same
	//System.out.println(Point.distance(p1,p4));
	
//23. 
//Create a static variable to keep up with the number of points that have been created
	
	//System.out.println(Point.getCount());
	
	
	}
}