PImage rainbow;
PImage unicorn;


void setup() {
  rainbow = loadImage("ThisRainbow.png");
  unicorn = loadImage("RedUnicorn2.png");



  size(1600, 808);

  rainbow.resize(1600, 808);
  unicorn.resize(300,300);
}
void draw() {
  background(rainbow);
image(unicorn, mouseX, mouseY);
}