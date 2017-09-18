/**
 * Created by TFA on 26/06/2017.
 */
public class Main {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);


        boolean isAlien = false;

        if (isAlien == true)
            System.out.println("It is not an Alien!");
        else
            System.out.println(".|.");

        int topScore = 100;
        int secondeScore = 100;
        if (topScore >= 100)
            System.out.println("you got the high score!");
        else
            System.out.println("LOOSSER");

        if ((topScore > 98) || (topScore <= 90))
            System.out.println("one of these test is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("TRUE");

        boolean iscar = true;
        if (iscar)
            System.out.println("SHIT");

        iscar = false;
        boolean wasCar = iscar ? true : false;
        System.out.println(wasCar);

        double first = 20d;
        double seconde = 80d;
        double result2 = ((first + seconde) * 25) % 40;
        if (result2 <= 20)
            System.out.println(result2 + " its over the limit");
        else
            System.out.println("is no over the limite");


    }
}
