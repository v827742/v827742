package ComparebleComparetor;

import java.util.Comparator;

public class EmNameSort implements Comparator<Employee>
{
	public int compare(Employee emname1, Employee emname2) {
		
		return emname1.getEmname().compareTo(emname2.getEmname());
	}

}
