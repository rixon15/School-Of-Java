package TemperatureConverter;

import java.util.Scanner;

public class TemperatureCV {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the temperature: ");
        double temperature = scan.nextDouble();
        scan.nextLine();
        System.out.print("Please enter the unit to convert to (Fahrenheit/Celsius): ");
        String type = scan.nextLine();

        switch(type.toLowerCase()) {
            case "fahrenheit" -> System.out.println("The temperature in Fahrenheit is " + String.format("%.2f", TemperatureConverter.toFahrenheit(temperature)));
            case "celsius" -> System.out.println("The temperature in Celsius is " + String.format("%.2f", TemperatureConverter.toCelsius(temperature)));
            default -> System.out.println("Invalid input");
        }

    }

    public static class TemperatureConverter {

        static double toCelsius(double fahrenheit) {
            return (fahrenheit - 32) / ((double) 9 / 5);
        }

        static double toFahrenheit(double celsius) {
            return celsius * ((double) 9 /5) + 32;
        }

    }
}
