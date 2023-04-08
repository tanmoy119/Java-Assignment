package BookMyShow;

public class Account {
	
	String name;
	String email;
	private String password;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void login(String email, String password) {
		if(this.email==email && this.password==password) {
			System.out.println("User Login successfully");
		}
	}
	public void logOut(String email) {
		
		if(this.email==email) {
			System.out.println("User LogOut successfully");
		}
	}
	
	
	
	
	

}
