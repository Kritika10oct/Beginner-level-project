package com.company;

public class Method_overloading {
    static void foo(){
        System.out.println("good morning Guy,s");
    }
    static void foo(int a){
        System.out.println(" good morning "+ a + " guys ");
    }
    /*static void tellJokes(){
        System.out.println("I INVENTED A CODE....");
    }*/
    public static void main(String[] args) {
       // tellJokes();
        foo();
        foo(3000);
    }

}
