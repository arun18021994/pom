package weektwo;

import java.util.Scanner;

public class PractiseConAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String helloarun = "25";
		helloarun="35";
		
		System.out.println(helloarun);*/
		//int a =4;
		
		Scanner find = new Scanner(System.in);
		System.out.println("Enter the value a :");
		int a = find.nextInt();
       String staff = find.next();
		if (a==5) {a=3;}else if(a<2) {a=4;}else {a=2;}
		switch (a) {
		case 2: System.out.println("calling hari"); break;
		case 3: System.out.println("calling nanthu");break;
		case 4: System.out.println("calling krish");break;
		default: System.out.println("enter the correct input");break;
		}
		
	    switch (staff) {
		case "nandu":System.out.println("say him go 1st floor");break;
		case "krish": System.out.println("say him to come 2nd floor");break;
		case "hari":System.out.println("say him to come 3rd floor");break;
		default : System.out.println("call break");break;
		}
		
		for(int i=1;i<=5;) {System.out.println("how r u");
			}
	
		System.out.println("push arun through feature branch");
		
		
		

	}

}
