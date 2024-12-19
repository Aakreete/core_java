package aakriti;

import java.util.Scanner;

public class IncomeTax {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        if (income <= 500000) {
            System.out.println("You gotta need to pay any tax");
        } else if (income < 1000000) {
            System.out.println("You need to pay 20% tax");
        } else {
            System.out.println("You need to pay 30% tax");
        }
    }


}
