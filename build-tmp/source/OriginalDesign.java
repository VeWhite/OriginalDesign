import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{size(400, 400);
background(146, 64, 200);
}
public void draw()
{
  fill(139, 69, 19);
  rect(185, 185, 30, 250);
  fill(0, 206, 209);
  ellipse(200,200,80,80);
  fill(139, 69, 19);
  triangle(185, 250, 185, 170, 160, 224);
  triangle(215, 250, 215, 170, 240, 224);
  fill(0, 206, 209);
  ellipse(100, 200, 50, 50);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
