package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class C10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());

        String result =
                (degrees >= 26 && degrees <= 35) ? "Hot" :
                        (degrees >= 20.1 && degrees <= 25.9) ? "Warm" :
                                (degrees >= 15 && degrees <= 20) ? "Mild" :
                                        (degrees >= 12 && degrees <= 14.9) ? "Cool" :
                                                (degrees >= 5 && degrees <= 11.9) ? "Cold" : "unknown";

        System.out.println(result);
    }
}
