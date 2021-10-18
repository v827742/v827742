package day1;

public class C {
	int id;
	String name;
	public C(int id,String name )
	{
		this.id=id;
		this.name=name;
	}
public static void main(String[] args) {
	C c=new C(1,"abc");
	C c1=new C(2,"pqr");
	System.out.println(c.toString());
}
}
