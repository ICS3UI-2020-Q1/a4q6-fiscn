import java.util.Scanner; 

/**
 *
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input 
    Scanner input = new Scanner(System.in); 

    //prompt the user to enter in a number 
    System.out.println("Which number would you like to check?");

    //declare variable for user input and to keep track of division 
    int user_NM = input.nextInt(); 
    int Divis = 2;   

    // create while statement to determine if the number is prime or not 
    while(Divis < user_NM){
      if(user_NM % Divis == 0){
        System.out.println(user_NM + " is not a prime number"); 
      break;
      }Divis = Divis + 1; 
    } 
     if(user_NM == Divis){
       System.out.println(user_NM + " is a prime number");
     }
    
    
  


    
  }
}
