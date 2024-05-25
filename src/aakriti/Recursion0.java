package aakriti;

import java.util.Scanner;

public class Recursion0 {
    //Q. find the factorial of a n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n number");
        int n = scanner.nextInt();
        printFactorial(n, 1);
    }

    public static void printFactorial(int n, int fac) {
        if (n == 1) {
            System.out.println(fac);
            return;
        }
        fac *= n;
        printFactorial(n - 1, fac);
    }
}
