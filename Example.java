package Threads.Example;

class A extends Thread {
    public void run() {
        // Thread.currentThread().setPriority(1);
        for (int i = 10; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class B extends Thread {
    public void run() {
        // Thread.currentThread().setPriority(3);
        for (int i = 20; i <= 30; i++) {
            System.out.println(Thread.currentThread().getName());

        }
    }
}

class C extends Thread {
    public void run() {
        // Thread.currentThread().setPriority(3);
        for (int i = 30; i <= 40; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        System.out.println(a.getState());
        a.start();
        System.out.println(a.getState());

        B b = new B();
        System.out.println(b.getState());
        b.start();
        System.out.println(b.getState());
        

        C c = new C();
        System.out.println(c.getState());
        c.start();
        System.out.println(c.getState());
        


        /*a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        c.setPriority(Thread.MAX_PRIORITY);*/

        
        c.join();
        
        a.join();
        
        b.join();

    }
}