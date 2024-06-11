package ScreenClasses.Screens;

import ScreenClasses.Screen;
import ScreenClasses.ScreenManager;
import Utils.MH;
import processing.core.PApplet;

public class MainMenu extends Screen {

  private PApplet p;

  public MainMenu() {
    p = ScreenManager.p;
  }

  public void update() {
    if (MH.leftClicked) {
      ScreenManager.setScreen(new Game());
    }
  }

  public void render() {
    p.background(42);
  }
}
