
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to the Coffee Sales Tracker. \n This Program will calculate the amount due for your coffee sales transactions. \n Are you ready to begin Y/N?");
            char input = scanner.nextLine().toLowerCase().charAt(0);
            switch (input) {
                case 'n':
                    return;
                case 'y':
                    System.out.println("Number of bags:");

                    try {
                        double numBags = scanner.nextDouble();
                        System.out.println("Weight per bag");
                        double weightPerBag = scanner.nextDouble();
                        CoffeeCalculations coffeeCalculations = new CoffeeCalculations(weightPerBag, numBags);
                        printCoffeeCalculations(coffeeCalculations);
                    } catch (InputMismatchException var8) {
                        System.out.println("Invalid input. Must enter 'Y' or 'N'");
                    }

                    System.out.println("Do you have another sale to ring up Y/N? ");
                    scanner.nextLine();
                    char anotherSale = scanner.nextLine().toLowerCase().charAt(0);
                    if (anotherSale != 'y') {
                        if (anotherSale == 'n') {
                            return;
                        }

                        System.out.println("Invalid input. Must enter 'Y' or 'N'");
                    }
                    break;
                default:
                    System.out.println("Invalid input. Must enter 'Y' or 'N' ");
            }
        }
    }

    public static void printCoffeeCalculations(CoffeeCalculations coffeeCalculations) {
        System.out.println(coffeeCalculations.getPrice());
        System.out.println(coffeeCalculations.getSaleTax());
        System.out.println(coffeeCalculations.getSale());
        System.out.println(coffeeCalculations.getTaxRate());
        System.out.println(coffeeCalculations.getTotalPrice());
    }
}
