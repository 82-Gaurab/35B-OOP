package Week9;

public class Employee {

    // 2. Write a Java program to create a class called Employee with methods called
    // work() and getSalary(). Create a subclass called HRManager that overrides the
    // work() method.

    public void work(){
        System.out.println("Employee is working.");
    }

    public void getSalary(){
        System.out.println("Salary: 40000");
    }
}

/**
 * HRManager
 */
class HRManager extends Employee{
    @Override
    public void work(){
        System.out.println("HR Manager is working.");
    }
}