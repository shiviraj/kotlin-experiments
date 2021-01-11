package com.step.bankAccount

class CurrentAccount(balance: Int) : BankAccount(balance) {
  override fun canWithDraw(amount: Int): Boolean {
    return getBalance() > amount
  }
}