package aakriti;

public class PrintingReverse {
    public static void main(String[] args) {

        String str="dhurba";
        int i=str.length()-1;
        while (i>=0){
            System.out.print(str.charAt(i));
            i--;
        }
    }
}
