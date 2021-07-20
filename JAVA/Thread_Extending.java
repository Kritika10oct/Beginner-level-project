package com.company;
class mythread1 extends Thread{
    public void run() {
        while (true) {
            System.out.println("My thread1 is cooking");
            System.out.println("I am Happy");
        }
    }
}
class mythread2 extends Thread{
    public void run() {
        while (true) {
            System.out.println("My thread2 is chatting");
            System.out.println("I am sad");

        }
    }
}

public class thread_Extending {
    public static void main(String[] args) {
       mythread1 t1=new mythread1();
       mythread2 t2=new mythread2();
       t1.start();
       t2.start();
    }
}
