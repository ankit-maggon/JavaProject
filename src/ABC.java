public class ABC implements InterfacceCheck
{

 /*public void printCall()
{
	System.out.println("call of class");
	  printCall();
	 call();

}*/

	public static void main(String[] args) {
		
		InterfacceCheck abc = new ABC();
		
		abc.printCall();
	
		
	}
	
	static void call()
	 {
		System.out.println("ok interface call child");
	 
	 }
	
	public void printCall()
	{
		
		System.out.println("ok class ABC");
	}
	
}