package Home_Work_1;

public class Equation {

    public static void main(String[] args) {

        int a = 2;
        int b = 7;
        int c = 5;

        System.out.println("\nSquare equation solution: ");
        System.out.println("x^2 + 2*x + 3*c\n");
        System.out.println("a = " + a + " \nb = " + b + " \nc = " + c);
        double D = Math.pow(b, 2) - (4 * a * c);

        if (D < 0)
        {
            System.out.println("\nDiscriminant is less than 0, so the equation hasn't solution");
        }
        else if (D == 0)
        {
            double x;
            x = -b / (2 * a);
            System.out.println("\nThe discriminant is 0, x1 = x2, so the equation " +
                    "has 1 solution:\n x1 = x2 = " + x);
        }
        else if (D > 0)
        {
            double x1;
            double x2;

            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);

            if (x1 == x2)
            {
                System.out.println("x1 = x2 = " + x1);
            }
            else
                {
                System.out.println("\nThe discriminant is greater than 0, x1 = x2, so the equation " +
                        "has 2 solution \nx1 = " + x1 + "\nx2 = " + x2);
                }

        }

    }

}
