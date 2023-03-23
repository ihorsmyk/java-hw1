package converter;

public class Fahrenheit implements Converter {
    @Override
    public double convert(double valueInCelsius) {
        return valueInCelsius * 1.8 + 32;
    }
}
