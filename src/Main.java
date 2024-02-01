//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialBalance = 200;
        int deposit = 2000;
        int bonus;

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int balance = initialBalance + deposit + bonus;

        System.out.println("Счёт: " + balance);
        System.out.println("Бонус: " + bonus);


    }
}