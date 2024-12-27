// #CODSOFT
// Task 1 Number_Game
import java.util.*;
class Number_Game
{
    int range[];
    int guess;
    int random = (int)(Math.random()*100)+1;
    int attempts = 0;
    boolean ch;
    Scanner sc = new Scanner(System.in);
    void playgame()
    {
        System.out.println("Guess a number between 1 and 100:");
        while (guess != random) 
        {
            guess = sc.nextInt();
            attempts++;
            if (guess < random) 
            {
                System.out.println("Too low! Try again:");
            } else if (guess > random)
            {
                System.out.println("Too high! Try again:");
            } else 
            {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        }
    }
    static void main()
    {
        Number_Game game = new Number_Game();
        game.playgame();
    }
}