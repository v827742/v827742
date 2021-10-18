package Array;
//second largest no
public class Task10 {


	public static void main(String args[])
	{

	int a[]={2,1,5,6,4,3};
	int ac;

	for(int i=0;i<a.length;i++)
	{
	for(int j=i+1;j<a.length;j++)
	{
	if(a[i]<a[j])
	{
	ac=a[i];
	a[i]=a[j];
	a[j]=ac;

	}
	}
	}
	for(int k=0;k<a.length;k++)
	{
	System.out.println(a[k]);
	}

	System.out.println("second largest no");
	System.out.println(a[1]);
	}
	}

