import java.util.Arrays;

public class EvenOddArrangeArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(GetEvenArray(arr)));
        System.out.println(Arrays.toString(GetOddArray(arr)));
        int[] evenArray = GetEvenArray(arr);
        int[] oddArray = GetOddArray(arr);
        int[] resultArr = new int[arr.length];
        for (int i = 0, j = 5; i < evenArray.length; i++, j++) {
            resultArr[i] = evenArray[i];
            resultArr[j] = oddArray[i];
        }
        /*
         * for (int i = evenArray.length, j = 0; i < resultArr.length; i++, j++) {
         * resultArr[i] = oddArray[j];
         * }
         */
        System.out.println(Arrays.toString(resultArr));
    }

    static int[] GetEvenArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] evenArray = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[j] = arr[i];
                j++;
            }
        }
        return evenArray;
    }

    static int[] GetOddArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        int[] oddArray = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArray[j] = arr[i];
                j++;
            }
        }
        return oddArray;
    }
}
