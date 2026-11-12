package staticandnonstatic;

//static is a keyword
//any member declar with the keyword static is called static member of the class
//static is a single copy
//whenever you want to access static member of the class we need to use class name .member name
//static is always associated with the class

class Employee{
    static int salary = 50000;
    public static void details(){
        System.out.println("Employee details");
    }
} 

public class StaticExample {
    public static void main(String[] args) {
        Employee.details();
        int sal = Employee.salary;
        System.out.println(sal);
    }
}
