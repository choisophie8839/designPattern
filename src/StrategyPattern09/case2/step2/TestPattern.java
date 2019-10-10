package StrategyPattern09.case2.step2;

public class TestPattern {

  public static void main(String[] args) {
    DatabaseUse myDB = new DatabaseUse();
    myDB.connect();

    myDB.setDatabase(new MySQL());
    myDB.connect();
    myDB.select();

    myDB.setDatabase(new Informix());
    myDB.connect();
    myDB.select();

    myDB.setDatabase(new Oracle());
    myDB.connect();
    myDB.select();
  }
}
