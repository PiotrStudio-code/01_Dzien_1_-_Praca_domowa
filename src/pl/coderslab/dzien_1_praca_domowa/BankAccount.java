package pl.coderslab.dzien_1_praca_domowa;

public class BankAccount {
    private int number ;
    private double cash = 0;

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    void depositCash(int amount)
    {
        if(amount > 0)
        {
            cash = cash + amount;
        }
    }

    double withdrawCash(double amount) {
        double value = 0;

        if (amount > 0) {
            if(cash > amount) {
                cash = cash - amount;
                value = amount;
            }
            else
            {
                value = cash;
                cash = 0;
            }
        }
        return value;
    }

    String printInfo(){
        return "Nr konta: " + number + " środki na koncie: " + cash;
    }
}
