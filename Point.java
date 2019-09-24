//Point Class

public class Point
{
//1.
//Create instance variables for x and y coordinates
	private int x;
	private int y;
	
//24.
//Create a static variable pcount to keep up with the number of created points
//Create a getter for this value

	
//2. 
//Create a no argument constructor that will set all coordinates to 0
	public Point ()
	{
		x=0;
		y=0;
	}
	
//3. 
//Create a 2 argument constructor for accepting two ints
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

//4. 
//Create a manual setter
//Point p = new Point(); p.setPoint(4,5);
	public void setPoint(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

//5. 
//Create an x getter
	public int getX()
	{return x;}
	
//6. 
//Create a y getter test from your driver
	public int getY()
	{return y;}


	public void printPoint()
	{
		System.out.println("x = " +x);
		System.out.println("y = " +y);
	}
//9. 
//Create a function that will test a point against a "this" point
	public boolean eq(Point p1)
	{
		if((x == p1.getX()) && (y == p1.getY()))
			return true;
		else
			return false;
	}
	
//Return to driver file and test


//20. 
//Create static distance function	
	public static double distance(Point p1, Point p2)
	{return 0;}
	
//go to line file

//25. 
//Create a getter for getting the static count
	public static int getCount()
	{return 0;}
}
//why does it have to be a static method?
//return to main for testing