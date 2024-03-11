public class Main {
    public static void main(String[] args) {

        // Задание 1
        int finallyMoneySaved = 2_459_000;
        int monthCount = 0;
        double moneySavedNow = 0;
        int savedMoneyPerMonth = 15_000;
        double percentPerYear = 0.12;
        double percentPerMonth = percentPerYear / 12;       // 0.01

        while (moneySavedNow < finallyMoneySaved) {
            moneySavedNow += (moneySavedNow + savedMoneyPerMonth) * percentPerMonth + savedMoneyPerMonth;
            monthCount++;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", monthCount, moneySavedNow);
        }

        System.out.printf("Сумма %d накоплена, потребовалось %d месяцев\n\n", finallyMoneySaved, monthCount);

        // Задача 2
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Задача 3
        int population = 12_000_000;
        int birthPerThousandYear = 17;
        int deadPerThousandPerYear = 8;

        for (int y = 1; y <= 10; y++) {
            int births = population * birthPerThousandYear / 1000;
            int deaths = population * deadPerThousandPerYear / 1000;
            population += births - deaths;
            System.out.printf("Год %d, численность населения составляет %d\n", y, population);
        }
        System.out.println();

        // Задача 4
        int startSum = 15_000;
        int finishSum = 12_000_000;
        int percent = 7;
        int months = 0;
        double currentSum = startSum;

        while (currentSum < finishSum) {
            months++;
            currentSum += currentSum * 7 / 100.0;
            System.out.printf("Месяц %d, накопления составляют %.2f рублей\n", months, currentSum);
        }

        System.out.printf("Для накопления суммы %d рублей при стартовом капитале %d рублей " +
                        "и ежемесячном проценте %d потребуется %d месяцев\n\n",
                finishSum, startSum, percent, months);

        // Задача 5
        months = 0;
        currentSum = startSum;

        while (currentSum < finishSum) {
            months++;
            currentSum += currentSum * 7 / 100.0;
            if (months % 6 == 0) {
                System.out.printf("Месяц %d, накопления составляют %.2f рублей\n", months, currentSum);
            }
        }

        System.out.printf("Для накопления суммы %d рублей при стартовом капитале %d рублей " +
                        "и ежемесячном проценте %d потребуется %d месяцев\n\n",
                finishSum, startSum, percent, months);

        // Задача 6
        int monthsCount = 9 * 12;
        months = 0;
        currentSum = startSum;

        while (months < monthsCount) {
            months++;
            currentSum += currentSum * 7 / 100.0;
            if (months % 6 == 0) {
                System.out.printf("Месяц %d, накопления составляют %.2f рублей\n", months, currentSum);
            }
        }

        System.out.printf("За 9 лет при стартовой сумме %d рублей и ежемесячном проценте %d можно накопить %.2f рублей\n\n",
                startSum, percent, currentSum);

        // Задача 7
        int firstFriday = 5;
        int daysInMonth = 31;

        for (int f = firstFriday; f <= daysInMonth; f += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", f);
        }
    }
}