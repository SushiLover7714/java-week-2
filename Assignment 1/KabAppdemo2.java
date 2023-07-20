import java.util.Scanner;
public class KabAppdemo2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    int points = 0;
    boolean exit = true;
    String[] history = new String[10];
    int count = 0;
    //main title screen
    do {
      System.out.println("\n===============");
      System.out.printf("|%10s%4s\n","KAB APP","|");
      System.out.println("===============");
      System.out.println(" 1 - Kab car ");
      System.out.println(" 2 - Kab food ");  
      System.out.println(" 3 - Info & History ");
      System.out.println(" 4 - Exit ");
      System.out.println(" Your option: ");
      num = input.nextInt(); 
      switch (num) {
        
        //Kab car
        case 1:
          System.out.println("===============");
          System.out.printf("|%10s%4s\n","KAB CAR","|");
          System.out.println("===============");
          double distance,toll,total;
          String carHistory;
          double tripCost = 0;
          double kabDiscount = 0;
          char answer;
          //asking for distance
          System.out.println(" Enter distance(km): ");
          distance = input.nextDouble();
          
          //asking for toll
          System.out.println(" Enter toll(rm): ");
          toll = input.nextDouble();
          
          //make if statement for values, if negative values are entered program should be invalid
          if(distance <0 || toll <0){
            System.out.println("Invalid!");
            break;
          }
          //making a yes or no statement for carPoints
          else{ System.out.printf(" Have %d Kab points.Use it?(Y/N): ",points);
            input.nextLine();
            answer = input.nextLine().charAt(0);
            
            //Trip cost should be flat rate of 5rm if distance <=5
             if (distance <=5) { 
              tripCost = 5;
            }
            
            //formula for if distance is more than 5
            else if( distance >5){  
              tripCost = 6*(Math.sqrt(0.5*distance-2))+5 ;
            }
            //if the user choose yes for discount
            if (answer == 'y') {
              kabDiscount = (int)(points /100) *5;
              points = 0;
              //print tripcost and toll
              System.out.printf("\n%-10s:%10.2f","Trip cost", tripCost);
              System.out.printf("\n%-10s:%10.2f","Toll",toll);
              System.out.println("\n-------------------");
              
              //calculate total with discount
              total = ( tripCost + toll - kabDiscount);
              
              
              // for free rides
              if (total <= 0) {
                total=0;
                System.out.printf("\n%-10s:%10.2f\n","Total",total);
                System.out.printf("\n%-10s:%10.2f\n","Total",0.00);
                points = 0;
              }
              else{
                System.out.printf("\n%-10s:%10.2f\n","Total",total);
                System.out.printf("Total: %7.2f", total);
                points = 0;
              }
              //displaying history for car 
              carHistory = String.format("\t\tyou have been charged %.2f rm and you have earned %d points",total,points);
              for(int i = history.length-1; i>=1; i--){
                history[i] = history[i-1];
              }
              history[0] = carHistory;
              count++;
            }
            
            //if user choose no
            if (answer =='n') {
              System.out.printf("\n%-17s:%10.2f","Trip cost", tripCost);
              System.out.printf("\n%-17s:%10.2f","Toll",toll);
              System.out.println("\n----------------------------");
              total = tripCost + toll;
              int carPoints = (int)total * 10;
              
              System.out.printf("\n%-17s:%10.2f\n","Total",total);
              System.out.printf("\n%-11s:%7d\n","Kab Points Earned",carPoints);
              points = points + carPoints;
              carHistory = String.format("\tCar: you have been charged %.2f rm and you have earned %d points",total,carPoints);
              for( int i = history.length-1; i>=1; i--){
                history[i] = history[i-1];
              }
              history[0] = carHistory;
              count++;
            }
          }
          break;
          
          //Kab food
        case 2:
          //displaying title and ask for values of price and distance
          System.out.println("===============");
          System.out.printf("|%10s%4s\n","KAB FOOD","|");
          System.out.println("===============");
          double foodPrice, foodDistance, foodTotal;
          //asking the price of food
          System.out.println(" Enter Food Price: ");
          foodPrice = input.nextDouble();
          //asking for distance
          System.out.println(" Enter Distance(KM): ");
          foodDistance = input.nextDouble();
          
          // if values are in negative program should be invalid
          if (foodPrice <0 || foodDistance <0) {
            System.out.println("Invalid");
            break;
          }
          //calculating tax
          else{ System.out.printf("%-18s:%10.2f","Food Cost", foodPrice);
            System.out.printf("\n%-18s:%10.2f","distance", foodDistance);
            double tax = 0.12 * foodPrice;
            System.out.printf("\n%-18s:%10.2f","Tax ", tax);
            
            //calculating delivery fee
            double deliveryFee =3.75 * foodDistance;
            System.out.printf("\n%-18s:%10.2f","Delivery Fee ", deliveryFee);
            System.out.println("\n------------------------------");
            
            //calculating the total and points earned
            foodTotal = foodPrice + deliveryFee + tax;
            System.out.printf("\n%-18s:%10.2f\n","Total ", foodTotal);
            int foodPoints = (int)foodTotal + 3;
            System.out.printf("\n%-14s:%5.2s\n","Kab points earned ", foodPoints);
            points = points + foodPoints;
            //displaying history for food
            carHistory = String.format("\tFood: you have been charged %.2f rm and you have earned %d points",foodTotal,foodPoints);
            for( int i = history.length-1; i>=1; i--){
              history[i] = history[i-1];
            }
            history[0] = carHistory;
            count++;
            
          }
          
          continue;
          
        case 3:
          //Displaying history table and print the term below if nothing was added in food and car
          System.out.println("Kab Points:      "+points);
          System.out.println("Hist#    Description\n---------------------------------------------");
          if(history[0] == null){
          System.out.println("No history for the time being" );
        }
          else {
            for ( int i = 0; i <= history.length-1; i++){ //{}
              if( history[i] != null) {
                System.out.println( (count-i)+ "" + history[i]);
              }
            }
          }
          continue;
          //end of program
        case 4:
          System.out.printf("THANK YOU FOR USING KABAPP");
          return;
        
      }
        
    }while(exit);
  }
}