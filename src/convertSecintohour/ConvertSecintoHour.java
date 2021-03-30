package convertSecintohour;

import java.util.Scanner;

public class ConvertSecintoHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
		int seconds = in.nextInt(); 
		
        int p1 = seconds % 60;
        System.out.println("Second are :" + p1);
        
        int p2 = seconds / 60;
        System.out.println("Minutes are: " + p2);
        int p3 = p2 % 60;
        
        
        p2 = p2 / 60;
        System.out.print( p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
		



	}

}
