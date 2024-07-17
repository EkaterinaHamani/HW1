public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setFillColor("Green");
        circle.setBorderColor("Grey");
        circle.printCharacteristics();

        Rectangle rectangle = new Rectangle(5,10);
        rectangle.setFillColor("Red");
        rectangle.setBorderColor("Grey");
        rectangle.printCharacteristics();

        Triangle triangle = new Triangle(5,6,8);
        triangle.setFillColor("Yellow");
        triangle.setBorderColor("Grey");
        triangle.printCharacteristics();
    }}



