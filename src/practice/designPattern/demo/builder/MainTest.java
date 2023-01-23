package practice.designPattern.demo.builder;

public class MainTest {
    public static void main(String[] args) {

        Car car=new Car.CarBuilder().setCarName("sasa").setEngineCC("1500")
                .setEngineType("Petrol").setGearType("Automatic").buildCar();
        System.out.println(car);
    }
}
