public class StringSplitTest {
    public static void main(String[] args) {
        String str = "1 2 3 4 5";
        String[] arr = str.split(" ", 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }

}
