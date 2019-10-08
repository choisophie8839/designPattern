package FlyweightPattern02.case2;

public class TestPattern {
  public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory();
    factory.getSubject("a");
    factory.getSubject("a");
    factory.getSubject("b");
    factory.getSubject("b");
  }
}
