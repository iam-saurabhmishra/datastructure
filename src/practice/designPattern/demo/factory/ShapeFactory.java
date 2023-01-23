package practice.designPattern.demo.factory;

public class ShapeFactory {

    public static Shape getInstance(String shape){

        if(shape==null){
            return null;
        }
        else if(shape=="Triangle"){
            return new Triangle();
        }
        else if(shape=="Circle"){
            return new Circle();
        }
        else if(shape=="Square"){
            return new Square();
        }
        return null;
    }
}
