package Module_2.CashWithdrawal;

import java.util.Scanner;

public class Calculate {
    static double balance = Math.random() * 1000.0;
    static int withdrawal = 0;

    public static void scanHowMatchCashToRemove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму кратную 5: ");
        withdrawal = scanner.nextInt();
    }

    public static void moneyAvailable() {
        double moneyAvailable = (balance - (balance * 5 / 100));
        int moneyToRemove = RoundCash.roundCeshDown(moneyAvailable);
        System.out.println(RoundCash.roundCeshDown(moneyAvailable));
        System.out.println("Недостаточно средств на счету");
        System.out.println("Максимальная сумма доступная для снятия: " + moneyToRemove);
    }

    public static void howMatchCashHave() {
        if (withdrawal % 5 != 0) {
            System.out.println("Вы ввели сумму не кратную 5. Операция завершена");
        } else {
            if (withdrawal > balance) {
                System.out.printf("Недостаточно средств на счету: " + "%6.2f", balance);
            } else if (withdrawal == balance) {
                moneyAvailable();
            } else if (withdrawal < balance) {
                if (withdrawal * 1.05 > balance) {
                    moneyAvailable();
                } else {
                    double comission = (withdrawal * 5.0 / 100);
                    double accountBalance = (balance - withdrawal * 1.05);
                    System.out.println("Получите Ваши деньги");
                    System.out.printf("Коммисия за снятие 5 процент: " + "%6.2f", comission);
                    System.out.println();
                    System.out.printf("Остаток на счету: " + "%6.2f", accountBalance);
                }
            }
        }
    }
}