package lesson7.labs.prob1.partC;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
	@Override
	public int hashCode() {
	    int hash = 7;
	    hash = 31 * hash + (name == null ? 0 : name.hashCode());
	    hash = 31 * hash + (int) salary ;
	    return hash;
	}
	
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee emp = (Employee)ob;
		return emp.name.equals(name) && emp.salary == salary;
	}
	
	
}
