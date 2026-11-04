import java.util.*;
public class Largest
{
  public static void main(String[] args)
  {
    System.out.println("Enter Three numbers:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a>b && a>c)
    {
      System.out.println("A is the largest number");
    }
    else if(b>a && b>c)
    {
    System.out.println("B is the largest number");
    }
    else
    {
    System.out.println("C is the largest number");
    }
  }

}