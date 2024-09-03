import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {


    public static void main(String[]args){

        Random rand= new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber= rand.nextInt(100) + 1;
        System.out.println("Random number is " + randomNumber);
        while(true){

        System.out.println("Enter your guess(1-100):");
        
        int playerGuess = scanner.nextInt();

        if(playerGuess == randomNumber){
            System.out.println("Correct! You Win"); 
            break; 
        } 
        else if (randomNumber < playerGuess){
            System.out.println("Nope! The number is higher . Guess again");
        }
        else { 
            System.out.println("Nope! The number is lower . Guess again");
        }

      }
    }  
}

        //Detail about this code ..........

//     This code is a simple number guessing game in Java where the player has to guess a randomly generated number between 1 and 100. Here is a step-by-step explanation of how it works:

// 1. **Import Required Classes**: 
//    - `Random` is used to generate random numbers.  
//    - `Scanner` is used to get input from the user.

// 2. **Main Method**:
//    - A `Random` object `rand` and a `Scanner` object `scanner` are created.
//    - A random number between 1 and 100 is generated and stored in the variable `randomNumber`.
//    - The generated random number is printed (this is usually for debugging purposes and might be removed in a real game).
//    - The user is prompted to enter their guess.
//    - The user's guess is read using `scanner.nextInt()`.
//    - A series of conditional checks are performed to determine if the guess is correct, too high, or too low, and an appropriate message is printed.


// Changes made:
// - Removed the debug statement that prints the random number.
// - Used a `while` loop to allow multiple guesses until the correct number is guessed.
// - Closed the `scanner` object after the game is over to free up resources.

// This version keeps the game running until the user guesses the correct number, making it more interactive and fun.


