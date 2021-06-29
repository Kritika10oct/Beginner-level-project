package com.company;

class Empoyee1{
    int Salary;
    String name;

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class problems_of_OOPS {
    public static void main(String[] args) {
        Empoyee1 code = new Empoyee1();
        //code.name="pooja";
        code.Salary=45;
        //System.out.println(code.getName());
        System.out.println(code.getSalary());
        code.setName("coding buddies");
        System.out.println(code.getName());

    }
}
