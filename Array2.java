public class Array2 {
    public static void main(String[] args) {
        String[] arr = { "Cats", "Lizards", "Humans", "unicorn" };
        boolean isExist = false;
        String target = "Dragons";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                isExist = true;
                break;
            } else {
                isExist = false;
            }

        }
        if (isExist == true) {
            System.out.println("Target is in array");
        } else if (isExist == false) {
            System.out.println("Target is not in array");
        }
    }

}
