package aakriti;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float a=25.1234f;
        int b= (int)a;
        System.out.println(b);
        char ch='a';
        char ch2='z';
        int number2 = ch2;
        int number=ch;
        System.out.println(number);
        System.out.println(number2);
    }
}
