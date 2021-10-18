package Array;

public class Task1 {
	public static void main(String[] args) {
		
		
		int a[]={5,10,12,18,25,29,33};
		
		System.out.println("event positin no");
		for(int i=1;i<a.length;i++)
		{
			System.out.println(a[i]);
			i++;
		}
		
		System.out.println("odd position numbers");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			i=i+1;
		}
		System.out.println("no of element present an Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
