package ForLoopMoreExercises;

public class L09Clock {
    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (minute < 10) {
                    System.out.printf("%d : %d\n", hour, minute);
                } else {
                    System.out.printf("%d : %d\n", hour, minute);
                }
            }
        }
    }
}