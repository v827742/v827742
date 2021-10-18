package day1;

public class Test3 {
	int id;
	String name;
	public Test3(int y,String x)
	{
		this.id=y;
		this.name=x;
		
	}
	public String toString()
	{
		return "id="+id+"name="+name  ;
	}
	public static void main(String[] args) {
		Test3 t=new Test3(10,"CBC");
		Test3 t1=new Test3(20,"YBL");
		System.out.println(t);
		System.out.println(t1);
		//System.out.println(t.toString());
		//System.out.println(t1.toString());
		
	}

}
