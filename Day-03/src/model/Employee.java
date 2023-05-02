package model;

public class Employee {

	private int id;
	private String name;
	private Address add;// ref

	public Employee(int id, String name, Address add) {
		super();
		System.out.println("Hello i am all arg Const from Employee");
		this.id = id;
		this.name = name;
		this.add = add;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void show() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", address=" + add + "]");
	}

}
