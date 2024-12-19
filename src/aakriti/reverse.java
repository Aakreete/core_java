package aakriti;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        System.out.println("Enter any number you would like to reverse");
        int n=sc.nextInt();
        while (n>0){
            int lastDigit=n%10;
             temp=temp*10+lastDigit;

            n=n/10;

        }
        System.out.print(temp);
    }

}
