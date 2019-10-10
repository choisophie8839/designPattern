package StrategyPattern09.case2.step2;

public abstract class Database {
  public String name;
  public double rows;

  //According to the database, you need to use different libraries.
  public abstract void connectDatabase();

  //You use same SQL sequels.
  public void insertData() {
    System.out.println("insert data into " + name);
  }

  public void selectData() {
    System.out.println("select " + rows + " rows from " + name);
  }
}
