package app;

import java.util.Scanner;

public class ProductBInfo {

    static String productName;
    static double quantity;
    static double price;

    public static void main(String[] args) {
        doInputs();
        showData(processData());
    }

    private static void doInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        productName = scanner.nextLine().trim();
        System.out.print("Введите количество товара: ");
        quantity = scanner.nextDouble();
        System.out.print("Введите цену товара: ");
        price = scanner.nextDouble();
        System.out.print("---------------------------\n");
        scanner.close();
    }

    private static String processData() {
       Product<Double> product = new Product<> (productName,quantity,price);
        String name = product.getName();
        quantity = product.getQnty();
        price = product.getPrice();
        String cost = Rounder.roundValue(calcSales(quantity, price));
        return "Товар: " + name + "\nСтоимость (грн.): " + cost;
    }

    private static double calcSales(double quantity, double price) {
        return quantity * price;
    }

    private static void showData(String output) {
        System.out.println(output);
    }
}
