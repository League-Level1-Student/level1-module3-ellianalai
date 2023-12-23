package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int frog_x = 300;
    int frog_y = 370;
    Car car, car2, car3, car4, car5;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	car = new Car(100, 50, 50, 10) ;
    	car2 = new Car(100, 100, 50, 5);
    	car3 = new Car(100, 150, 50, 15);
    	car4 = new Car(100, 200, 50, 3);
    	car5 = new Car(100, 250, 50, 9);
    }

    @Override
    public void draw() {
    	background(166,241,247);
    	fill(141,245,137);
    	ellipse(frog_x,frog_y,30,30);
    	
  if (intersects(car)) {
    		frog_x = 300;
    		frog_y = 370;
    	}
    	
    	if (intersects(car2)) {
    		frog_x = 300;
    		frog_y = 370;
    	}
    	if (intersects(car3)) {
    		frog_x = 300;
    		frog_y = 370;
    	}
    	if (intersects(car4)) {
    		frog_x = 300;
    		frog_y = 370;
    	}
    	if (intersects(car5)) {
    		frog_x = 300;
    		frog_y = 370;
    	}
    	car.move_left();
    	car.display();
    	
    	
    	car2.move_right();
    	car2.display();

    	
    	
    	car3.move_right();
    	car3.display();
    	
    	
    	
    	car4.move_left();
    	car4.display();
    	
    	
    	
    	car5.move_right();
    	car5.display();
    	
    	

    }
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
            	frog_y -=20;
                //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
            	frog_y+=20;
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
            	frog_x+=20;
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
            	frog_x-=20;
                //Frog X position goes left
            }
        }
    }
    
    boolean intersects(Car car) {
		 if ((frog_y > car.getY() && frog_y < car.getY()+50) &&
		                (frog_x > car.getX() && frog_x < car.getX()+car.getSize())) {
		   return true;
		  }
		 else  {
		  return false;
		 }
}
    
    public void area() {
    	if(frog_x > 600){
    		frog_x=600;
    	}
    	if(frog_x<0) {
    		frog_x=0;
    	}
    	if(frog_y>400) {
    		frog_y=400;
    	}
    	if(frog_y<0) {
    		frog_y=0;
    	}
    }
    
    
    class Car {
    	int x, y, size, speed;
    	Car(int x, int y, int size, int speed ){
    		this.x=x;
    		this.y=y;
    		this.size=size;
    		this.speed=speed;
    	}
    	
  
    	void display()
    	  {
    	    fill(250,241,157);
    	    rect(x , y,  size, 50);
    	  }
    	
    	void move_left() {
    	    x-=speed;
    	    if(x<-size) {
    	    	x=WIDTH;
    	    }
    	   
    	   }
    	void move_right() {
    	    x+=speed;
    	    if(x>WIDTH) {
    	    	x=-size;
    	    }
   
    	   }
    	
    	int getX() {
    		return x;
    	}
    	
    	int getY() {
    		return y;
    	}
    	
    	int getSize() {
    		return size;
    	}
    	
    	
    
    }

     public static void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }

}
