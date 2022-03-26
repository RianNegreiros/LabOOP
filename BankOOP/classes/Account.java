package classes;

import interfaces.IAccount;

public abstract class Account implements IAccount {
  protected int agency;
  protected int number;
  protected int saldo;

  public int getAgency() {
    return this.agency;
  }

  public int getNumber() {
    return this.number;
  }

  public int getSaldo() {
    return this.saldo;
  }

  @Override
  public void sacar(double value) {
  }

  @Override
  public void depositar(double value) {
  }

  @Override
  public void transfer(double valor, Account destinationAccount) {
  }
}
