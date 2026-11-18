package Nov17.Arrays;

public class Array {
    public static void main(String[] args) {
        //1st way to create array
        int arr[] = {1,3,6,9,'B'};
        System.out.println(arr[4]);
        arr[4] = 5;
        System.out.println(arr[4]);


        //2nd way
        int arr2[] = new int[4];
        arr2[0] = 2;
        arr2[1] = 6;
        arr2[2] = 8;
        arr2[3] = 7;

        for(int i = 0; i < arr.length-1; i++){
            System.out.println(arr2[i]);
        }

        System.out.println(arr2[3]);


    }
}
