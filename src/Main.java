public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {

            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i++ + " сумма накоплений равна " + total + "рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int number = 0;
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int Y = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int year = 0;
        int annualMortality = Y * mortality / 1000;
        int annualFertility = Y * fertility / 1000;

        while (year < 10) {
            year = year + 1;
            Y = Y + (annualFertility - annualMortality);
            System.out.println("Год " + year + ", численность населения составляет " + Y);

        }

    }

    public static void task4() {
        System.out.println("Задание 4");
        int invoiceAmount = 15000;
        int total = 0;
        int month = 0;

        while (total < 12_000_000) {
            total = total + invoiceAmount * 7 / 100;
            month = month + 1;
            System.out.println("месяц " + month + " накоплено " + total + " рублей");
        }

    }

    public static void task5() {
        System.out.println("Задание 5");
        int invoiceAmount = 15000;
        int total = 0;
        int month = 0;

        while (total < 12_000_000) {
            total = total + invoiceAmount * 7 / 100;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("месяц " + month + " накоплено " + total + " рублей");
            }

        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        int invoiceAmount = 15000;
        int total = 0;
        int month = 0;
        int year = 0;
        while (year < 9) {
            total = total + invoiceAmount * 7 / 100;
            month = month + 1;
            if (month % 12 == 0)
                year = year + 1;
            if (month % 6 == 0)
                System.out.println("Василий за " + year + " лет " + month + " месяцев, накопит " + total + " рублей");

        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        for (int number = 2; number <= 31; number = number + 7) {
            System.out.println("Сегодня пятница, " + number + " -е число. Необходимо подготовить отчет");
        }

    }
    public static void task8() {
        System.out.println("Задание 8");
        for (int number = 2; number <= 31; number = number + 7) {
            System.out.println("Сегодня пятница, " + number + " -е число. Необходимо подготовить отчет");
        }
    }
    public static void task9() {
        System.out.println("Задание 9");
        int startYear = 2023 - 200;
        int endYear = 2023 + 100;
        for (int i = 0; i <endYear; i+=79) {
            if (i>startYear)
                System.out.println(i);
        }
    }
}
