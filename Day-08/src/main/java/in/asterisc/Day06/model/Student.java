package in.asterisc.Day06.model;

public class Student {
 int uroll;
 String uname;
 String uaddress;
 
 
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int uroll, String uname, String uaddress) {
	super();
	this.uroll = uroll;
	this.uname = uname;
	this.uaddress = uaddress;
}

public int getUroll() {
	return uroll;
}

public void setUroll(int uroll) {
	this.uroll = uroll;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getUaddress() {
	return uaddress;
}

public void setUaddress(String uaddress) {
	this.uaddress = uaddress;
}

@Override
public String toString() {
	return "Student [uroll=" + uroll + ", uname=" + uname + ", uaddress=" + uaddress + "]";
}
 
	
}
