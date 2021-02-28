public class KToCTemperatureConverter implements TemperatureConverter {
    @Override
    public double convert(double inputTemperature) {
        return inputTemperature - 273.15;
    }
}
