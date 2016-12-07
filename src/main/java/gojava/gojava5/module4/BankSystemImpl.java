package gojava.gojava5.module4;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();
        Currency currency = user.getBank().getCurrency();
        amount += user.getBank().getCommission(amount);
        if (user.getBalance() < amount || amount > limitOfWithdrawal) {
            System.out.println("Limit of withdrawal " + limitOfWithdrawal);
        } else {
            user.setBalance(user.getBalance() - amount);
            System.out.println(user.getName() + " removed from your account " + amount + " " + currency);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        int limitOfFunding = user.getBank().getLimitOfFunding();
        Currency currency = user.getBank().getCurrency();
        if (limitOfFunding < amount) {
            System.out.println("Limit of funding " + limitOfFunding);
        } else {
            user.setBalance(user.getBalance() + amount);
            System.out.println(user.getName() + " your account is funding to " + amount + " " + currency);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        int fromAmount = amount;
        int limitOfWithdrawal = fromUser.getBank().getLimitOfWithdrawal();
        int limitOfFunding = toUser.getBank().getLimitOfFunding();
        Currency fromCurrency = fromUser.getBank().getCurrency();
        Currency toCurrency = toUser.getBank().getCurrency();
        fromAmount += fromUser.getBank().getCommission(fromAmount);
        if (fromCurrency.equals(toCurrency)) {
            if (fromUser.getBalance() < fromAmount || fromAmount > limitOfWithdrawal) {
                System.out.println("Limit of withdrawal " + limitOfWithdrawal + " " + fromCurrency);
            } else if (limitOfFunding < amount) {
                System.out.println("Limit of funding " + limitOfFunding + " " + toCurrency);
            } else if (fromUser.getBalance() >= fromAmount && limitOfFunding >= amount) {
                fromUser.setBalance(fromUser.getBalance() - fromAmount);
                toUser.setBalance(toUser.getBalance() + amount);
                System.out.println(fromUser.getName() + " transferred " + amount + " " + fromCurrency);
            }
        } else {
            System.out.println("You have a different currency");
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println(user.getName() + " salary " + user.getSalary());
    }
}
