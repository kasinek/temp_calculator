

public class CToFTemperatureConverter implements TemperatureConverter {
    @Override
    public double convert(double inputTemperature) {
        return 1.8 * inputTemperature + 32.0;
    }
}
