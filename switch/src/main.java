public class main {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("was not 1 or 2");
        }

        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
        }

        char switchChar = 'a';

        switch (switchChar) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println("Char found it was " + switchChar);
                break;
            default:
                System.out.println("Not found the char was " + switchChar);
                break;

        }


    }
}
