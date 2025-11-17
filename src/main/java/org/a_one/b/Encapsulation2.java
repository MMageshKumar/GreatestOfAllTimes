package org.a_one.b;

import java.util.ArrayList;
import java.util.List;

public class Encapsulation2 extends Encapsulation1 {

	public static void main(String[] args) {
		
		Encapsulation2 kk=new Encapsulation2();
		
		kk.setName("Mani");
    	kk.setVehicleNumber(2054);
    	kk.setLocation("Adyar");
    	kk.setContact(9876544323L);
    	
    	System.out.println(kk.getName());
    	System.out.println(kk.getVehicleNumber());
    	System.out.println(kk.getLocation());
    	System.out.println(kk.getContact());
    	
//    	kk.name
//    	kk.vehicleNumber

    	Encapsulation2 ll=new Encapsulation2();
    	
    	ll.setName("senthil");
    	ll.setVehicleNumber(8899);
    	ll.setLocation("Kasimedu");
    	ll.setContact(8787856536L);
    	
    	System.out.println(ll.getName());
    	System.out.println(ll.getVehicleNumber());
    	System.out.println(ll.getLocation());
    	System.out.println(ll.getContact());
    	
    	System.out.println("---------------------");
    	
    	List <Encapsulation2> li1=new ArrayList <> ();
    	
    	li1.add(ll);
    	li1.add(kk);
    	
    	for (int i=0; i<li1.size();i++) {
    		System.out.println(li1.get(i).getName());
    	} //-------> you can use enhanced loop too, it's one of the way.
    	
	}

	

}
