package exAula146.model.entities;

import exAula146.model.exceptions.DomainException;

public class Account {

    //Variáveis
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    //Construtores, padrão e com argumentos
    public Account(){

    }
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    //Getter e setter
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    //Método para depositar
    public void deposit(double amount){
        balance += amount;
    }
    //Método para validar o saque
    public void validateWithdraw(double amount) throws DomainException{
        if (amount > getWithdrawLimit()) {
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit ");
        }
        if (amount > getBalance()){
            throw new DomainException("Withdraw error: Not enough balance ");
        }
    }
    //Método para sacar
    public void withdraw(double amount) throws DomainException {
        validateWithdraw(amount);
        balance -= amount;
    }
}
