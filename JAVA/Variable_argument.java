package com.company;

public class Variable_Argument {
    static int sum(int...arr) {
        int result=0;
        for(int a:arr){
           result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs argument");
        System.out.println("The sum of 3 and 4 is : "+ sum(3,4));
        System.out.println("The sum of 3 ,5and 4 is : "+ sum(3,4,5));
        System.out.println("The sum of 3 ,5,6and 4 is : "+ sum(3,4,5,6));
        System.out.println("The sum of 3 5,6,7,8and 4 is : "+ sum(3,4,5,6,7));
    }
}
