package aakriti;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any natural numbers");
        int range=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=range) {
            sum=sum+i;
            System.out.println(sum);
            i ++;
        }
    }
}
