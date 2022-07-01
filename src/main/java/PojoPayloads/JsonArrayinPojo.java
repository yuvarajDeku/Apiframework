package PojoPayloads;

public class JsonArrayinPojo {
private String Firstname;
private	String lastname;

private Boolean Married;
private int age;
private double salary;


//Getter & Setter

public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Boolean getMarried() {
	return Married;
}
public void setMarried(Boolean married) {
	Married = married;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
	
}
