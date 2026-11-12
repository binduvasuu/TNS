public class PalindromeInt {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int sum = 0;

        while(temp != 0){
            int rem = temp%10; //1  //3  //1
            sum = sum*10 + rem; //10  //10+3=13    13*10 = 130  //130+1 = 131
            temp = temp/10; //13  //1
        }

        if(sum == num){
            System.out.println("Palindrome");
        }
            else {
                System.out.println("Not palindrome");
        }
    }
}
