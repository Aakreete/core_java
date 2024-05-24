package aakriti;

/*
 *****
 ****
 ***
 **
 *
 */

public class Pattern1 {
    public static void main(String[] args) {
        String b="*";
        for(int i=0; i<15; i++){
            for (int j=0; j<i; j++){
                System.out.print(b);
            }
            System.out.println();
        }
    }

}
