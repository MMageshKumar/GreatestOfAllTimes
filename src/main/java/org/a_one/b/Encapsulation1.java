package org.a_one.b;

public class Encapsulation1 {  //---> Restricted Class for users
	
	
	private long contact;
	int vehicleNumber;
	protected String name;
	public String location;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	public String getName() {
		return name;
	}
	public long getContact() {
		return contact;
	}
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	public String getLocation() {
		return location;
	}
    public static void main(String[] args) {
	
    	Encapsulation1 jj=new Encapsulation1();
    	
    	jj.setName("Mani");
    	jj.setVehicleNumber(2054);
    	jj.setLocation("Adyar");
    	jj.setContact(98765443213L);
    	
    	System.out.println(jj.getName());
    	System.out.println(jj.getVehicleNumber());
    	System.out.println(jj.getLocation());
    	System.out.println(jj.getContact());
    	
}
	

}
