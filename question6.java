import java.util.Scanner;

public class question6
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the center coordinates and radiuses of two circles, start from enter x-coordinate, y-coordinate and radius value for the first circle and then for the second circle");
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double r1 = s.nextDouble();
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		double r2 = s.nextDouble();
		double d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		if(r1 - r2 < d && r1 + r2 > d)
			System.out.println("two circle overlap each other");
		else if(d == r1 + r2)
			System.out.println("two circle touching each other");
		else if(d > r1 + r2)
			System.out.println("two cricle separate from each other");
		else if (d<=r1-r2 || d <=r2-r1)
			System.out.println("completely within one another");
	}
}

