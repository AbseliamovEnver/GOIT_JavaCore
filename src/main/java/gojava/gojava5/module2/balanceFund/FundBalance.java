package gojava.gojava5.module2.balanceFund;

import java.util.Scanner;

public class FundBalance {

    public static void fund() {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Bill", "Lane"};

        String ownerName;
        int withdrawal;
        boolean owner = true;

        Scanner scanName = new Scanner(System.in);
        System.out.println("Введите имя: ");
        ownerName = scanName.nextLine();

        Scanner scanMoney = new Scanner(System.in);
        System.out.println("Введите сумму, на которую хотите пополнить счёт: ");
        withdrawal = scanMoney.nextInt();

        for (int i = 0; i < (ownerNames.length); i++) {
            if (ownerNames[i].equals(ownerName)) {
                balances[i] += withdrawal;
                System.out.println(ownerNames[i] + " Ваш счёт пополнен на " + withdrawal);
                System.out.printf("На Вашем счету: " + "%6.2f", (double) balances[i]);
                owner = false;
                break;
            }
        }
        if (owner) {
            System.out.println("Клиента с именем \"" + ownerName + "\" нет");
        }
    }
}
