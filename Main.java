

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj rodzaj konwersji: [1] - C->F, [2] - F->C, [3] - K->C");
        int value = input.nextInt();
        if (value == 1) {
            System.out.println("Podaj temperaturę w stopniach Celcjusza:");
            double temperatureC = input.nextDouble();
            CToFTemperatureConverter temperatureConverter = new CToFTemperatureConverter();
            double temperatureF = temperatureConverter.convert(temperatureC);
            System.out.println("Temperatura w stopniach Fahrenheita: " + temperatureF);
        } else if (value == 2) {
            System.out.println("Podaj temperaturę w stopniach Fahrenheita:");
            double temperatureF = input.nextDouble();
            FToCTemperatureConverter temperatureConverter = new FToCTemperatureConverter();
            double temperatureC = temperatureConverter.convert(temperatureF);
            System.out.println("Temperatura w stopniach Celcjusza: " + temperatureC);
        }  else if (value == 3) {
            System.out.println("Podaj temperaturę w stopniach Kelvina:");
            double temperatureK = input.nextDouble();
            KToCTemperatureConverter temperatureConverter = new KToCTemperatureConverter();
            double temperatureC = temperatureConverter.convert(temperatureK);
            System.out.println("Temperatura w stopniach Celcjusza: " + temperatureC);
        }   else {

            System.out.println("Podana niepoprawna opcja");
        }
    }
}
