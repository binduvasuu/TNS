package Threads;

class A{
    void display(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class Main1 {

    void show(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
    public static void main(String[] args) {

        //it is execution instance which has its own CPU time and memory
        //threads extends runnable interface
        //runnable interface is functional interface
        //functional interface is a interface which has one abstract method
        //we can achieve threads by extending Thread class and implenting runnable interface
        //each and every method has thread 
        //inside main method we will be having main threa, which is root for all thread
        //thread has 3 properties - id, name = can be changed, priority= 0 to 10, where 0(min), 10(max) and 5(normal)

        System.out.println("Thread name : " + Thread.currentThread().getName());
        System.out.println("Thread Priority : " + Thread.currentThread().getPriority());
        System.out.println("Thread ID : " + Thread.currentThread().getId());

        A a = new A();
        a.display();

        Main1 m = new Main1();
        m.show();

    }
}
