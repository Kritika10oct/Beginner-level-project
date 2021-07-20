package com.company;
class thrad_implements1 implements  Runnable{
    public  void  run() {
        while (true) {
            System.out.println("Hey I am Thread1 Runnatable");
            System.out.println("I am Happy for this thread class");
        }
    }

}
class thrad_implements2 implements  Runnable{
    public  void  run() {
        while (true) {
            System.out.println("Hey I am Thread2 Runnatable");
            System.out.println("I am sad for this thread class");
        }
    }

}
public class thread_Runtable {
    public static void main(String[] args) {
        thrad_implements1 Bullets1=new thrad_implements1();
        Thread gun1=new Thread(Bullets1);
        thrad_implements2 Bullets2=new thrad_implements2();
        Thread gun2=new Thread(Bullets2);
        gun1.start();
        gun2.start();
    }
}
