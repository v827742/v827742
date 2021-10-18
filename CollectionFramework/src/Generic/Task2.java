package Generic;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		
		
		
		List<String> MH=new ArrayList<>();
		MH.add("pune");
		MH.add("mumbai");
		
		List<String> Jh=new ArrayList<>();
		Jh.add("ranchi");
		Jh.add("lohadaga");
		
		List<String>  Washington=new ArrayList<>();
		Washington.add("pasco");
		Washington.add("yakima");
		
		List<String>  California=new ArrayList<>();
		California.add("yubs city");
		California.add("los angeles");
		
		List<List<String>> india=new ArrayList<>();
		india.add(MH);
		india.add(Jh);
		
		List<List<String>> USA=new ArrayList<>();
		india.add(Washington);
		india.add(California);
		
		
		List<List<List<String>>> world=new ArrayList<>();
		world.add(india);
		world.add(USA);
		
		for(List<List<String>> l:world)
		{
			for(List<String> l1:l)
			{
				for(String l2:l1)
				{
					System.out.println(l2);
				}
			}
				
		}
	}}
