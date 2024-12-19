package aakriti;

public class Different {
    public static void main(String[] args) {
        String a = "*";
        int n = 8;
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j < i ; j++) {
                if (j < n) {
                    System.out.print(" ");
                } else {
                    System.out.print(a);
                }
            }
            System.out.                                 println();
            n--;
        }
    }
}
