package aakriti;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=sc.nextInt();
        if(a<0){
            System.out.println("This is a negative number");
        }
        else{
            System.out.println("This is a positive number");
        }
    }
}
