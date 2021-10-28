package weekthree.practise;

import java.util.Scanner;

public class ArgumentsReturnTypeAndMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
System.out.println("enter the two values of a and b :");
	ArgumentsReturnTypeAndMethodOverloading drv = new ArgumentsReturnTypeAndMethodOverloading();
	
	
       Scanner obj = new Scanner(System.in);
         
      int a = obj.nextInt();
      int b = obj.nextInt();
      
      int c = drv.addition(a,b);
      
      @SuppressWarnings("static-access")
	int d = drv.substraction(c,b);
      double e = obj.nextDouble();
      double f =obj.nextDouble();
      double g =drv.addition(d,f);
      int i = drv.additon(a,b,c);
   
       
	}
	 public static int addition(int a,int b) {
     int c=a+b;
		System.out.println(c);
		return c;
		
	}
	
	public static int substraction(int c, int b) {
    int d = c-b;
		   System.err.println(d);
		return d;
	}
	public static double addition (int d,double f) {
	double g = d+f;
		System.out.println(g);
		return g;
	}
	public int additon(int a,int b,int c) {
	int i = a+b+c;
		System.out.println(i);
		return i;
		
	} 
}