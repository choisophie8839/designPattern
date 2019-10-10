package AdapterPattern05.case1;

// object adapter implementation
// B --> A
public class BToAAdapter implements APlayer {

  private BPlayer media;

  public BToAAdapter(BPlayer media) {
    this.media = media;
  }

  //You can call B method using A method.
  @Override
  public void play(String filename) {
    System.out.println("Using Adapter : ");
    media.playFile(filename);
  }

  @Override
  public void stop() {

  }
}
