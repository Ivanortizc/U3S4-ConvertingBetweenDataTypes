public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";
        int price = Integer.parseInt(shirtPrice);
        double tax = Double.parseDouble(taxRate);
        double totaltax = price * tax;
        System.out.println("Tax: " + totaltax);

    }
}

