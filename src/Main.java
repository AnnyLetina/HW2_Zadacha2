public class Main {
    public static void main(String[] args) {

        int account = 100; // начальный счёт
        int payment = 1200; // сумма пополнения

        int bonus; // бонус от суммы пополнения
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваша сумма бонусов: " + bonus);
        System.out.println("Ваш счёт с учётом бонусов: " + (account + payment + bonus));


    }
}