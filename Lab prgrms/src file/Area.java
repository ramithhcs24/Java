abstract class Shape{
    int a , b;
    abstract void printarea();
}

class rectangle extends Shape {
    rectangle(int l , int h){
        a = l;
        b=h;
        
    }
    void printarea(){
        System.out.println("The area of rectangle is :" + (a*b));
    }
}

class triangle extends Shape {
    triangle(int x , int y){
        a = x;
        b=y;
        
    }
    void printarea(){
        System.out.println("The area of triangle is :" + (0.5*a*b));
    }
}

class circle extends Shape{
    circle(int r ){
        a=r;
    }
    void printarea(){
        System.out.println("The area of the circle is : " + (3.146*a*a));
    }
}

public class Area {
    public static void main(String[] args) {
        rectangle r = new rectangle(10, 18);
        triangle t = new triangle(5,10);
        circle c = new circle(15);
        r.printarea();
        t.printarea();
        c.printarea();
    }
}
