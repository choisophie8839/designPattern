package StrategyPattern09.case2.step2;

public class DatabaseUse {
  private Database db;

  public void setDatabase(Database db) {
    this.db = db;
  }

  public void connect() {
    if (db == null) {
      System.out.println("select db first");
    } else {
      db.connectDatabase();
    }
  }

  public void select() {
    db.selectData();
  }
}
