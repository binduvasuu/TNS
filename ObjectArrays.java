package Nov17.Arrays;

public class ObjectArrays {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(arr[1][1]);

        System.out.println("Arrays");
        for(int i =0; i<arr.length;i++){
            for(int j =0;j<arr[i].length; j++){
                System.out.println(arr[i][j]);

            }
        }
    }
}
