import java.time.LocalDate;

public class CoffeeCalculations {
    private final double PRICE_PER_POUND = 5.99;
    private final double TAX_RATE = 0.0725;
    private double bagWeight;
    private double numberOfBags;
    private double totalPrice;
    private double totalPriceWithTax;

    public CoffeeCalculations() {
        this.bagWeight = 1.0;
        this.numberOfBags = 1.0;
        this.totalPrice = this.bagWeight * this.numberOfBags * 5.99;
        this.totalPriceWithTax = this.totalPrice + this.totalPrice * 0.0725;
        System.out.println("Today's Date: " + String.valueOf(LocalDate.now()));
        String s = "Number of Bags: " + this.numberOfBags + "\nWeight per bag: " + this.bagWeight;
        System.out.println(s);
    }

    public CoffeeCalculations(double bagWeight, double numberOfBags) {
        this.bagWeight = bagWeight;
        this.numberOfBags = numberOfBags;
        this.totalPrice = bagWeight * numberOfBags * 5.99;
        this.totalPriceWithTax = this.totalPrice + this.totalPrice * 0.0725;
        System.out.println("Today's Date: " + String.valueOf(LocalDate.now()));
        String s = "Number of Bags: " + numberOfBags + "\nWeight per bag: " + bagWeight;
        System.out.println(s);
    }

    public String getSale() {
        return String.format("Sales sub-total: $%.2f", this.totalPrice);
    }

    public String getSaleTax() {
        return String.format("Sales Tax: %%%.2f", 7.249999999999999);
    }

    public String getTotalPrice() {
        return String.format("Total Sale: $%.2f", this.totalPriceWithTax);
    }

    public String getPrice() {
        return String.format("Price per pound: $%.2f", this.totalPriceWithTax / (this.numberOfBags * this.bagWeight));
    }

    public String getTaxRate() {
        return String.format("Total Tax: $%.2f", this.totalPriceWithTax - this.totalPrice);
    }
}
