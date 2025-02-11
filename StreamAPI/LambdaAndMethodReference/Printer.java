package StreamAPI.LambdaAndMethodReference;

public class Printer {

    Printer(){
        System.out.println("Reset Printer...");
    }

    public static void printNoReset(){
        System.out.println("Printing (no reset): "+ Printer.class.hashCode());
    }

    public void printReset(){
        System.out.println("Printing (with reset): "+Printer.class.hashCode());
    }
}
