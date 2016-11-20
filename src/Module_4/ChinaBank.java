package Module_4;

public class ChinaBank extends Bank {
    private int limitOfWithdrawal;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (currency == Currency.USD) {
            limitOfWithdrawal = 100;
        } else if (currency == Currency.EUR) {
            limitOfWithdrawal = 150;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == Currency.EUR) {
            limitOfFunding = 5000;
        } else if (currency == Currency.USD) {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        if (currency == Currency.USD) {
            monthlyRate = 1;
        } else if (currency == Currency.EUR) {
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        if (currency == Currency.USD) {
            if (summ <= 1000) {
                commission = (int) (summ * 0.03);
            } else {
                commission = (int) (summ * 0.05);
            }
        } else if (currency == Currency.EUR) {
            if (summ <= 1000) {
                commission = (int) (summ * 0.1);
            } else {
                commission = (int) (summ * 0.11);
            }
        }
        return commission;
    }
}
//        лимит снятия = 100, если валюта - USD и 150, если EUR
//        лимит пополнения - 5000, если EUR и 10000, если USD
//        месячная ставка - 1% на USD и 0% на EUR
//        комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
//        10%, если EUR и до 1000 и 11%, если EUR и больше 1000