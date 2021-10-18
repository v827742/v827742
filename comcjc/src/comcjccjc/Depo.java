package comcjccjc;

public class Depo 
{
	public static void main(String []args)
	
	{
		Bus b=new Bus();
		b.Bname="chandrapur-goa";
		b.Bno="MH-34-AE-2041";
		b.Bcode=2512;
		
		Busdriver d=new Busdriver();
		d.Dname="ashwin yelmule";
		d.Dmono=8569321478l;
		d.bs=b;
		
		System.out.println(d.Dname);
		
		System.out.println(d.Dmono);
		
		System.out.println(d.bs.Bname);
		
		System.out.println(d.bs.Bno);
		
		System.out.println(d.bs.Bcode);
	}
	
}
