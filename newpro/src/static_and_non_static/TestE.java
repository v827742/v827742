package static_and_non_static;

public class TestE {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee(101, "Ashish");
		Employee emp1=new Employee(102, "Dinesh");
		
		Employee.Cname="IBM";
		
		emp.display();
		emp1.display();
		
	}

}
