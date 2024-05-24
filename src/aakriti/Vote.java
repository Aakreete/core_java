package aakriti;

public class Vote {
    public static void main(String[] args) {
    int age=17;
    if(age>=18){
        System.out.println("You can vote");
    }
   else if(age>13 && age<18){
        System.out.println("You are a teenager");
    }
    else {
        System.out.println("You can't vote");
    }
}
}
