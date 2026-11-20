package Threads.RunnableInterface;

class A implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}

//diamond problem
//when to go for thread and runnable interface
//one class - thread
//more than one class - runnable inetrface
   

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        t1.start();
        //a.run();
    
        B b = new B();
        //Thread t2 = new Thread(b);
        //t2.start();
        b.run();
    }
}
