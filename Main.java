public class Main {
    public static void main(String[] args) {
        int[] temperatures = {75, 82, 79, 85, 76, 60, 81, 78, 90, 72};
        int sum = 0;
        final int ALARM_THRESHOLD = 80;
        final int MINUTES_COUNT = temperatures.length;
        System.out.println("Начало мониторинга температуры: \n");
        for (int i = 0; i < MINUTES_COUNT; i++) {
            int currentTemp = temperatures[i];
            sum += currentTemp;
            if (currentTemp > ALARM_THRESHOLD) {
                System.out.printf("ТРЕВОГА!!!!!!!!!!!!!!!! На %d-й минуте температура составила %d градусов.%n",
                        i + 1, currentTemp);
            }
        }
        double avg = (double) sum / MINUTES_COUNT;
        System.out.println("\n Результаты мониторинга:");
        System.out.printf("Средняя температура за 10 минут: %.2f градусов.%n", avg);
    }
}
