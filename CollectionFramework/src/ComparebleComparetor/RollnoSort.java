package ComparebleComparetor;

import java.util.Comparator;

public class RollnoSort implements Comparator<Student> {


	public int compare(Student sid1, Student sid2) {
		
		return sid1.getRollno()-sid2.getRollno();
	}

}
