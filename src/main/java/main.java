import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    static class Convert {
        Convert(float a1, float f2) {
            one1 = a1;
            two2 = f2;
        }

        private float one1;
        private float two2;
    }

    private static boolean compare(Convert c1, Convert c2) {
        return c1.one1 * c1.two2 < c2.one1 * c2.two2;
    }

    public static void main(String[] args) {
        // ChessPrinter.printChess(new ChessParams(args));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            float a1;
            float a2;
            try {
                System.out.println("Vvedite first convert:");
                a1 = scanner.nextFloat();
                a2 = scanner.nextFloat();
                Convert convert1 = new Convert(a1, a2);

                System.out.println("Vvedite second convert:");
                a1 = scanner.nextFloat();
                a2 = scanner.nextFloat();
                Convert convert2 = new Convert(a1, a2);

                if (compare(convert1, convert2)) {
                    System.out.println("convert 2 is > convert 1");
                }
                else {
                    System.out.println("convert 2 is < convert 1");
                }

                System.out.println("mb povtorim(y/yes)?");

                scanner.nextLine();
                String answer = scanner.nextLine();

                if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))) {
                    System.out.println("try again -> yes or y");
                    return;
                }

            } catch (InputMismatchException e) {
                System.out.print(e.getMessage()); //try to find out specific reason.
            }
        }

    }

}