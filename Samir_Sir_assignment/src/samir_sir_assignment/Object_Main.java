package samir_sir_assignment;

import java.util.Scanner;

public class Object_Main {

    public static void main(String[] args) {

        //direct shows output in new class...
        System.out.print("Firstly Random change of velocity is 20 m/s and" + System.lineSeparator()
                + "random time change is 5 s." + System.lineSeparator()
                + "Then Acceleration of the particle: ");
        Object_sec1 try1 = new Object_sec1();
        System.lineSeparator();

        Scanner input = new Scanner(System.in);

        int initial_v, final_v, time;

        //taking input from user...
        System.out.print("Secondly we wanna take values from user..." + System.lineSeparator()
                + "Initial velocity: ");
        initial_v = input.nextInt();
        System.out.print("Final velocity: ");
        final_v = input.nextInt();
        System.out.print("Passed time: ");
        time = input.nextInt();

        Object_sec2 try2 = new Object_sec2(initial_v, final_v, time);
    }
}
