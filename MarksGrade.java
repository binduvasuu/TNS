import java.util.*;
public class MarksGrade
{
    int grade;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Score of a Student");
        int score = sc.nextInt();
        String grade = "";

        if(score>=90)
        {
            grade ="A+";
        }
        else if(score>=80 && score<90)
        {
            grade="A";
        }
        else if(score>=70 && score<70)
        {
            grade="B";
        }
         else if(score>=60 && score<70)
        {
            grade="B";
        }
        else
        {
          System.out.println("Fail");

        }
        System.out.println(grade);
        MarksGrade m = new MarksGrade();
        System.out.println(m.grade);


    }
    
}