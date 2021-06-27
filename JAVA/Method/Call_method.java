package com.company;

public class method {
    int Logic(int x,int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c;
        method obj=new method();
        c=obj.Logic(a,b);
        System.out.println(c);
    }
}
