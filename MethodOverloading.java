package oops.polymorphism;

public class MethodOverloading {


    //method overloading
    //compiletime polymorphism
    //static polymorphism

    //a method declaration gets binded to its definition get compile time
    // so its called compile time

    // since it happens at compile time is called early binding
    //and once it binded it cannot be rebinded or changed so its called static polymorphism
    
    static class Calculator {

        void add(int a, int b) {
            System.out.println(a + b);
        }

        void add(int a, int b, int c) {
            System.out.println(a + b + c);
        }

        void add(double a, double b) {
            System.out.println(a + b);
        }

        void add(int a, float b){
            System.out.println(a + b);
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(50,10);
        c.add(38,96,25);
        c.add(22.00, 48.00);
        c.add(43,97f);
       
    }
}