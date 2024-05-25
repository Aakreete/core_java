package aakriti;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your temperature");
        double fever=sc.nextDouble();
        if(fever>98.86){
            System.out.println("Oh dear, You have a fever. Please take care ");
        }else{
            System.out.println("You don't have a fever, congratulations!!");
        }
    }
}
