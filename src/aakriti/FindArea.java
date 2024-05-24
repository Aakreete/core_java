package aakriti;

import java.util.Scanner;

public class FindArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Input radius of circle");

        double r = scanner.nextDouble();
        double pie = 3.5;
        double area = pie * r * r;
        System.out.println("Area of Circle is:" + area);
    }

}
