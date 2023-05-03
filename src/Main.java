public class Main {
    public static void main(String[] args) {
        task1();
       task2();

    }

    public static void task1() {
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int i=1;
        while (total < 2_459_000){

            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i++ + " сумма накоплений равна " + total + "рублей.");
        }
    }
    public static void task2(){
        System.out.println("Задание 2");
        int number = 0;
        for(int i = 10; i >= 1; i = i - 1){
            System.out.print(i + " ");
        }
        System.out.println();
while (number<10){
    number=number+1;
    System.out.print(number + " ");
}
}}
