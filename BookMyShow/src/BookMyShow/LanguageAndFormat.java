package BookMyShow;

public class LanguageAndFormat extends Movies{
	

	String Language;
	String Format;
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	
	public static void main(String[] args) {
		LanguageAndFormat s1 = new LanguageAndFormat();
		s1.setName("Tanmoy");
		s1.setEmail("sinu0842@gmail.com");
		s1.setPassword("Tanmoy@1234");
		s1.login("sinu0842@gmail.com", "Tanmoy@1234");
		s1.setLoc("Bangalore");
		s1.setMovieName("Bholaa");
		s1.setLanguage("Hindi");
		s1.setFormat("2D");
		System.out.println(s1.getLoc());
		System.out.println(s1.getName());
		System.out.println(s1.getLanguage());
		System.out.println(s1.getFormat());
		s1.logOut("sinu0842@gmail.com");
	}
	
	
}
