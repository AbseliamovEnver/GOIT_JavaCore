package main.java.module3.user;

public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary() {
        balance += salary;
        System.out.println("Account balance: " + balance + currency);
    }

    public void withdraw(int sum) {
        int commission = 0;
        if (sum < 1000) {
            commission = (sum * 5 / 100);
        } else if (sum >= 1000) {
            commission = (sum * 10 / 100);
        }
        System.out.println(balance + " " + sum + " " + commission);
        if (sum + commission <= balance) {
            balance -= (sum + commission);
            System.out.println("The balance of the account after withdrawal: " + balance + currency);
        } else {
            System.out.println("Insufficient funds in the account");
        }
    }

    public void companyNameLenght() {
        int companyNameLenght = getCompanyName().length();
        System.out.println("Name of the company is made up of " + companyNameLenght + " characters");
    }

    public void monthIncreaser(int addMonth) {
        addMonth += monthsOfEmployment;
        System.out.println("Months of increase of " + addMonth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
