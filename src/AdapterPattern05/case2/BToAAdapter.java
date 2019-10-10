package AdapterPattern05.case2;

// class adapter implementation
// B --> A
public class BToAAdapter extends BPlayerImpl implements APlayer {

  @Override
  public void play(String filename) {
    // call B using A
    System.out.println("Using Adapter : ");
    playFile(filename);
  }

  @Override
  public void stop() {

  }
}
