package shop;

public class Employee {
	private String name ;
	private int id ;
	
	public Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name ;
		
	}
	
	public void setId( int id) {
		this.id=id;
	}
	
}
