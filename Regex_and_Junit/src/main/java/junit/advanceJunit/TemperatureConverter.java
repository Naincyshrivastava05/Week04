package junit.advanceJunit;


public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println("0°C - " + celsiusToFahrenheit(0) + "°F");
        System.out.println("100°C - " + celsiusToFahrenheit(100) + "°F");
        System.out.println("32°F - " + fahrenheitToCelsius(32) + "°C");
        System.out.println("212°F - " + fahrenheitToCelsius(212) + "°C");
    }
}

