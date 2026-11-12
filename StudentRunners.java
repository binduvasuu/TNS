package staticandnonstatic;

class Student{
    int id;
    String name ;
    int marks ;
    String subject; 

    static String collegeName = "Malnad college of engineering";

    void studentDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
        System.out.println(subject);
    }

    void collegeName(){
        System.out.println(collegeName);
    }
}

public class StudentRunners {
    public static void main(String[] args) {
        
    Student student = new Student();
    student.id = 1;
    student.name ="Bindu";
    student.marks = 50;
    student.subject = "English";

    student.studentDetails();
    student.collegeName();

    }
    
}
