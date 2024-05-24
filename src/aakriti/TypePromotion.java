package aakriti;

import java.util.Scanner;

public class TypePromotion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte b=12;
        b=(byte) (b*3);
        //wrong b=b*7;
        System.out.println(b);
    }
}
