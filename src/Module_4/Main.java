package Module_4;

public class Main {
    public static void main(String[] args) {
        USBank bankUSAusd = new USBank(10L, "USA", Currency.USD, 1000, 3000, 100L, 10000000L);
        USBank bankUSAeur = new USBank(10L, "USA", Currency.EUR, 1000, 3000, 100L, 10000000L);
        EUBank bankEuropeUSD = new EUBank(20L, "Germany", Currency.USD, 3000, 5000, 300L, 3000000L);
        EUBank bankEuropeEUR = new EUBank(20L, "Germany", Currency.EUR, 3000, 5000, 300L, 3000000L);
        ChinaBank bankChinaUSD = new ChinaBank(30L, "China", Currency.USD, 5000, 1000, 400L, 4000000L);
        ChinaBank bankChinaEUR = new ChinaBank(30L, "China", Currency.EUR, 5000, 1000, 400L, 4000000L);

        User userUSAusd = new User(100L, "Jack", 12000, 40, "Google", 10000, bankUSAusd);
        User userUSAeur = new User(200L, "Bill", 10000, 30, "Oracle", 11000, bankUSAeur);
        User userEuropeUSD = new User(300L, "Karl", 20000, 50, "Deutsche Bank", 8000, bankEuropeUSD);
        User userEuropeEUR = new User(400L, "Rudolf", 50000, 60, "Siemens", 12000, bankEuropeEUR);
        User userChinaUSD = new User(250L, "Zihao", 25000, 36, "Bank of China", 7000, bankChinaUSD);
        User userChinaEUR = new User(150L, "Chan", 15000, 24, "Huawei", 5000, bankChinaEUR);

        BankSystemImpl withdraw = new BankSystemImpl();
        BankSystemImpl fund = new BankSystemImpl();
        BankSystemImpl transfer = new BankSystemImpl();
        BankSystemImpl paySalary = new BankSystemImpl();

        System.out.println(userUSAusd.getName() + " the balance on your account " + userUSAusd.getBalance() + " " + userUSAusd.getBank().getCurrency());
        withdraw.withdrawOfUser(userUSAusd, 500);
        fund.fundUser(userUSAusd, 1000);
        transfer.transferMoney(userUSAusd, userEuropeUSD, 800);
        paySalary.paySalary(userUSAusd);
        System.out.println("==================================================================================");

        System.out.println(userUSAeur.getName() + " the balance on your account " + userUSAeur.getBalance() + " " + userUSAeur.getBank().getCurrency());
        withdraw.withdrawOfUser(userUSAeur, 1000);
        fund.fundUser(userUSAeur, 5000);
        transfer.transferMoney(userUSAeur, userEuropeEUR, 1500);
        paySalary.paySalary(userUSAeur);
        System.out.println("==================================================================================");

        System.out.println(userEuropeUSD.getName() + " the balance on your account " + userEuropeUSD.getBalance() + " " + userEuropeUSD.getBank().getCurrency());
        withdraw.withdrawOfUser(userEuropeUSD, 1000);
        fund.fundUser(userEuropeUSD, 3000);
        transfer.transferMoney(userEuropeUSD, userChinaUSD, 1500);
        paySalary.paySalary(userEuropeUSD);
        System.out.println("==================================================================================");
        System.out.println(userEuropeEUR.getName() + " the balance on your account " + userEuropeEUR.getBalance() + " " + userEuropeEUR.getBank().getCurrency());
        withdraw.withdrawOfUser(userEuropeEUR, 4500);
        fund.fundUser(userEuropeEUR, 24000);
        transfer.transferMoney(userEuropeEUR, userChinaUSD, 4100);
        paySalary.paySalary(userEuropeEUR);
        System.out.println("==================================================================================");

        System.out.println(userChinaUSD.getName() + " the balance on your account " + userChinaUSD.getBalance() + " " + userChinaUSD.getBank().getCurrency());
        withdraw.withdrawOfUser(userChinaUSD, 5500);
        fund.fundUser(userChinaUSD, 5000);
        transfer.transferMoney(userChinaUSD, userChinaEUR, 5100);
        paySalary.paySalary(userChinaUSD);
        System.out.println("==================================================================================");

        System.out.println(userChinaEUR.getName() + " the balance on your account " + userChinaEUR.getBalance() + " " + userChinaEUR.getBank().getCurrency());
        withdraw.withdrawOfUser(userChinaEUR, 100);
        fund.fundUser(userChinaEUR, 4000);
        transfer.transferMoney(userChinaEUR, userEuropeEUR, 100);
        paySalary.paySalary(userChinaEUR);
    }
}
