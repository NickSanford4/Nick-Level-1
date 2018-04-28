int StartTime;
int frogX = 225;
int frogY = 575;
boolean check = false;
Car car1 = new Car(-50, 100, 50, -11);
Car car2 = new Car(-50, 200, 50, 9);
Car car3 = new Car(-50, 300, 50, 10);
Car car4 = new Car(-50, 400, 50, -8);
Car car5 = new Car(-50, 500, 50, 9);
void draw(){
  if(check==false){
  background(500, 90,30);
fill(0, 0, 250);
ellipse(frogX, frogY, 40, 40);
car1.display();
car1.move();
car2.display();
car2.move();
car3.display();
car3.move();
car4.display();
car4.move();
car5.display();
car5.move();
if(intersects(car1)){
frogX=225;
frogY=575;
}
if(intersects(car2)){
frogX=225;
frogY=575;
}
if(intersects(car3)){
frogX=225;
frogY=575;
}
if(intersects(car4)){
frogX=225;
frogY=575;
}
if(intersects(car5)){
frogX=225;
frogY=575;
}
  }
if(frogY<50 && check==false){
  int EndTime=millis();
  text("You Win",100,100);
  int Duration=EndTime-StartTime;
  text("time="+Duration,200,100);
  check=true;
}
}
void setup(){
   size(400, 600);
   StartTime=millis();
}
   void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP&&frogY>25)
            {
                  frogY=frogY-50;
            }
            else if(keyCode == DOWN&&frogY<575)
            {
                  frogY+=50;
            }
            else if(keyCode == RIGHT&&frogX<375)
            {
                  frogX+=50;
            }
            else if(keyCode == LEFT&&frogX>25)
            {
                  frogX-=50;
            }
      }
}
public class Car{
  int x = 0;
  int y = 0;
  int size = 0;
  int speed = 0;
Car(int x, int y, int size, int speed){
  this.x=x;
  this.y=y;
  this.size=size;
  this.speed=speed;
  
}

int getX(){
  return x;
}
int getY(){
  return y;
}
int getSize(){
  return size;
}

void display() 
{
      fill(0,255,0);
      rect(x , y, size, 50);
}
void move(){
  x=x+speed;
  if (x > 400){
    x=0;
  }
    if (x < 0){
    x=400;
  }
}
}
boolean intersects(Car car) {
      if ((frogY > car.getY() && frogY < car.getY()+50) && (frogX > car.getX()-25 && frogX < car.getX() + 25 + car.getSize()))
      {
     
             return true;
      }
      else 
      {
             return false;
      }
}
