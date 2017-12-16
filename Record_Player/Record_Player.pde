import ddf.minim.*;     //at the very top of your sketch
Minim minim;        //as a member variable
PImage Record;        //as member variable
 AudioPlayer song;      //as a member variable
void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
}

int degrees=0;
public void setup(){
  Record= loadImage("Record.jpeg");   //in setup method  
   size(225, 225);
  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("Little Lamb.mp3", 512);//in the setup method
}
public void draw(){
  if(mousePressed){
    song.play();
rotateImage(Record,degrees);
  }
else{
  song.pause();
}
image(Record, 0, 0);//in draw method
degrees+=1999999999;

  }