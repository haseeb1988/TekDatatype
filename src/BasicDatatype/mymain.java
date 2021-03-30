package BasicDatatype;

public class mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteVar = 5;
		short shortVar = 20;
		int myNum = 500;               // Integer (whole number)
		long longvariable = 200;
		float myFloatNum = 50/10;    // Floating point number
		double doubleVar = 20.231;
		
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		
		//String myText = "Hello";     // String
		
		
		//Widening Casting (automatically) - converting a smaller type to a larger type size
		//byte -> short ->  int -> long -> float -> double
		
		short s = byteVar;
		int i = s; 
          // automatic type conversion
        long l = i; 
          // automatic type conversion
        float f = l; 
        double d = f;
        System.out.println("short value "+s);
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value " + f);
        System.out.println("double value "+ d);
        
        // narrow  or explicit conversion
      
		byte mybyte  = (byte) d;
	    short ss = (short) d;
	    int myint = (int) d;
	    float ff = (float) d;
		
	    
	    int abc = (int) ff;
	    System.out.println(abc);
	}

}
