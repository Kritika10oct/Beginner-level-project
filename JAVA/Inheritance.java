package com.company;
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derive extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
     base b=new base();
     b.setX(45);
     System.out.println(b.getX());
     Derive d=new Derive();
     d.setX(46);
     System.out.println(d.getX());
     d.setY(78);
     System.out.println(d.getY());
    }
}
