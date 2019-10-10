package StrategyPattern09.case2.step1;

public class TestPattern {

  public static void main(String[] args) {
    DatabaseUse myDB = new DatabaseUse();
    myDB.connect(DBTYPE.MySQL);
    myDB.select();

    myDB.connect(DBTYPE.Informix);
    myDB.select();

    myDB.connect(DBTYPE.Oracle);
    myDB.select();
  }
}
