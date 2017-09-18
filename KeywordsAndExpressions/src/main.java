/**
 * Created by TFA on 12/09/2017.
 */
public class main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        /*if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else if (score < 100) {
            System.out.println("Your score was less than 100");
        } else {
            System.out.println("Go to bed you fat fucker");
        }*/

        if (gameOver == true) {
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("your final socre was " + finalScore);
        }

        if (gameOver == true)


    }
}
