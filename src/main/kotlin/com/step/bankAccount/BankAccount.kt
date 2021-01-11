package com.step.bankAccount

abstract class BankAccount(private var balance: Int) : Withdrawable, Depositable {
  override fun deposit(money: Int): Boolean {
    balance += money
    return true
  }

  override fun withdraw(money: Int): Int {
    if (canWithDraw(money)) {
      balance -= money
      return money
    }
    return 0
  }

  abstract fun canWithDraw(amount: Int): Boolean

  protected fun getBalance(): Int {
    return balance
  }

}
