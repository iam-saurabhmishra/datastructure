package practice.designPattern.demo.builder;

public class Car {

    private String name;
    private String gearType;
    private String engineType;
    private String engineCC;

    private Car(CarBuilder carBuilder) {
        this.name = carBuilder.name;
        this.gearType = carBuilder.gearType;
        this.engineType = carBuilder.engineType;
        this.engineCC = carBuilder.engineCC;
    }


    public void setName(String name) {
        this.name = name;
    }



    public void setGearType(String gearType) {
        this.gearType = gearType;
    }


    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


    public void setEngine(String engineCC) {
        this.engineCC = engineCC;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", gearType='" + gearType + '\'' +
                ", engineType='" + engineType + '\'' +
                ", engineCC='" + engineCC + '\'' +
                '}';
    }

    static class CarBuilder {
        private String name;
        private String gearType;
        private String engineType;
        private String engineCC;

        public CarBuilder() {

        }

        public  CarBuilder setCarName(String name){
            this.name=name;
            return this;
        }

        public  CarBuilder setGearType(String gearType){
            this.gearType=gearType;
            return this;
        }
        public  CarBuilder setEngineType(String engineType){
            this.engineType=engineType;
            return this;
        }
        public  CarBuilder setEngineCC(String engineCC){
            this.engineCC=engineCC;
            return this;
        }

        public Car buildCar(){
            return new Car(this);
        }

    }

}
