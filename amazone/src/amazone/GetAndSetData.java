package amazone;

public class GetAndSetData {

	public static void main(String[] args) {
		
		Students s1 = new Students("Tanmoy","A",1200);
		Students s2 = new Students("Tanmoy","A",1200,10);
		System.out.println(s1.getName());
		System.out.println(s1.getSection());
		System.out.println(s1.getroll());
		System.out.println(s2.getName());
		System.out.println(s2.getSection());
		System.out.println(s2.getroll());
		System.out.println(s2.getClas());
		
		s1.setName("Sona");
		System.out.println(s1.getName());
		System.out.println(s1.getName());
	}
}
