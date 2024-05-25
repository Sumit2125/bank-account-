package com.example.bankaccount

fun main(){
    val SumitBankAccount= BankAccount("Sumit Kumar",400.45)
SumitBankAccount.deposit(89.00)
    SumitBankAccount.withdraw(48.05)
    SumitBankAccount.displayTransactionHistory()
  println("${SumitBankAccount.accountHolder}'s" + "balance is $${SumitBankAccount.balance}")
}