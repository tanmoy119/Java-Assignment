package shop;

public class GetAndSet {

	
	public static void main(String[] args) {
		Employee E = new Employee("Tanmoy", 101);
		Customer C = new Customer("Soumya",102);
		User U = new User("Adib",103);
		
		System.err.println(E.getName());
		System.err.println(C.getName());
		System.err.println(U.getName());
	}
}
