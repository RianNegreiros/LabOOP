package classes;

import interfaces.IAccount;

public class Account implements IAccount {
  private int agency;
  private int number;
  private int saldo;

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
  public void transferir(double valor, Account destinationAccount) {
  }
}
