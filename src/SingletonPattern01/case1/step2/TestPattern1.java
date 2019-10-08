package SingletonPattern01.case1.step2;

public class TestPattern1 {

    public static void main(String[] args) {
      Database database;
      database = Database.getInstance("1st database");
      System.out.println("This is the " + database.getName() + "!!! ");

      database = Database.getInstance("2nd database");
      System.out.println("This is the " + database.getName() + "!!! ");

      //Database constructor is private so that you cannot create the object
      //Database database1 = new Database("1");
    }
}
