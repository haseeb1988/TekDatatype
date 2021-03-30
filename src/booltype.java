
public class booltype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		boolean c = (1 > 2);
		//System.out.println(c);
		
		int score = 10;
		int temperature = 200;
		boolean rs = (score >= 10) && (temperature >= 300);
		//System.out.print(rs);   // true
		
		boolean rs2 = ((score >= 10) || (temperature >= 300));
		//System.out.print(rs2);   
		
		
		boolean rs3 = ((score <= 5) || (temperature <= 32));
		//System.out.print(rs3); 
		
		
		int weight = 140;
		int age = 24;
		
		boolean result = (age > 34) ^ (weight > 140);   // false   false  --> false
		//System.out.print(result);
		
		boolean result2 = (age > 14) ^ (weight > 140);  // true  false ==> true
		//System.out.print(result2);
		
		//System.out.print(6 % 3 == 0);
		int year = 2022;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		//System.out.print(isLeapYear);
		
		boolean A = true;
	    boolean B = false; 

	       System.out.println("A|B = "+(A|B));
	      //System.out.println("A&B = "+(A&B));
	      //System.out.println("!A = "+(!A));
	      //System.out.println("A^B = "+(A^B));
	      //System.out.println("(A|B)&A = "+((A|B)&A));
	}

}
