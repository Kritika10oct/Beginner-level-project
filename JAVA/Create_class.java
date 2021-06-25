import java.awt.*;
public class circle {
    Point center;
    double radius;
    
    circle(){}
    circle(Point center, double radius){
        this.center =center;
        this.radius=radius;
        
    }
    double getPerimeter(){
        return 2*Math.PI*this.radius;
        
    }
    double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    void setCenter(Point center){
        this.center=center;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    
    
}
class practice{

    public static void main(String[] args) {
        circle c1 =new circle(new Point(1,2),3);
        System.out.println(c1.getArea());

    }
    
}
