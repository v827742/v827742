package ComparebleComparetor;

import java.util.Comparator;

public class EmIdSort implements Comparator<Employee> {

	
	public int compare(Employee emid1, Employee emid2) {
		
		return emid1.getEmid()- emid2.getEmid();
	

}
}