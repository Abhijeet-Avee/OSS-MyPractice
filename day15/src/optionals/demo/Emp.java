package optionals.demo;

class Emp{
	private int id;
	private String name;
	private double salary;
	private String dept;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Emp(int id, String name, double salary, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public Emp() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=").append(id).append(", name=").append(name).append(", salary=").append(salary)
				.append(", dept=").append(dept).append("]");
		return builder.toString();
	}
	

}