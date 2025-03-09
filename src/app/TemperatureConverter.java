package app;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("App for temperature converting");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть температуру в фаренгейтах: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = fahrenheitToCelsius(fahrenheit);

        System.out.printf("Температура в цельсіях: %.2f°C%n", celsius);

        scanner.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
