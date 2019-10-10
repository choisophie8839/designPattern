package StrategyPattern09.case2.step1;

enum DBTYPE {
  MySQL, Informix, Oracle
}
public class DatabaseUse {
  private Database db;

  public void connect(DBTYPE dbtype) {
    switch (dbtype) {
      case MySQL:
        db = new MySQL();
        break;
      case Informix:
        db = new Informix();
        break;
      case Oracle:
        db = new Oracle();
        break;
    }

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
