package com.company;

class base1{
    base1(){
        System.out.println("hey I am a base class constructor");
    }
   base1(int a){
       System.out.println("Hey I am a second base class constructor "+ a);
    }
}
class Derive1 extends base1{
    Derive1(){
        System.out.println("Hey I am Derive class constructor");
    }
    Derive1(int x,int y){
        super(5);
        System.out.println("hey I am a second derive class constructor" + x + y );
    }
}
class child extends Derive1{
    child(){
        System.out.println("Hey i am child class constructor");
    }
    child(int p,int q,int r){
        super(8,4);
        System.out.println("Hey I am second child class constructor");
    }
}
public class constructors_Inheritance {
    public static void main(String[] args) {
        child c=new child(3,6,10);
    }

}
