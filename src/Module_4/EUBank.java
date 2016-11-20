package Module_4;

public class EUBank extends Bank {
    private int limitOfWithdrawal;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (currency == Currency.USD) {
            limitOfWithdrawal = 2000;
        } else if (currency == Currency.EUR) {
            limitOfWithdrawal = 2200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == Currency.EUR) {
            limitOfFunding = 20000;
        } else if (currency == Currency.USD) {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        if (currency == Currency.USD) {
            monthlyRate = 0;
        } else if (currency == Currency.EUR) {
            monthlyRate = 1;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        if (currency == Currency.USD) {
            if (summ <= 1000) {
                commission = (int) (summ * 0.05);
            } else {
                commission = (int) (summ * 0.07);
            }
        } else if (currency == Currency.EUR) {
            if (summ <= 1000) {
                commission = (int) (summ * 0.02);
            } else {
                commission = (int) (summ * 0.04);
            }
        }
        return commission;
    }
}
//        лимит снятия = 2000, если валюта - USD и 2200, если EUR
//        лимит пополнения - 20000, если EUR и 10000, если USD
//        месячная ставка - 0% на USD и 1% на EUR
//        комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
//        2%, если EUR и до 1000 и 4%, если EUR и больше 1000