package interview;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class ArrayListForInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("Arun","priya","vivege","Arun","praveen"));
		
		ar1.add("ravi");
		ar1.add(2,"raju");
		System.out.println(ar1);
		
		
		
		
		String ar2[] = {"Arun","priya","vivege","Arun","praveen"};
		
		for(int i=0;i<ar2.length;i++) {
			for(int j=i+1;j<ar2.length;j++) {
				if(ar2[i].equals(ar2[j])) {
					System.out.println(ar2[j]);
				}
			}
		}
		
		HashSet<String> hs = new HashSet<>();
		
		for (String string : ar1) {
			if(hs.add(string)==false) {
				System.out.println(string);
				System.out.println(hs);
			}
		}	
		//HashSet<String> hs1 = new HashSet<>();
		java.util.List<String> withOutDublicates =  ar1.stream().distinct().collect(Collectors.toList());
		System.out.println("withoutdublicates: "+withOutDublicates);
		
    System.out.println("___________for reverse a sentence ____________________");
    
    String a = "the value of string is null";
    
    String[] temp = a.split(" ");
    String value="";
    for(int i=temp.length-1;i>=0;i--){
    value = value+" "+temp[i];
    }

    System.out.println(value);
	
	System.out.println("____________________________________________________________");
	System.out.println("============================================================");
	ArrayList<Integer> myint = new ArrayList<Integer>();
	myint.add(1);
	myint.add(2);
	myint.add(5);
	myint.add(7);
	myint.add(8);
	System.out.println(myint);
	
	ArrayList<String> newInt = new ArrayList<String>(Arrays.asList("arun","arul","bravind","ariv","and"));
	Collections.sort(newInt);
	//newInt.removeAll(myint);
	System.out.println(newInt);
	
	}
	
}
