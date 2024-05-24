package aakriti;

import java.util.Scanner;

public class UserInputArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the area of circle");
        double r=sc.nextDouble();
        double pie=3.14;
        double area=pie*r*r;

        System.out.println("area of circle= "+area);


    }
}
