package aakriti;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a =sc.nextInt();
        System.out.println("Enter the next number as well");
        int b=sc.nextInt();
        System.out.println("Enter any operator you would like to do");
        char operator=sc.next().charAt(0);
switch (operator){
    case '+':
        System.out.println(a+b);
        break;
    case '-':
        System.out.println(a-b);
        break;
    case '*':
        System.out.println(a*b);
        break;
    case '/':
        System.out.println(a/b);
        break;
    case '%':
        System.out.println(a%b);
        break;
}
    }
}
