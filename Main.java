package Nov18.CreatingException;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(17, "Ram");
        p.display();
        try{
            p.checkEligibility(p.age);
        }
        catch(VoterIDException e){
            System.out.println(e.getMessage());
        }
    }
}