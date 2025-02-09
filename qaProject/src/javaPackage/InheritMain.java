package javaPackage;

public class InheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager obj= new Manager("Preeja",12345,90000,3);
		obj.employeeDetails();
		
	}

}

class Employee 
{
	String name; 
	int id;
	double salary;
	
	public Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void employeeDetails()
	{
		System.out.println("The name of employee "+name);
		System.out.println("The id of employee "+id);
		System.out.println("The salary of employee "+salary);
	}
	
	
}

class Manager extends Employee
{
	int teamsize;
	public Manager(String name,int id,double salary,int teamsize)
	{
		super(name,id,salary);
		this.teamsize=teamsize;
	}
	
	double calculatebonus()
	{
		return salary*0.1*teamsize;
	}
	
	
	
	@Override
	public void employeeDetails()
	{
		System.out.println("The name of employee "+name);
		System.out.println("The salary of employ after the bonus "+calculatebonus());
	}
}