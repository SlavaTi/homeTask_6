public class Main {
    public static void main(String[] args) {

        //Задача 1
        int salary = 2_459_000;
        int avarageSalary = 15_000;
        int total = 0;
        int i = 0;
        while (total < salary) {
            i++;
            total = total + avarageSalary;
            //System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println("Месяц " + i + ",итого сумма накоплений " + total);

        //Задача 2
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача 3
        int population = 12_000_000;
        int birthRate = 17 * 12_000;
        int mortalityRate = 8 * 12_000;
        int k = 0;
        while (k <= 10) {
            System.out.println("Год " + k + "-й. Численность населения составляет " + population);
            population = population + birthRate - mortalityRate;
            k++;
        }

        //Задача 4
        double depositAmount = 15_000;
        double percent = 0.07;
        double depositPercent = depositAmount;
        int l = 0;
        System.out.println("Месяц " + l + ". Сумма накоплений составляет " + depositPercent);
        do {
            depositPercent = depositPercent * (1 + percent);
            l++;
            System.out.println("Месяц " + l + ". Сумма накоплений составляет " + depositPercent);
        } while (depositPercent <= 12_000_000);

        //Задача 5
        double depositAmount_5 = 15_000;
        double percent_5 = 0.07;
        double depositPercent_5 = depositAmount_5;
        int m = 0;
        System.out.println("Месяц " + m + ". Сумма накоплений составляет " + depositPercent_5);
        do {
            depositPercent_5 = depositPercent_5 * (1 + percent_5);
            m++;
            if ( m % 6 == 0) {
                System.out.println("Месяц " + m + ". Сумма накоплений составляет " + depositPercent_5);
            }
        } while (depositPercent_5 <= 12_000_000);

        //Задача 6
        double depositAmount_6 = 15_000;
        double percent_6 = 0.07;
        double depositPercent_6 = depositAmount_6;
        System.out.println("Месяц " + 0 + ". Сумма накоплений составляет " + depositPercent_6);
        for (i = 1; i <= 9 * 12; i++) {
            depositPercent_6 = depositPercent_6 * (1 + percent_6);
            if ( i % 6 == 0) {
                System.out.println("Месяц " + i + ". Сумма накоплений составляет " + depositPercent_6);
            }
        }

        //Задача 7
        int firstFriday = 4; // 1 - 7
        for (i = firstFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчёт.");
            }

        //Задача 8
        int span = 79;
        int year = 0;
        while (year <= 2200) {
            if ((year % span == 0) && (year >= 1826) && (year <= 2126)) {
                System.out.println("Год пролёта каметы " + year);
            }
            year ++;

        }
    }
}