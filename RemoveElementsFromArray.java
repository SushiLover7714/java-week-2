import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int arrSize = input.nextInt();
        int[] arr = new int[arrSize];
        // System.out.print("Enter values: ");
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter values: ");
            arr[i] = input.nextInt();

        }
        System.out.println("Enter the index of element to be removed");
        int index = input.nextInt();
        int[] result = RemoveElement(arr,index);
        System.out.println(Arrays.toString(result))

    }

    static int[] RemoveElement(int[] arr, int index) {

        int[] result = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
}
