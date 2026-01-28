import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {

  // Variables (instance & static)
private String[] memories = {
  "Family",
  "Friends",
  "Travel",
  "Growth",
  "Learning"
};
public LastYear() {
  // default constructor
}
  // Constuctor
 public LastYear(String[] memories) {
  this.memories = memories;
}

  /**
   * Top level drawScene method
   */
  public void drawScene() {
    //Makes title screen by setting fuant color and size and font, then places them
    pause(1);
    setTextHeight(60);
    setTextStyle(Font.SANS, FontStyle.BOLD_ITALIC);
    setTextColor("Purple");
    drawText("My", 80, 150);
    drawText("2025", 185, 170);
    pause(1);
    setTextHeight(30);
    drawText("By Donovan J", 0, 385);
    
    pause(2);

    //clearsbackground makes it a new color, then inserts all of the images for my 2025
    clear("pink");
    drawImage("IMG_2265.jpeg", 0, 0, 150);
    setTextHeight(15);
    setTextColor("White");
    drawText("In memory of", 35, 70);
    pause(1);
    drawImage("IMG_6130.jpeg", 150, 0, 150);
    pause(1);
    drawImage("IMG_5612.jpeg", 400, -30, 150, 90);
    pause(1);
    drawImage("IMG_6122.jpeg", 0, 80, 150);
    pause(1);
    drawImage("IMG_3675.jpg", 150, 110, 150);
    pause(1);
    drawImage("IMG_2749.jpeg", 412, 120, 150, 90);
    pause(1);
    drawImage("IMG_1518-(1).jpg", 0, 190, 150);
    pause(1);
    drawImage("7B1D004B-0144-4267-8A27-71C82C89CE4E.JPG", 150, 220, 150);
    pause(1);
    drawImage("IMG_1562.jpeg", 412, 270, 150, 90);
    pause(1);
    drawImage("DSC00846.JPG", 0, 300, 150);
    pause(1);
    drawImage("IMG_3803.jpeg", 300, 425, 150, 180);
    pause(3);
  }

}