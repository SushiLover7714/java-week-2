import java.util.Scanner;
public class Kabfood {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    double foodPrice,foodDistance,foodTotal;
    System.out.println("Enter Food Price: ");
    foodPrice = input.nextDouble();
    System.out.println("Enter Distance(km): ");
    foodDistance = input.nextDouble();
    
    if ( foodPrice < 0 || foodDistance < 0) {
      System.out.println("Invalid!");
    }
    else{ System.out.printf("%-14s:%10.2f","Food Cost", foodPrice);
      System.out.printf("\n%-14s:%10.2f","distance", foodDistance);
      double tax = 0.12 * foodPrice;
      System.out.printf("\n%-14s:%10.2f","Tax ", tax);
      double deliveryFee =3.75 * foodDistance;
      System.out.printf("\n%-14s:%10.2f","Delivery Fee ", deliveryFee);
       System.out.println("\n-------------------------");
       foodTotal = foodPrice + deliveryFee + tax;
       System.out.printf("\n%-14s:%10.2f","Total ", foodTotal);
    }
  }
}


