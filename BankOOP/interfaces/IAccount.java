package interfaces;

import classes.Account;

public interface IAccount {
  void withdraw(double value);

  void deposit(double value);

  void transfer(double valor, Account destinationAccount);
}
