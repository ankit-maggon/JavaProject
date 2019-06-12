
public class InheritanceConcept {
public static void main(String[] args) {
	 CustomerDetails cS = new CustomerDetails("Hanji");
}
}

class Customer
{
	public Customer(String j) {
	System.out.println("In Parent");	// TODO Auto-generated constructor stub
	}
}

class CustomerDetails extends Customer
{
	 CustomerDetails() {
		 super("callSuper");
		System.out.println("In One");
	}
	 
	 CustomerDetails(String b) {
		 super(b);
		 
		
			System.out.println("In two");
		}
}

