public class TemperatureConverter {
    // Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Kelvin
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convert Kelvin to Celsius
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Convert Fahrenheit to Kelvin
    public double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Convert Kelvin to Fahrenheit
    public double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}