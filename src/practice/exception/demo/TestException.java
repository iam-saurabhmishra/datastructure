package practice.exception.demo;

public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            process();
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
    }

    private static void process() throws Exception {
        throw new Exception("Test");
    }
}
