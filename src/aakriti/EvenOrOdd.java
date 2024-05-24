package aakriti;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number");
        int an=n.nextInt();
        if(an%2==0){
            System.out.println("This is a even number");
        }
        else{
            System.out.println("This is a odd number");
        }
    }
}
