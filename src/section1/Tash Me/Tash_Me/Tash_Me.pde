PImage mustache;
PImage friend;
void setup() { 
  size(500,500);
friend = loadImage("smiling-face-with-sunglasses.png");

friend.resize(width,height);
background(friend); 
mustache = loadImage("stash .png");
mustache.resize(250,250);
friend = loadImage("smiling-face-with-sunglasses.png");


}

void draw() {

image(mustache, 100, 150);
}
