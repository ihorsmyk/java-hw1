package converter;

public class Kelvin implements Converter {
    @Override
    public double convert(double valueInCelsius) {
        return valueInCelsius + 273.15;
    }
}
