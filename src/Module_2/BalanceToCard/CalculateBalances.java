package Module_2.BalanceToCard;

import java.util.Scanner;

public class CalculateBalances {

    public static void calculate() {
        int[] balances = {2548, 6859, 9637, 100, 26};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Bill", "Lane"};

        String ownerName;
        int withdrawal;
        boolean owner = true;

        Scanner scanName = new Scanner(System.in);
        System.out.println("Введите имя: ");
        ownerName = scanName.nextLine();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму, которую требуется снять со счёта: ");
        withdrawal = scanner.nextInt();

        for (int i = 0; i < (ownerNames.length); i++) {
            if (ownerNames[i].equals(ownerName)) {
                if (balances[i] >= (double) withdrawal * 1.05) {
                    double comission = (withdrawal * 5.0 / 100);
                    double accountBalance = (balances[i] - withdrawal * 1.05);
                    System.out.println(ownerNames[i] + " получите Ваши деньги");
                    System.out.printf("Коммисия за снятие 5 процент: " + "%6.2f", comission);
                    System.out.println();
                    System.out.printf("На Вашем счету: " + "%6.2f", accountBalance);
                    owner = false;
                    break;
                } else if (balances[i] < (double) withdrawal * 1.05) {
                    double moneyAvailable = (balances[i] - (balances[i] * 5 / 100));
                    System.out.println(ownerNames[i] + " недостаточно средств на Вашем счету");
                    System.out.printf("Остаток на счету: " + "%6.2f", (double) balances[i]);
                    System.out.println();
                    System.out.println("Максимальная сумма доступная к снятию с учетом коммисии: " + moneyAvailable);
                    owner = false;
                }
            }
        }
        if (owner) {
            System.out.println("Клиента с именем \"" + ownerName + "\" нет");
        }
    }
}