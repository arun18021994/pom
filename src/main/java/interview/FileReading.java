package interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\priyadarshini\\Desktop\\property.txt";
		
	 FileReader ob = new FileReader(path);
	 @SuppressWarnings("resource")
	BufferedReader obj =new BufferedReader(ob);
	 @SuppressWarnings("unused")
	String s = obj.readLine();
	 while(obj.readLine() != null) {

	    System.out.println(s = obj.readLine()
	    		);
	 }
		

	}

}
