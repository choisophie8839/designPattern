package ObserverPattern04.case1;

import java.util.Observable;

public class PlayController extends Observable {
  // Excute or Not
  private boolean bPlay;

  public PlayController() {}

  // Change flag after you receive data
  // let them know that new data come in.
  public void setFlag(boolean bPlay) {
    this.bPlay = bPlay;
    setChanged();
    notifyObservers();
  }

  //return flag
  public boolean getFlag() {
    return bPlay;
  }
}
