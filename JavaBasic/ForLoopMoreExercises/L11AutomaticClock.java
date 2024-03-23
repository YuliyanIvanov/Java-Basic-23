package ForLoopMoreExercises;

public class L11AutomaticClock {
    public static void main(String[] args) throws InterruptedException {

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    // Форматиране на времето
                    String formattedHour = hour < 10 ? "0" + hour : "" + hour;
                    String formattedMinute = minute < 10 ? "0" + minute : "" + minute;
                    String formattedSecond = second < 10 ? "0" + second : "" + second;

                    // Отпечатване на времето
                    System.out.printf("%s : %s : %s\n", formattedHour, formattedMinute, formattedSecond);

                    // Изчакване за 1 секунда преди следващата итерация
                    Thread.sleep(1000);
                }
            }
        }
    }
}
