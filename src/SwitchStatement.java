// default output always executed if  case does not match
// if the case has been matched and there is no break then this will execute statement of all the after cases.
 public class SwitchStatement {

	public static void main(String[] args) {
		SwitchStatement sT = new SwitchStatement();
		sT.aMethod();

	}

	void aMethod() { 
		int k = 10;
		switch (k) {
		
		
		
		case 10:
			System.out.println("ten,");
			
		default:
			System.out.println("default output");
			
		
		case 20:
			System.out.println("twenty");
			break;
			
		
			
		

		}
	}

}
