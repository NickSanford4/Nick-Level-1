int x = 225;
int y = 575;
Car car1 = new Car(-50, 100, 50, -6);
Car car2 = new Car(-50, 200, 50, 3);
Car car3 = new Car(-50, 300, 50, 4);
Car car4 = new Car(-50, 400, 50, -5);
Car car5 = new Car(-50, 500, 50, 6);
void draw(){
  background(500, 90,30);
fill(0, 0, 250);
ellipse(x, y, 50, 50);
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
}
void setup(){
   size(400, 600);
}
   void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP&&y>25)
            {
                  y=y-50;
            }
            else if(keyCode == DOWN&&y<575)
            {
                  y=y+50;
            }
            else if(keyCode == RIGHT&&x<375)
            {
                  x=x+50;
            }
            else if(keyCode == LEFT&&x>25)
            {
                  x=x-50;
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