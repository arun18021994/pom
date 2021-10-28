package weektwo.assignments;

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = obj.nextInt();// if input is 4540.
		
		int temp = num,r = 0,i=0;
		while(i<num) {
			    			                        r=i+temp%10; //r=0+121%10=0+1=1 , r= 10+12%10 = 12 ,121
			     //r=0+4540%10=0+0=0
			     //r=0+454%10=0+4=4  
			     //r=40+45%10=40+5=45 
			     //r=450+4%10=450+4=454 
			     //r=454+0%10=454+0=454
			    			                         i=r*10;   //i=1*10=10 , i = 12*10 = 120 
			    				     //i=0*10=0 
			    				     
			    				     //i=4*10=40
			    				     //i=45*10=450  
			    				     //i=454*10=4540  

			                                          temp=temp/10; //t=121/10 = 12 , 1
			     //temp=4540/10=454
			     //temp=454/10=45 
			     //temp=45/10=4  
			     //temp=4/10=0  
			       // the int will not take the decimal path for (0.454) 
			                                //so only consider the whole number "0" before the decimal point   
				
		}
		if(r==num) {System.out.println("the given input "+num +" is palidrome");}
		else {System.out.println("the given input is not a palindrone number");}
	}

}
