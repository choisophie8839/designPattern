package StrategyPattern09.case2.step2;

public class MySQL extends Database {

  public MySQL() {
    name = "MySQL";
    rows = 20;
  }
  @Override
  public void connectDatabase() {
    System.out.println("connect to " + name);
  }
}
