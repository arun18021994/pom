package weekthree.practise;

public abstract class MatricBoards extends CbseBoards implements Government {
	

	@Override
	public String tamilMedium() {
		String sylabus = "onlytamil";
		// TODO Auto-generated method stub
		return sylabus ;
	}

	@Override
	public void englishMedium() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exams() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int fees() {
		// TODO Auto-generated method stub
		return 25000;
		
	}

	@Override
	public void sports() {
		// TODO Auto-generated method stub
		
	}
	
	
 public static int sportsFee() {
 return 3000;
 }
 public int books() {
return 8000;
 }
 public void musicClass() {
	 
 }
 public abstract void canteen();

@Override
public int writingBenches() {
	// TODO Auto-generated method stub
	return 200;
}	
	public static int writingBenches(int a,int b) {
		int c= a+b ;
		return c;
		
	}
	


}





