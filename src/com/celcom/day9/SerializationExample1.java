package com.celcom.day9;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient public int eid;
	private String ename;
	private long esalary;

	public Employee(int eid, String ename, long esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public long getEsalary() {
		return esalary;
	}

	public void setEsalary(long esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}

public class SerializationExample1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp1 = new Employee(001, "SHERVIN", 1220000);
		System.out.println(emp1.toString());
		
		// Serialzation
		FileOutputStream fw = new FileOutputStream("D:\\JAVA TRAINING\\MY_PROJECT\\src\\com\\celcom\\day9\\Test.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fw);
		obj1.writeObject(emp1);
		obj1.writeObject(new Employee(002,"DANI",12000));
		fw.close();
		obj1.close();
		System.out.println("Saved");
		
		// DeSerialization
		FileInputStream fr = new FileInputStream("D:\\JAVA TRAINING\\MY_PROJECT\\src\\com\\celcom\\day9\\Test.txt");
		ObjectInputStream or = new ObjectInputStream(fr);
		Employee emp = (Employee) or.readObject();
		System.out.println(emp);
		emp = (Employee) or.readObject();
		System.out.println(emp);
	}

}
