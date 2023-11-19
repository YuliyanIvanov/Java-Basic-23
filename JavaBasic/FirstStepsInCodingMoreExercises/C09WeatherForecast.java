package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class C09WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        switch (weather){
            case "sunny":
                System.out.println("It's warm outside!");
                break;
            default:
                System.out.println("It's cold outside!");
                break;
        }
        // if (weather.equals("sunny")){
        //     System.out.println("It's warm outside!");
        // } else {
        //    System.out.println("It's cold outside!");
        // }
    }
}
