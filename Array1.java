public class Array1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 66, 43, 90 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}
