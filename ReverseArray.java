import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 33, 45, 170, 320 };

        int[] revArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            revArr[j] = arr[i];
        }
        System.out.println(Arrays.toString(revArr));
    }
}
