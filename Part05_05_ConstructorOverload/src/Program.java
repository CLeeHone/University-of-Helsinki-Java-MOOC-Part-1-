public class Program {
 
    public static void main(String[] args) {
        // Test your class here
        Product tapeMeasure = new Product("Tape measurer");
        Product plaster = new Product("Plaster", "Home improvement section");
        Product tire = new Product("Tire", 5);
 
        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tire);
    }
}