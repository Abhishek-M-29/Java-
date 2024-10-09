// Create a class called Employee which models an employee with ID, Name and Salary. 
// The method raiseSalary(percent) increases the salary by the given percentage.
// Develop the Employee class and suitable main method for demonstration.

import java.util.Scanner;
 class Emp {
     String name;
     int id;
     float salary;
     float raisesalary(float percent)
     {
    	 return salary+(salary*(percent/100));
     }
}
public class Employee
{
	public static void main(String[] args) {
		Emp e=new Emp();
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