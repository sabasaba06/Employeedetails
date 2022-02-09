package org.emp;

public class Employee {
	private void empid() {
		System.out.println("00IHC");
	}
	private void empname() {
		System.out.println("saba");
	}
	private void empdob() {
		System.out.println("29/11/98");
	}
	private void empmail() {
		System.out.println("csaba0@gmail.com");
	}
	public void username() {
		System.out.println("username");
	}
	public void password() {
		System.out.println("Password");
	}
	public static void main(String[]args) {
		Employee d =new Employee();
		d.empdob();
		d.empid();
		d.empmail();
		d.empname();
		d.username();
		d.password();

	}

}
