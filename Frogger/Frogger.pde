int x = 50;
int y = 350;
void draw(){
  background(500, 90,30);
fill(0, 0, 250);
ellipse(x, y, 50, 50);
}
void setup(){
   size(400, 400);
}
   void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP&&y>25)
            {
                  y=y-5;
            }
            else if(keyCode == DOWN&&y<375)
            {
                  y=y+5;
            }
            else if(keyCode == RIGHT&&x<375)
            {
                  x=x+5;
            }
            else if(keyCode == LEFT&&x>25)
            {
                  x=x-5;
            }
      }
   
}