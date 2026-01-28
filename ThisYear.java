import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene {

  // Variables (instance & static)
  private String[] goals;
  private int[] xPositions = {0, 212, 212, 0, 100, 250, 100, 400, 100};
  private int[] yPositions = {0, 0, 0, 175, 150, 150, 262, 260, 300};
  private int[] sizes = {100, 150, 200, 100, 150, 150, 150, 200, 150};
  private int[] rotations = {0, 90, 0, 0, 0, 0, 0, 90, 90};


  // Constuctor
  public ThisYear() {
    goals = FileReader.toStringArray("data1.txt");
  }

public ThisYear(String[] goals) {
  this.goals = goals;
}


  
  /**
   * Top level drawScene method
   */
  public void drawScene() {
    
    clear("white");
    pause(1);
//sets texts for titles screen
    setTextHeight(60);
    setTextStyle(Font.SANS, FontStyle.BOLD_ITALIC);
    setTextColor("Purple");
    drawText("My", 80, 150);
    drawText("2026", 185, 170);
    drawText("So Far!", 95, 235);
   
    pause(2);

    clear("blue");
//uses for method to pull of the images from the data1.txt class
    for (int i = 0; i < goals.length; i++) {
      drawImage(goals[i], xPositions[i], yPositions[i], sizes[i], rotations[i]);
    pause(1);
    }
    
  }

  // other methods

}