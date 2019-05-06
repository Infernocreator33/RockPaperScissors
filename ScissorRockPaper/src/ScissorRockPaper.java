
import java.util.Scanner;
import java.util.Random;
public class ScissorRockPaper 
{
    public static void main(String[] args) 
    {
        //random number generator
        Random randNumber = new Random();
        //Scanner object for input
        Scanner input = new Scanner(System.in);
        //get user choice
        System.out.print("Scissor (0), Rock (1), Paper (2)");
        int userChoice = input.nextInt();
        int computerChoice;
        
        //data validation
        if(userChoice < 0 || userChoice > 2)
        {
            System.out.println("Invalid choice. ");
            System.exit(userChoice);
        }
        //Generating random number for computer
        computerChoice = randNumber.nextInt(3);
        
        //determining winner
        //if the choices are equal its a tie.
        if(userChoice == computerChoice)
        {
            switch (userChoice) 
            {
                case 0: System.out.println("Both players chose Scissor!"); break;
                case 1: System.out.println("Both players chose Rock!"); break;
                case 2: System.out.println("Both players chose Paper!"); break;
            }
        }
        if(userChoice == 0) //user chooses Scissors
        {
            if(computerChoice == 1)
            {
                System.out.println("You chose Scissors; Computer chose rock");
                System.out.println("You lose");                
            }
            else
            {
                System.out.println("You chose Scissors; Computer chose paper");
                System.out.println("You win!");
            }            
        }
        else if(userChoice == 1) //user choose rock
        {
            if(computerChoice == 0)
            {
                System.out.println("You chose rock; Computer chose scissor");
                System.out.println("You win!");            
            }
            else
            {
                System.out.println("You chose rock; Computer chose paper");
                System.out.println("You lose");
            }
        }
        else //user chooses paper
        {
            if(computerChoice == 0)
            {
                System.out.println("You chose Paper; Computer chooses scissors");
                System.out.println("You lose");
            }
            else 
            {
                System.out.println("You chose Paper; Computer chose rock");
                System.out.println("You win!");
            }
        }        
    }    
}
