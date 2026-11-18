package Nov17.ExceptionalHandling;

public class Exceptions {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try{
        //System.out.println("Hiiiiiiii");
        System.out.println(arr[5]);
        System.out.println("Hi");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Handle");
        }
        catch(Exception e){
            System.out.println("Hello from Exception");
        }
        finally{
            System.out.println("Hello from Finally");
        }
        //System.out.println("Hello");
    }
}
