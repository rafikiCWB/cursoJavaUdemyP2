package org.poo.udemy;

import static java.lang.System.out;

public class SavingsAccount extends Account {

    private Double loanBalance;

    public SavingsAccount(Integer number, String holder, Double balance, Double loanBalance) {
        super(number, holder, balance);
        this.loanBalance = loanBalance;
    }

    public Double getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(Double loanBalance) {
        this.loanBalance = loanBalance;
    }

    @Override
    public void withdraw(Double amount) {
        var result = balance -= amount + loanBalance;
        out.println(result);
    }
}
