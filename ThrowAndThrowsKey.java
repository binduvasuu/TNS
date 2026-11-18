package Nov17.ExceptionalHandling;

public class ThrowAndThrowsKey {
    public static void CheckEven(int num){
        if(num%2 == 0){
            System.out.println("Even Number");
        } else {
            throw new ArithmeticException("Not Even Number");
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            CheckEven(5);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
