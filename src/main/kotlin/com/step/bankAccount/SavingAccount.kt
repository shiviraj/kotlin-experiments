package com.step.bankAccount

class SavingAccount(balance: Int) : BankAccount(balance) {
  override fun canWithDraw(amount: Int): Boolean {
    return getBalance() > amount + 100
  }
}