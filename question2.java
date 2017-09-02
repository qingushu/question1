import java.util.Scanner;

public class question2
{
	public static void main(String[] args)
	{
		double area;
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("Enter radius of circle, Enter 'd' to exit the program:");
			if(s.hasNextDouble()){
			double r2 = s.nextDouble();
			area = Math.PI * Math.pow(r2, 2);
			System.out.println("Area of circle: " + area);
			}
			else if(s.next().charAt(0) == 'd') 
				System.exit(0);	
			else
				System.out.println("wrong input, type radius again");
		}	
	}
}
