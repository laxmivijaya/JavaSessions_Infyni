package interfacePkg;



public class TestInterface {
    public static void main(String[] args) {

        Shape rectangleShape=new Rectangle();
        Shape squareShape=new Square();
        Rectangle rectangle=new Rectangle();

        rectangleShape.drawShape();
        rectangle.display();
        System.out.println(Shape.length);
        System.out.println(Shape.width);
        squareShape.drawShape();


    }
}
