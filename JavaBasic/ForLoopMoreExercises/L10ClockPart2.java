package ForLoopMoreExercises;

public class L10ClockPart2 {
    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int seconds = 0; seconds < 60; seconds++) {
                    if (minute < 10) {
                        System.out.printf("%d : %d : %d\n", hour, minute, seconds);
                    } else {
                        System.out.printf("%d : %d : %d\n", hour, minute, seconds);
                    }
                }
            }
        }
    }
}
