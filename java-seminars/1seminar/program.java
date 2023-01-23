
public class program {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = new int[] {1,2,4,5,6,7,8,9};
        int a = 0;
        int[] arr2 = new int[a];

        for ( int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0) continue;
            // System.out.println(arr[i]);
            // arr[i] = arr2[i];
            // System.out.println(arr2);
        }
        for (int i = 0; i< arr2.length; i++){
            arr2[i] = arr[i];
            System.out.println(arr2);
        }
    }
}
