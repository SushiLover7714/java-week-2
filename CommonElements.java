public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = { 4, 7, 13, 17, 25 };
        int[] arr2 = { 13, 21, 43, 25, 9 };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("The common element is " + arr1[i]);
                }
            }
        }
    }
}
