package com.company.Accounting;

public class VipCustomer {

  private String name;
  private Double creditLimit;
  private String emailAddress;

  public VipCustomer() {
    this("default name", 50000.0, "default@gmail.com");
  }

  public VipCustomer(String name, Double creditLimit) {
    this(name, creditLimit, "unknown@gmai.com");
  }

  public VipCustomer(String name, Double creditLimit, String emailAddress) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAddress = emailAddress;
  }

  public String getName() {
    return name;
  }

  public Double getCreditLimit() {
    return creditLimit;
  }

  public String getEmailAddress() {
    return emailAddress;
  }
}
