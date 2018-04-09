package com.fmi.tv.tests;

import java.util.Scanner;

/**
 * @author emanuel.dumitru9@gmail.com
 *
 */
public class App {

    public static void program() {
        Scanner sc = new Scanner(System.in);
        int n, nr, i;
        int[] v = new int[20];
        char s;
        boolean found;
        do {
            System.out.println("Input an integer between 1 and 10: ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);

        for (i = 0; i < n; i++) {
            System.out.println("Insert into array v a value: ");
            v[i] = sc.nextInt();
        }

        do {
            System.out.println("Input nr to search for: ");
            nr = sc.nextInt();
            found = false;

            for (i = 0; !found && i < n; i++) {
                if (v[i] == nr)
                    found = true;
            }

            if (found) {
                System.out.println("Nr " + nr + " appears in v at position " + (i - 1));
            } else {
                System.out.println("Nr " + nr + " does not appear in v");
            }
            System.out.println("Search for another number?[y/n]: ");
            s = sc.next().charAt(0);

        } while (s == 'y' || s == 'Y');
    }

    public static void main( String[] args ) {
        program();
    }
}
