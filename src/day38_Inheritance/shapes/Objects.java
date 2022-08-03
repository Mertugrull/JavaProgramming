package day38_Inheritance.shapes;

public class Objects {
    public static void main(String[] args) {

        Circle circle=new Circle("Circle",5,3.14);
        circle.area();
        circle.perimeter();
        Square square=new Square("Square",5);
        square.area();
        square.perimeter();
        Rectangle rectangle=new Rectangle("Rectangle",5,10);
        rectangle.area();
        rectangle.perimeter();

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);


    }
}
