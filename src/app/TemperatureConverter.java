package app;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("App for temperature converting");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть '1' для конвертації з фаренгейтів в цельсії або '2' для конвертації з цельсіїв в фаренгейти: ");
        int choice = scanner.nextInt();

        if (choice == 1) {

            System.out.print("Введіть температуру в фаренгейтах: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("Температура в фаренгейтах: %.2f°F%n", fahrenheit);
            System.out.printf("Температура в цельсіях: %.2f°C%n", celsius);
        } else if (choice == 2) {

            System.out.print("Введіть температуру в цельсіях: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("Температура в цельсіях: %.2f°C%n", celsius);
            System.out.printf("Температура в фаренгейтах: %.2f°F%n", fahrenheit);
        } else {
            System.out.println("Неправильний вибір. Будь ласка, спробуйте ще раз.");
        }

        scanner.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
