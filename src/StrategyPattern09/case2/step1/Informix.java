package StrategyPattern09.case2.step1;

public class Informix extends Database {
  public Informix() {
    name = "Informix";
    rows = 40;
  }
  @Override
  public void connectDatabase() {
    System.out.println("connect to " + name);
  }
}
