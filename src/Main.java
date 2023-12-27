//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int score = 10;//счет клиента (начальные данные).
        int depositAccount = 3000; //депозитный счет клиента -счет для накопления бонусных средств.

        int bonus;

        if (depositAccount > 1000) {
            bonus = depositAccount / 100;
        } else {
            bonus = 0;
        }
        int balance = score + depositAccount + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }
}