package converter;

public class Test {
    public static void main(String[] args) {
        double temperatureInCelsius = 25;

        double temperatureInKelvin = new Kelvin().convert(temperatureInCelsius);
        double temperatureInFahrenheit = new Fahrenheit().convert(temperatureInCelsius);

        System.out.println(temperatureInCelsius + " in Celsius = " + temperatureInKelvin + " in Kelvin");
        System.out.println(temperatureInCelsius + " in Celsius = " + temperatureInFahrenheit + " in Fahrenheit");
    }
}
