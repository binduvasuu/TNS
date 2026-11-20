package Threads;

public class Thread1 {
    public static void main(String[] args) {
        for(int i=0; i<= 10; i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
            }
            catch(InterruptedException e){
                System.out.println("Handle");
            }
        }
    }
}
