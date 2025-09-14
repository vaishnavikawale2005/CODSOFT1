package CODSOFT;

import java.util.Scanner;

public class Four {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    System.out.println("Welcome to the Simple Currency Converter!");
    System.out.print("Enter base currency (e.g., USD): ");
    String baseCurrency = scanner.nextLine().toUpperCase();

    System.out.print("Enter target currency (e.g., EUR): ");
    String targetCurrency = scanner.nextLine().toUpperCase();

     double exchangeRate = 0.85; // Example: 1 USD = 0.85 EUR
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            exchangeRate = 0.85;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            exchangeRate = 1.18; // Example: 1 EUR = 1.18 USD
        } else {
            System.out.println("Unsupported currency pair for this simple example. Using default rate.");
        }

      System.out.print("Enter the amount to convert from " + baseCurrency + " to " + targetCurrency + ": ");
      double amountToConvert = scanner.nextDouble();

        double convertedAmount = amountToConvert * exchangeRate;

         System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);

}
}
