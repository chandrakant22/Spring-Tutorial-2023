package model;

public class Address {
	
	private int plotNo;
	private String city;
	private String state;
	private int pin;
	public Address(int plotNo, String city, String state, int pin) {
		super();
		this.plotNo = plotNo;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	
	public Address(int plotNo,int pin) {
		super();
		this.plotNo = plotNo;
		this.pin = pin;
	}
	
	
	public Address(String city,String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
	
}
