package 제네릭프린터;

public class GenericMain {
    public static void main(String[] args) {
        GenericPrinter<Powder> printer1 = new GenericPrinter<>();
        printer1.setMaterial(new Powder());
        System.out.println(printer1);

        GenericPrinter<Plastic> printer2 = new GenericPrinter<>();
        printer2.setMaterial(new Plastic());
        System.out.println(printer2);

        GenericPrinter<Fiber> printer3 = new GenericPrinter<>();
        printer3.setMaterial(new Fiber());
        System.out.println(printer3);

        printer1.getMaterial().doPrinting();
        printer2.getMaterial().doPrinting();
        printer3.getMaterial().doPrinting();
    }
}
