//Line Class

import java.lang.Math;

public class MyLine
{

//11.
//Create instance variables for a line

	private Point p1;
	private Point p2;
	
//12.
//Create a no argument constructor for a line
	public MyLine()
	{
		p1 = new Point();
		p2 = new Point();
	}

//13. 
//Create a 2 argument constructor for a line
	public MyLine(Point p1, Point p2)
	{
		this.p1=p1;
		this.p2=p2;
	}

//14. 
//Create a point 1 getter
	public Point getP1()
	{return p1;}

//15. 
//Create a point 2 getter
	public Point getP2()
	{return p2;}
	
	public void printLine()
	{
		p1.printPoint();
		p2.printPoint();
	}

//return to driver for testing

//18. 
//Create a getLength function
	public double getLength()
	{
	return 0;
	//return Point.distance(p1,p2);
	}
//return and test in driver

//21. 
//getLength method to make use of static point function
//return to driver and test
	
	
}