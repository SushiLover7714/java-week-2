import java.util.Scanner;

public class PalindromeArray {
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
        boolean isPalindrome = isPalindrome(arr);
        if (isPalindrome == true) {
            System.out.println("Array is a palindrome");
        } else {
            System.out.println("Array is a not a palindrome");
        }
    }

    public static boolean isPalindrome(int[] arr2) {
        int left = 0;
        int right = arr2.length - 1;
        while (left < right) {
            if (arr2[left] != arr2[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
