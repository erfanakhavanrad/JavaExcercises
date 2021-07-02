package com.company.Accounting;

public class Accounts {

  private Integer accountNumber;
  private Double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  public Double depositFunds(Double newFunds) {
    this.balance += newFunds;
//    balance = balance + newFunds;
    System.out.println(
        "Amount of " + newFunds + "$ successfully deposited. Balance is currently " + balance
            + "$");
    return balance;
  }

  public Double withdrawFunds(Double withdrawalAmount) {
    if (!(withdrawalAmount > balance)) {
      balance -= withdrawalAmount;
      System.out.println(
          "Withdrawal of " + withdrawalAmount + "$ processed. Remaining balance is " + balance);
    } else {
      System.out.println("Inefficient funds, Only " + balance + "$ available.");
    }
    return balance;
  }

  public Integer getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(Integer accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
