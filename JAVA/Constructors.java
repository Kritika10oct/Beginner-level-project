package com.company;
//we are using constructor because we cannot make get and set function for each properties
class myMainClass{
    private int id;
    private String name;
    public myMainClass(){
        id=34;
        name="codingbuddies";
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }
}
public class Constructor {
    public static void main(String[] args) {
       myMainClass value=new myMainClass();
        System.out.println(value.getName());
        System.out.println(value.getId());
    }
}
