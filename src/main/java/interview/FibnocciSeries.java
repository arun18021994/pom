package interview;

import java.util.ArrayList;

public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long i=1;
		long k=1;
		long j = 0;
		ArrayList<Long> kn = new ArrayList<Long>() ;
		while(j<10000000) {
			
			 j=i+k;//2,3,
		     k=i;
			i=j;////2,3
			kn.add(k);}
			System.out.println(kn);
		

	}

}
