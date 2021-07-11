package com.company;
interface myCamera{
    void screenshot();
    void Videorecording();
}
interface wifi{
    void conectNetwork();
    void disconectnetwork();
}
class phone{
    void callnumber(int phonenumber){
        System.out.println("Calling Number"+phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class Smartphone extends phone implements myCamera,wifi{
   public void screenshot(){
       System.out.println("Taking a screenshort");
    }
    public void Videorecording(){
        System.out.println("start video recording");
    }

    @Override
    public void conectNetwork() {
        System.out.println("Now you are conected our network");
    }

    @Override
    public void disconectnetwork() {
        System.out.println("Now you are disconnected to our network");
    }
}
public class my_pratice_code {
    public static void main(String[] args) {
        //if we want use all the method ....
       // Smartphone sp=new Smartphone();
       // sp.screenshot();
       // sp.conectNetwork();
        //if we want to use mycamera  method inside smartphone....
        //myCamera mc=new Smartphone();
       // mc.screenshot();
       // mc.Videorecording();
        //if we want to use wifi method inside the smartphone class...
        wifi wf=new Smartphone();
        wf.conectNetwork();
        wf.disconectnetwork();
    }
}
