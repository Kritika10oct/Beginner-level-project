package com.company;

class Get_the_value{
    private int id;
    private String name;

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
public class getter_setter {
    public static void main(String[] args) {
        Get_the_value value=new Get_the_value();
       // value.id=45;
        //value.name="Coding buddies";
        //System.out.println(value.name);
       // System.out.println(value.id);
        value.setName("coding buddies");
        System.out.println(value.getName());

    }
}
