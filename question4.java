import java.util.Scanner;
import java.util.ArrayList;
class question4
{
	public static void main (String[] args) 
  	{
		ArrayList<Double> Data = new ArrayList<Double>();
    		Scanner scan = new Scanner( System.in );
		System.out.println("Enter the data:");    		
		while(scan.hasNextDouble()){
    			Data.add(scan.nextDouble());
		}
    		System.out.println("You entered:" + Data );
  	}	
}
