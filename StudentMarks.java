package oops.polymorphism;

public class StudentMarks {
     void calculate(int a){
        System.out.println("Marks of 1 subject is " + a);
    }

    void calculate(int a, int b){
        System.out.println("Total marks of 2 subjects is " + (a+ b));
    }

    void calculate(int a, int b, int c){
        System.out.println("Total marks of 3 subjects is " + (a +b +c));
    }

    public static void main(String [] bindu){
        StudentMarks cal = new StudentMarks();
        cal.calculate(20);
        cal.calculate(20,30);
        cal.calculate(20,30,29);
    }
}
