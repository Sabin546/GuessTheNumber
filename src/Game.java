import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //cere de la user un numar de la 1 la 100
        //daca nr introdus e mai mic decat nr ascuns sa se afiseze "more"
        //daca nr introdus este mai mare sa se afiseze "less"
        //daca nr introdus este egal sa se afiseze "you won"

        Random rand = new Random();
        int hiddenNumber = rand.nextInt(101);
        int attempts = 0;
        int lives = 8;


        while (true) {
            System.out.println("Guess a number between 1 and 100");
            int guessTheNumber = sc.nextInt();
            attempts++;
            lives--;
            System.out.println(lives + " lives left");


            if (lives < 1){
                System.out.println("Game Over!");
            break;}

            if (guessTheNumber < hiddenNumber) {
                System.out.println("more");
            } else if (guessTheNumber > hiddenNumber) {
                System.out.println("less");
            } else {
                System.out.println("you guessed the number!");
                System.out.println("You used " + attempts + " attempts and you have " + lives + " lives left");
                break;



            // TODO: implementeaza un sistem de vieti (8 attempts, la a 9-a Game Over!)
            }
        }
    }
}
