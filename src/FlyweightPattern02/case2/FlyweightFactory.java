package FlyweightPattern02.case2;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
  private static Map <String, Subject> map = new HashMap<String, Subject>();
  public Subject getSubject(String key) {
    Subject subject = map.get(key);
    if (subject == null) {
      subject = new Subject(key);
      map.put(key, subject);
      System.out.println("New Object " + key);
    } else {
      System.out.println("Re-use " + key);
    }
    return subject;
  }
}
