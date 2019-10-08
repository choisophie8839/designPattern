package AdapterPattern05.case1;

public class AplayerImpl implements APlayer {

  @Override
  public void play(String filename) {
    System.out.println("(A) " + filename);
  }

  @Override
  public void stop() {

  }
}
