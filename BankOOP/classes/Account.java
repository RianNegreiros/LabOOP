package classes;

import interfaces.IAccount;

public abstract class Account implements IAccount {
  protected int agency;
  protected int number;
  protected int balance;

  public int getAgency() {
    return this.agency;
  }

  public int getNumber() {
    return this.number;
  }

  public int getBalance() {
    return this.balance;
  }

  @Override
  public void withdraw(double value) {

  }

  @Override
  public void deposit(double value) {
  }

  @Override
  public void transfer(double valor, Account destinationAccount) {
  }
}
