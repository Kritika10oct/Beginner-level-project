package com.company;
class A{
    public int printone(){
        return 4;
    }
    public void math2(){
        System.out.println("I am a constructor of class A");
    }
}
class B extends A{
    public void math2(){
        System.out.println("I am a constructor of class B");
    }
    public void math3(){
        System.out.println("I am a constructor of second method class B");
    }
}
public class method_Overriding {
    public static void main(String[] args) {
       A a=new A();
       a.math2();
       B b=new B();
       b.math2();
    }
}
