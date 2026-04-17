import java.util.Scanner;
import java.util.InputMismatchException;
//Daniel Cardenas
class LabThree {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean invalid = true;

    while(invalid){
      invalid = false;
      try{
        System.out.print("How many dollars are you willing to spend? (type a positive integer): ");
        int pricePoint = input.nextInt();
        if(pricePoint < 10){
          System.out.print("I would be interested in trying boba! (type true or false): ");
          boolean isInterestedInBoba = input.nextBoolean();
          if(isInterestedInBoba){
            System.out.println("You should get Boba Mi Amor!");
          }else if(!isInterestedInBoba){
            System.out.println("You should get Starbucks!");
          }
        }
        else if(pricePoint>=10){
          System.out.print("I am addicted to warm rolls with cinnamon butter (type true or false): ");
          boolean isAddictedToRolls = input.nextBoolean();
          if(isAddictedToRolls){
            System.out.println("You should get Texas Roadhouse!");
          }else if (!isAddictedToRolls){
              System.out.print("I am looking for a full meal as opposed to a pick-me-up snack (type true or false): ");
              boolean isFullMeal = input.nextBoolean();
            if(isFullMeal){
              System.out.println("You should get Chick-fil-A!");
            }else{
              System.out.println("You should get Starbucks"); 
            }
          } 
        }
      }
      catch(InputMismatchException e){
        System.out.println("Invalid Input! Try Again!");
        invalid = true;
        input.next();
      }
    } 
    // TODO: Add your code below here.
  }
}
