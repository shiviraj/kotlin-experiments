package com.step.bankAccount

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SavingAccountTest : FunSpec({

  test("canWithDraw") {
    val savingAccount = SavingAccount(1000)
    savingAccount.canWithDraw(100) shouldBe true
  }

  test("Should deposit money in account") {
    val savingAccount = SavingAccount(100)
    savingAccount.deposit(100) shouldBe true
  }

  test("Should withdraw from money in account") {
    val savingAccount = SavingAccount(1000)
    savingAccount.withdraw(100) shouldBe 100
  }

  test("Should not withdraw from money in account") {
    val savingAccount = SavingAccount(100)
    savingAccount.withdraw(100) shouldBe 0
  }

})