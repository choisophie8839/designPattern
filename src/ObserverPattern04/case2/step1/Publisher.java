package ObserverPattern04.case2.step1;

public interface Publisher {
  public void addObserver(Observer o);
  public void deleteObserver(Observer o);
  public void notifyObservers();
}
