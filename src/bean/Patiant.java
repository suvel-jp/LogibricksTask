package bean;

import java.util.Date;

public class Patiant {

   private String Fname,Lname,city,hospital;
   private double total;
   private int age;
   private Date dob,discharge,admission;
public Patiant(String fname, String lname, String city, String hospital, double total,int age, Date dob, Date discharge,
		Date admission) {
	super();
	Fname = fname;
	Lname = lname;
	this.city = city;
	this.hospital = hospital;
	this.total = total;
	this.age=age;
	this.dob = dob;
	this.discharge = discharge;
	this.admission = admission;
}




public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getHospital() {
	return hospital;
}
public void setHospital(String hospital) {
	this.hospital = hospital;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age ;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Date getDischarge() {
	return discharge;
}
public void setDischarge(Date discharge) {
	this.discharge = discharge;
}
public Date getAdmission() {
	return admission;
}
public void setAdmission(Date admission) {
	this.admission = admission;
}
	
   
   
	
	
}
