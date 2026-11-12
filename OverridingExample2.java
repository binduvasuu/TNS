package Day4;

//super keyword - whenever we want access old implementation along
//with new implementation we use super keyword
class Learning {
    public void course(){
        System.out.println("Only recorded video");
    }
}

class LearningV2 extends Learning{
    public void course(){
        super.course();
        System.out.println("Also live session");
    }
}

public class OverridingExample2{
    public static void main(String[] args) {
        LearningV2 v2 = new LearningV2();
        v2.course();
    }
}