package Nov17.Arrays;

class Employee{
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
            return "id = " + id + "\n" + "name = " + name;
        }
}


public class ArrayOfObject {
    public static void main(String[] args) {
        Employee arr[] = {new Employee(1,"Bindu"),new Employee(2,"Bhuvi")};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
