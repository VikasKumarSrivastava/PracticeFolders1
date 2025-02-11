package StreamAPI.LambdaAndMethodReference;

public class Main {
    public static void main(String[] args) {
        Runnable p1= new Printer()::printReset;
        Runnable p2= ()->new Printer().printReset();
        System.out.println("p1 calling method"); p1.run();
        System.out.println("p2 calling method"); p2.run();
    }
}
