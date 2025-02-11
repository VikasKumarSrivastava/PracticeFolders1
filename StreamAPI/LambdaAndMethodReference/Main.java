package StreamAPI.LambdaAndMethodReference;

public class Main {
    public static void main(String[] args) {
        Runnable p1= new Printer()::printReset;
        Runnable p2= ()->new Printer().printReset();
        System.out.println("p1 calling method"); p1.run();
        System.out.println("p2 calling method"); p2.run();
        System.out.println("p1 calling method"); p1.run();
        System.out.println("p2 calling method"); p2.run();
        Runnable p3= Printer::printNoReset;
        Runnable p4= ()->Printer.printNoReset();
        System.out.println("p3 calling method"); p3.run();
        System.out.println("p4 calling method"); p4.run();
        System.out.println("p3 calling method"); p3.run();
        System.out.println("p4 calling method"); p4.run();

    }
}
