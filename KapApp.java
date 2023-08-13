import java.util.Scanner;
import java.lang.Math;

public class KapApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        String[] History = new String[10];
        int point = 0;

        while (true) {
            System.out.println("| =============== |");
            System.out.println("      KAB APP      ");
            System.out.println("| =============== |");
            System.out.println("1- Kab Car");
            System.out.println("2- Kab Food");
            System.out.println("3- Info & History");
            System.out.println("4- Exit");
            System.out.print("Your option: ");
            num = input.nextInt();
            switch (num) {
                case 1:
                    point = kabCar(History, point);
                    continue;

                case 2:
                    kabFood(History);
                    continue;

                case 3:
                    showHistory(History);
                    continue;

                case 4:
                    System.out.println("Thank you for using KabApp");
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }

    public static int kabCar(String History[], int point) {
        int distance = 0;
        float toll, cost = 0;
        int discount = 0;
        char usePoint = 'N';
        String newHistory = "";
        Scanner input = new Scanner(System.in);
        System.out.println("|===============|");
        System.out.println("      KAB APP    ");
        System.out.println("| ===============");
        System.out.print("Enter distance(km): ");
        distance = input.nextInt();
        System.out.print("Enter toll(rm): ");
        input.nextLine();
        toll = input.nextFloat();
        input.nextLine();
        System.out.print("Have " + point + " Kab Points. Use it? (Y/N): ");
        usePoint = input.nextLine().charAt(0);
        if (usePoint == 'N') {
            if (distance <= 5) {
                cost = (5 + toll);
                point = Math.round(cost * 10);
                newHistory = "Car: charged " + cost + " rm and earned " + point + " Kab points ";
                addHistory(History, newHistory);
                System.out.println("Trip Cost      : " + (cost - toll));
                System.out.println("Toll          : " + (toll));
                System.out.println("--------------------------------------------------");
                System.out.println("Total      : " + (cost));
                System.out.println("Kab Points Earned     : " + (point));
            }

            else {
                cost = (float) (6 * Math.sqrt((distance / 2) - 2) + 5) + toll;
                cost = Math.round(cost * 100) / 100;
                point = Math.round(cost * 10);
                newHistory = "Car: charged " + cost + " rm and earned " + point + " Kab points ";
                addHistory(History, newHistory);
                System.out.println("Trip Cost      : " + (cost - toll));
                System.out.println("Toll          : " + (toll));
                System.out.println("--------------------------------------------------");
                System.out.println("Total      : " + (cost));
                System.out.println("Kab Points Earned     : " + (point));
            }
        } else {
            if (distance <= 5) {
                discount = (int) (point / 100) * 5;
                cost = (5 + toll);
                point = 0;

                newHistory = "Car: charged " + cost + " rm, discounted " + discount + " rm ";
                System.out.println("Trip Cost      : " + (cost - toll));
                System.out.println("Toll          : " + (toll));
                System.out.println("Discount          : " + "-" + (discount));
                if (discount > cost) {
                    cost = 0;
                    newHistory = "Car: charged " + cost + " rm, discounted " + discount + " rm ";

                    System.out.println("--------------------------------------------------");
                    System.out.println("Total      : " + (cost));
                    System.out.println("Kab Points Earned     : " + (point));

                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Total      : " + (cost - discount));
                    System.out.println("Kab Points Earned     : " + (point));
                }

            } else {
                discount = (int) (point / 100) * 5;
                cost = (float) (6 * Math.sqrt((distance / 2) - 2) + 5) + toll;
                cost = Math.round(cost * 100) / 100;
                point = 0;

                newHistory = "Car: charged " + cost + " rm, discounted " + discount + " rm ";
                System.out.println("Trip Cost      : " + (cost - toll));
                System.out.println("Toll              : " + (toll));
                System.out.println("Discount          : " + "-" + (discount));

                if (discount > cost) {

                    cost = 0;
                    newHistory = "Car: charged " + cost + " rm, discounted " + discount + " rm ";

                    System.out.println("--------------------------------------------------");
                    System.out.println("Total      : " + (cost));
                    System.out.println("Kab Points Earned     : " + (point));

                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Total      : " + (cost - discount));
                    System.out.println("Kab Points Earned     : " + (point));
                }

            }
        }
        addHistory(History, newHistory);

        return point;
    }

    public static int kabFood(String History[]) {
        System.out.println("working");
    }

    public static void showHistory(String History[]) {
        for (int i = 0; i < History.length; i++) {
            System.out.println(History[i]);
        }
    }

    public static void addHistory(String[] History, String newHistory) {
        for (int i = History.length - 2; i >= 0; i--) {
            History[i + 1] = History[i];
        }
        History[0] = newHistory;
    }

}
