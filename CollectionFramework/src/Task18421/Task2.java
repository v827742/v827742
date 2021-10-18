package Task18421;

import java.util.*;

public class Task2 {


public static void main(String []args)
{

List<String> MAH=new ArrayList<>();
  MAH.add("nasik");
  MAH.add("nagpur");
  MAH.add("kolhapur");

  
List <String>RAJ=new ArrayList<>();
  RAJ.add("ajmer");
  RAJ.add("jaipur");
  RAJ.add("kota");
  
  

List<String> GUJ=new ArrayList<>();
  GUJ.add("Ahemadabad");
  GUJ.add("surat");
  GUJ.add("rajkot");

List<String> MP=new ArrayList<>();
  MP.add("bhopal");
  MP.add("jabalpur");
  MP.add("indore");

List <List<String>> India=new ArrayList<>();
  India.add(MAH);
  India.add(RAJ);
  India.add(GUJ);
India.add(MP);

Iterator<List<String>> itr=India.iterator();
while(itr.hasNext())
{
	List<String> s=itr.next();
	
	Iterator<String>itr1=s.iterator();
	while(itr1.hasNext())
	{
		
		System.out.println("city name="+itr1.next());
	}

}

}
}





















  
   
