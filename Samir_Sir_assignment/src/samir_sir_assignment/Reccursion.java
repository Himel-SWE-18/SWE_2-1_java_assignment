package samir_sir_assignment;

import java.util.Scanner;

public class Reccursion {

    static int Fib(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1 || i == 2) {
            return 1;
        } else {
            return Fib(i - 1) + Fib(i - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This programme gives you fibonacci series of 'n' numbers.."
                + System.lineSeparator());

        System.out.println("Enter the 'n' of fibonacci series: ");

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Fib[" + (i+1) + "] = " + Fib(i) + System.lineSeparator());
        }
        System.lineSeparator();
    }
}
