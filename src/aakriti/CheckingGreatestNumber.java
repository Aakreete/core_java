package aakriti;

public class CheckingGreatestNumber {
    public static void main(String[] args) {
        int a=89;
        int b=34;
        int c=3545;
        if(a>b && a>c){
            System.out.println("A is largest");

        }else if(b>c && b>a){
            System.out.println("B is greater");

        }
        else{
            System.out.println("C is the greatest");
        }
    }
}
