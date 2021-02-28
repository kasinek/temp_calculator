

public class FToCTemperatureConverter implements TemperatureConverter {
    @Override
    public double convert(double inputTemperature) {
        return (inputTemperature - 32.0) / 1.8;
    }
}
