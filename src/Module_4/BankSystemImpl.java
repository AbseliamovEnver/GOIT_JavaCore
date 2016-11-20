package Module_4;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();
        Currency currency = user.getBank().getCurrency();
        amount += user.getBank().getCommission(amount);
        if (user.getBalance() < amount || amount > limitOfWithdrawal) {
            System.out.println("You have exceeded the limit of withdrawal " + limitOfWithdrawal + " when transferring " + amount + " " + currency);
        } else if (user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            System.out.println(user.getName() + " removed from your account " + amount + " " + currency +
                    ", the balance on your account " + user.getBalance() + " " + currency);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        int limitOfFunding = user.getBank().getLimitOfFunding();
        Currency currency = user.getBank().getCurrency();
        if (limitOfFunding < amount) {
            System.out.println("You have exceeded the limit of funding " + limitOfFunding + " when transferring " + amount + " " + currency);
        } else if (limitOfFunding >= amount) {
            user.setBalance(user.getBalance() + amount);
            System.out.println(user.getName() + " your account is funding to " + amount + " " + currency +
                    ", the balance on your account " + user.getBalance() + " " + currency);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        int fromAmount = amount;
        int toAmount = amount;
        int limitOfWithdrawal = fromUser.getBank().getLimitOfWithdrawal();
        int limitOfFunding = toUser.getBank().getLimitOfFunding();
        Currency fromCurrency = fromUser.getBank().getCurrency();
        Currency toCurrency = toUser.getBank().getCurrency();
        fromAmount += fromUser.getBank().getCommission(fromAmount);
        if (fromCurrency.equals(toCurrency)) {
            if (fromUser.getBalance() < fromAmount || fromAmount > limitOfWithdrawal) {
                System.out.println("You have exceeded the limit of withdrawal " + limitOfWithdrawal + " when transferring " + amount + " " + fromCurrency);
            } else if (limitOfFunding < toAmount) {
                System.out.println("You have exceeded the limit of funding " + limitOfFunding + " when transferring " + amount + " " + toCurrency);
            } else if (fromUser.getBalance() >= fromAmount && limitOfFunding >= toAmount) {
                fromUser.setBalance(fromUser.getBalance() - fromAmount);
                toUser.setBalance(toUser.getBalance() + toAmount);
                System.out.println(fromUser.getName() + " transferred from your account " + amount + " " + fromCurrency +
                        ", the balance on your account " + fromUser.getBalance() + " " + fromCurrency);
            }
        } else {
            System.out.println("You have a different currency");
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println(user.getName() + " you received salary " + user.getSalary() + " " + user.getBank().getCurrency() +
                ", the balance on your account " + user.getBalance() + " " + user.getBank().getCurrency());
    }
}
