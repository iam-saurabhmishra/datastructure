package practice.designPattern.demo.factory;

public class TestClass {
    public static void main(String[] args) {
        Shape s=ShapeFactory.getInstance("Triangle");
        s.draw();
    }
}
