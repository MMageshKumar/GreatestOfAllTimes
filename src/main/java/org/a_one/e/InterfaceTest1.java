package org.a_one.e;

public class InterfaceTest1 implements InterfaceTest {

	@Override
	public void king() {
		System.out.println("Gent");
		
	}

	@Override
	public void queen() {
		System.out.println("Lady");
		
	}

	@Override
	public void prince() {
		System.out.println("Boy");
		
	}

	@Override
	public void Princes() {
		System.out.println("Girl");
		
	}
	
	public static void main(String[] args) {
		
		InterfaceTest a=new InterfaceTest1();
		
		a.king();
		a.queen();
		a.prince();
		a.Princes();
	}

}
