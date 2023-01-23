package demo;


public class Car {


    private String color;

    private String type;

    private String isAutomatic;

    public Car(String color, String type,String isAutomatic) {
        this.color = color;
        this.type = type;
        this.isAutomatic=isAutomatic;

    }
 public Car()
 {

 }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getIsAutomatic() {
        return isAutomatic;
    }

    public void setIsAutomatic(String isAutomatic) {
        this.isAutomatic = isAutomatic;
    }
}