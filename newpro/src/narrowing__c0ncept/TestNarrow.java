package narrowing__c0ncept;

public class TestNarrow {
public static void main(String[] args) {
	
	Narrow n=new Narrow();
	//n.m1(null);
	n.m1((String)null);
	n.m1((Narrow)null);
	n.m1((Object)null);
	
}
}
