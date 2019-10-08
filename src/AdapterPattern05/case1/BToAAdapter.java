package AdapterPattern05.case1;

// object adapter implementation
// B --> A
public class BToAAdapter implements APlayer {
  private Bplayer media;

  public BToAAdapter(Bplayer media) {
    this.media = media;
  }

  @Override
  public void play(String filename) {
    // call B method using A method
    System.out.println("Using Adapter : " );
    media.playFile(filename);
  }

  @Override
  public void stop() {

  }
}
