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
		System.out.println("Hello Address i am Const all arg");
	}

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}

}
