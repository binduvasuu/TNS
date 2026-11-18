package Nov12.String;

public class StringDemo {

    public static void main(String[] args) {

        String name = "abc";
        String name2 = new String("abc");
        String name4 = new String("abc");

        String name3 = "abc";

        System.out.println(name2);

        System.out.println(name == name2);
        System.out.println(name.equals(name2));

        System.out.println(name == name3);
        System.out.println(name2 == name3);

        System.out.println(name.equals(name3));

        System.out.println(name2 == name4);
    }
}