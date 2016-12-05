package main.java.module4;

public class Main {
    public static void main(String[] args) {
        USBank bankUsaUsd = new USBank(10L, "USA", Currency.USD, 1000, 3000, 100L, 10000000L);
        USBank bankUsaEur = new USBank(10L, "USA", Currency.EUR, 1000, 3000, 100L, 10000000L);
        EUBank bankEuropeUsd = new EUBank(20L, "Germany", Currency.USD, 3000, 5000, 300L, 3000000L);
        EUBank bankEuropeEur = new EUBank(20L, "Germany", Currency.EUR, 3000, 5000, 300L, 3000000L);
        ChinaBank bankChinaUsd = new ChinaBank(30L, "China", Currency.USD, 5000, 1000, 400L, 4000000L);
        ChinaBank bankChinaEur = new ChinaBank(30L, "China", Currency.EUR, 5000, 1000, 400L, 4000000L);

        User userUsaUsd = new User(100L, "Jack", 12000, 40, "Google", 10000, bankUsaUsd);
        User userUsaEur = new User(200L, "Bill", 10000, 30, "Oracle", 11000, bankUsaEur);
        User userEuropeUsd = new User(300L, "Karl", 20000, 50, "Deutsche Bank", 8000, bankEuropeUsd);
        User userEuropeEur = new User(400L, "Rudolf", 50000, 60, "Siemens", 12000, bankEuropeEur);
        User userChinaUsd = new User(250L, "Zihao", 25000, 36, "Bank of China", 7000, bankChinaUsd);
        User userChinaEur = new User(150L, "Chan", 15000, 24, "Huawei", 5000, bankChinaEur);

        BankSystemImpl withdraw = new BankSystemImpl();
        BankSystemImpl fund = new BankSystemImpl();
        BankSystemImpl transfer = new BankSystemImpl();
        BankSystemImpl paySalary = new BankSystemImpl();

        System.out.println(userUsaUsd.getName() + " balance " + userUsaUsd.getBalance());
        withdraw.withdrawOfUser(userUsaUsd, 500);
        fund.fundUser(userUsaUsd, 1000);
        transfer.transferMoney(userUsaUsd, userEuropeUsd, 800);
        paySalary.paySalary(userUsaUsd);
        System.out.println("===========================================================================");

        System.out.println(userUsaEur.getName() + " balance " + userUsaEur.getBalance());
        withdraw.withdrawOfUser(userUsaEur, 1000);
        fund.fundUser(userUsaEur, 5000);
        transfer.transferMoney(userUsaEur, userEuropeEur, 1500);
        paySalary.paySalary(userUsaEur);
        System.out.println("===========================================================================");

        System.out.println(userEuropeUsd.getName() + " balance " + userEuropeUsd.getBalance());
        withdraw.withdrawOfUser(userEuropeUsd, 1000);
        fund.fundUser(userEuropeUsd, 3000);
        transfer.transferMoney(userEuropeUsd, userChinaUsd, 1500);
        paySalary.paySalary(userEuropeUsd);
        System.out.println("===========================================================================");

        System.out.println(userEuropeEur.getName() + " balance " + userEuropeEur.getBalance());
        withdraw.withdrawOfUser(userEuropeEur, 4500);
        fund.fundUser(userEuropeEur, 24000);
        transfer.transferMoney(userEuropeEur, userChinaUsd, 4100);
        paySalary.paySalary(userEuropeEur);
        System.out.println("===========================================================================");

        System.out.println(userChinaUsd.getName() + " balance " + userChinaUsd.getBalance());
        withdraw.withdrawOfUser(userChinaUsd, 5500);
        fund.fundUser(userChinaUsd, 5000);
        transfer.transferMoney(userChinaUsd, userChinaEur, 5100);
        paySalary.paySalary(userChinaUsd);
        System.out.println("===========================================================================");

        System.out.println(userChinaEur.getName() + " balance " + userChinaEur.getBalance());
        withdraw.withdrawOfUser(userChinaEur, 100);
        fund.fundUser(userChinaEur, 4000);
        transfer.transferMoney(userChinaEur, userEuropeEur, 100);
        paySalary.paySalary(userChinaEur);
    }
}
