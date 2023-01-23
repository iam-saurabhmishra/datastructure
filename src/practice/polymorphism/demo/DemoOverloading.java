package practice.polymorphism.demo;

public class DemoOverloading {

    public static void main(String[] args) {
        System.out.println("Main Method");
        DemoOverloading.main("sa");
    }

    public static void main(String i){
        System.out.println("Overloaded Main Method");
    }

    public static int add(int x, int y)
    {
        return x+y;
    }

    public static double add(int x, int y,int z)
    {
        return x+y;
    }

    public static int add(double x, int y)
    {
        return (int) (x+y);
    }

    public static int add(int x, double y)
    {
        return (int) (x+y);
    }
}
