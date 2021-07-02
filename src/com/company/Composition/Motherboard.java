package com.company.Composition;

public class Motherboard {

  private String model;
  private String manufacturer;
  private String ramSlots;
  private String cardSlots;
  private String bios;

  public Motherboard(String model, String manufacturer, String ramSlots, String cardSlots,
      String bios) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.ramSlots = ramSlots;
    this.cardSlots = cardSlots;
    this.bios = bios;
  }

  public void loadProgram(String programName) {
    System.out.println("program " + programName + " is now loading");
  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getRamSlots() {
    return ramSlots;
  }

  public String getCardSlots() {
    return cardSlots;
  }

  public String getBios() {
    return bios;
  }
}
