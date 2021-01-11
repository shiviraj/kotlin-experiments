package com.step.bankAccount

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CurrentAccountTest : FunSpec({

  test("canWithDraw") {
    val currentAccount = CurrentAccount(1000)
    currentAccount.canWithDraw(100) shouldBe true
  }
})
