public class EmployeeDto{

	
	
	private String name;
	private String idnumber;
	private String employeeroll;
	private int age;
	private float salary;
	
	
	public void setName(String name){
		this.name = name;
	}
	public void setIdNumber(String idnumber){
		this.idnumber = idnumber;
	}
	public void setEmployeeRoll(String employeeroll){
		this.employeeroll = employeeroll;
	}
	public void setAge(int age){
		this.age  =  age;
	}
	public void setSalary(float salary){
		this.salary = salary;
	}



	public String getName(){
		return name;
	}
	public String getIdNumber(){
		return idnumber;
	}
	public String getEmployeeRoll(){
		return employeeroll;
	}
	public int getAge(){
		return age;
	}
	public float getSalary(){
		return salary;
	}



	public static void main(String[] args){
		
		EmployeeDto arun = new EmployeeDto();
		System.out.println(arun.getName());		
		
	}



}
