package Guess_Game;

import java.util.*;

/**
 *
 * @author rinku
 */
public class Guess_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // let's play number game "guess one"
        System.out.println("lets play guess game!");
        System.out.println("""
                           Rules : 
                           1. Try to think a number in range 1 - 100.
                           2. If guess incorrect... i will tell number is greater or smaller.
                           3. REMEMBER YOU HAVE ONLY 5 LIVES!!
                           """);
        Scanner sc = new Scanner(System.in);
        char ch = 'Y';
        boolean first = true;
        while (ch == 'y' || ch == 'Y') {
            if(first) {
                System.out.print("You Wanna play(y/n) : ");
                first = false;
            } else {
                System.out.print("You Wanna play again(y/n): ");
            }
            ch = sc.next().charAt(0);
            if(ch == 'Y') {
                ch = 'y';
            }
            if(ch != 'y') {
                break;
            }
            Random rm = new Random();
            int num = rm.nextInt(100);
            System.out.println(num);
            int lives = 5;
            while (lives > 0) {
                if(lives < 5) {
                    System.out.println(lives
                            + " lives remaining only!");
                }
                System.out.print("Guess?? : ");
                int guess = sc.nextInt();
                if (guess >= 1 && guess <= 100) {
                    if (guess == num) {
                        System.out.println("Correct!!");
                        break;
                    } else if (guess > num) {
                        System.out.println("Guess is too high!!");
                        lives--;
                    } else {
                        System.out.println("Guess is too low!!");
                        lives--;
                    }
                } else {
                    System.out.println("Wrong guess!!");
                    lives--;
                }
                if(lives == 0) {
                    System.out.println("LIVES OVER!! Game Over...................!!!");
                }
            }
        }

    }

}
