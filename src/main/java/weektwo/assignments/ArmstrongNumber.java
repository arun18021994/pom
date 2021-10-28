package weektwo.assignments;



public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("The following are the list of Armstrong number between 100 to 1000");
	int n=1000;
	for(int i=100;i<=n;i++) {
		int s=0,a=0;
		int temp=i;
		while(temp>0)                 { 
			a=temp%10;  
			System.out.println(a);
			s=s+(a*a*a);	
			System.out.println(s);
			
			temp=temp/10; }  
		System.out.println(temp);
			if(s==i) {System.out.print( s + "," );}
		}
	}
	}
	
		
		
		
		/*  double sum=0 ;
		 int c=0;
		for(int l=num;l>0;c++) {
			 l=l/10;
		}
			
         for(int n=num;n>0;n=n/10) {int r=n%10;
            		                      //using this power method to implement the count as a power to the remainder
            	sum = sum+Math.pow(r, c); // power is the method coming from the class Math
            	                          // and it is returning only the double data type,
            	                         //therefore the value should be stored in double.
				 }
         if(sum==num) {System.out.println("The entered number "+ sum +" is a armstrong number");}
         else {System.out.println("The entered number "+ sum +" is not a armstrong number");}
	
}
}
*/