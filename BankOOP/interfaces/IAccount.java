package interfaces;

import classes.Account;

public interface IAccount {
  void sacar(double value);

  void depositar(double value);

  void transferir(double valor, Account destinationAccount);
}
