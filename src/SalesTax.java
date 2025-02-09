import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SalesTax {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the price of your purchase");
    double pricePurchase = Double.parseDouble(sc.nextLine());
    final double tax = pricePurchase * 0.05;
    System.out.println("The tax is $" + tax);
    System.out.println("The price is $" + pricePurchase);
    System.out.println("The total price of your purchase is $" + pricePurchase + tax);
    }
}