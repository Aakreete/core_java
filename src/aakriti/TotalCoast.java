package aakriti;

import java.util.Scanner;

public class TotalCoast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil= sc.nextFloat();
        float pen =sc.nextFloat();
        float eraser=sc.nextFloat();
        float tax=0.18f;
        float totalCost=(pencil+pen+eraser);
        System.out.println(totalCost);
        float newTotal=totalCost+(0.18f*totalCost);
        System.out.println(newTotal);
        }

}
