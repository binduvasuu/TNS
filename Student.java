package Day5.constructor;

class Student {
    String name;
    int age;

    Student(){
        name = "Bindu";
        age = 22;    
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
            System.out.println(name);
            System.out.println(age);
        }

public static void main(String [] bindu){
        Student s1 = new Student();
        Student s2 = new Student("Bhuvi", 22);
        
        s1.display();
        s2.display();
    }
}

