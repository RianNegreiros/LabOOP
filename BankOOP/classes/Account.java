package classes;

import interfaces.IAccount;

public abstract class Account implements IAccount {
  protected int agency;
  protected int number;
  protected double balance;

  public int getAgency() {
    return this.agency;
  }

  public int getNumber() {
    return this.number;
  }

  public double getBalance() {
    return this.balance;
  }

  @Override
  public void withdraw(double value) {
    balance -= value;
  }

  @Override
  public void deposit(double value) {
    balance += value;
  }

  @Override
  public void transfer(double value, Account destinationAccount) {
    this.withdraw(value);
    destinationAccount.deposit(value);
  }
}
