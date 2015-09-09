int leftX = 0;
int rightX = 0;
int y = 0;

void setup()
{size(400, 400);
background(47, 79, 79);

}
void draw()
{
  fill(139, 69, 19);
  rect(185, 185, 30, 250);
  fill(0, 206, 209);
  ellipse(200,200,80,80);
  fill(139, 69, 19);
  triangle(185, 250, 185, 170, 160, 224);
  triangle(215, 250, 215, 170, 240, 224);
  fill(0, 206, 209);
  
}

void mousePressed()
{
  redraw();
  background(47, 79, 79);
  ellipse(leftX + 100, 200, 50, 50);
  ellipse(rightX + 300, 200, 50, 50);
  ellipse(200, y + 100, 50, 50);
  leftX = leftX - 10;
  rightX = rightX + 10;
  y = y - 10;
}
