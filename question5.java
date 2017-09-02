import java.util.Scanner;

public class question5
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please Enter three 2D point x1,y1,x2,y2,x3,y3 on Coordinate System");
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		double x3 = s.nextDouble();
		double y3 = s.nextDouble();
		double l1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double l2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double l3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		if((l1+l2>l3) && (l2+l3>l1) && (l1+l3>l2))
			System.out.println("this is a real triangle");
		else
			System.out.println("this is a fake triangle");
		
		
		
		
	}
}
