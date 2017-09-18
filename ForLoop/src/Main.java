public class Main {

    public static void main(String[] args) {

        for (int i = 2; i <= 8; i++) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calcInterest(10000, i)));
        }
        System.out.println("-------------------:|:------------------------");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calcInterest(10000, i)));
        }
        System.out.println("-------------------:|:------------------------");
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i) == true) {
                System.out.println("Prime number fund: " + i);
                count++;
            }
            if (count == 3) {
                System.out.println("Exiting for loop");
                break;
            }
        }

    }

    public static double calcInterest(double ammount, double interestRate) {
        return (ammount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("looping" + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
