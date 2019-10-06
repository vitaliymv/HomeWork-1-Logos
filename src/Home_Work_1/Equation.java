package Home_Work_1;

import java.util.Random;
import java.util.Scanner;

public class Equation {

    private static void mainFunction(int a, int b, int c, double D) {

        D = Math.pow(b, 2) - (4 * a * c);

        if (D < 0) {
            System.out.println("\nDiscriminant is less than 0, " +
                    "so the equation hasn't solution");
        } else if (D == 0) {
            double x;

            x = -b / (2 * a);

            double x_ceil = Math.ceil(x * 100.0) / 100.0;;

            System.out.println("\nThe discriminant is 0, x1 = x2, so the equation " +
                    "has 1 solution:\n x1 = x2 = " + x_ceil);
        } else if (D > 0) {

            double x1;
            double x2;

            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);

            double x1_ceil = Math.ceil(x1 * 100) / 100;
            double x2_ceil = Math.ceil(x2 * 100) / 100;

                System.out.println("\nThe discriminant is greater than 0, so the equation " +
                        "has 2 solution \nx1 = " + x1_ceil + "\nx2 = " + x2_ceil);
        }
    }

    public static void main(String[] args) {

        System.out.println("\nSquare equation solution: ");
        System.out.println("\nPress 1 to randomly fill in data");
        System.out.println("Press 2 to enter from the keyboard");
        System.out.print("Enter: ");

        Scanner scanNumb = new Scanner(System.in);

        int choiceNumb = scanNumb.nextInt();

        int a;
        int b;
        int c;

        double D = 0;

        Random rand = new Random();

        switch (choiceNumb){
            case 1:
                a = rand.nextInt(20) - 10;
                b = rand.nextInt(20) - 10;
                c = rand.nextInt(20) - 10;

                System.out.println(a + "*x^2 + " + b + "*x + " + c);
                System.out.println("\na = " + a + " \nb = " + b + " \nc = " + c);

                mainFunction(a, b, c, D);
                break;

            case 2:
                System.out.println("Enter a, b, c: ");

                Scanner scanData = new Scanner(System.in);
                a = scanData.nextInt();
                b = scanData.nextInt();
                c = scanData.nextInt();

                System.out.println(a + "*x^2 + " + b + "*x + " + c);
                System.out.println("\na = " + a + " \nb = " + b + " \nc = " + c);

                mainFunction(a, b, c, D);
                break;

            default:
                System.out.println("Incorrect input\n");
                break;
        }

    }

}