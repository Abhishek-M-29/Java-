// Create a class called Employee which models an employee with ID, Name and Salary. 
// The method raiseSalary(percent) increases the salary by the given percentage.
// Develop the Employee class and suitable main method for demonstration.


import java.util.Scanner;
public class Employee {
     String name;
     int id;
     float salary;
     float raisesalary(float percent)
     {
    	 return salary+(salary*(percent/100));
     }
}
public class JavaLab3
{
	public static void main(String[] args) {
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		e.name=sc.nextLine();
		System.out.println("enter the id:");
		e.id=sc.nextInt();
		System.out.println("enter the salary");
		e.salary=sc.nextFloat();
		System.out.println("enter the percentage to be raised in salary");
		int a=sc.nextInt();
		System.out.println("salary after increment is "+e.raisesalary(a));
        sc.close();
	}
}