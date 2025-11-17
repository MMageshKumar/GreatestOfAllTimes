package org.a_one.e;

public class AbstractionTest1 extends AbstractionTest {

	@Override
	public void queen() {
		System.out.println("Lady");
		
	}

	@Override
	public void princes() {                    // Watch Here Magesh White colour Override indication
		System.out.println("Girl");
		
	}
	
	public static void main(String[] args) {
		
		 AbstractionTest1 a=new AbstractionTest1();
		 
		 a.king();
		 a.queen();
		 a.prince();
		 a.princes();
	}
	

}
