package _99_extra._04_gridworld;


import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
	World world = new World();
	
	Random rand = new Random();
	int row = rand.nextInt(9);
	int column = rand.nextInt(8);
	
	
	Bug bug = new Bug();
	
	
	Flower flower = new Flower();
	
	

	Location location = new Location(row, column);
	
	
	Location location2 = new Location(row, column+1);
	Location location3 = new Location(row, column-1);
	
	
	

	public void run() {
		world.show();
		for(int k = 0; k<10; k++) {
		for(int i=0; i<10; i++) {
			Location location = new Location(k, i);
			if(i%2==0) {
				flower.setColor(Color.red);
			}
			else {
				flower.setColor(Color.white);
			}
			
			world.add(location, flower);
		}
		
		}
		
		
		
		/*bug.setColor(Color.cyan);
		bug.turn();
		world.add(location, bug);
		world.add(location2, flower);
		world.add(location3, flower);
		*/
	}
	
	
	
	
	
	
}

	
