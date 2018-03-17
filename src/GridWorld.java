import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
World world = new World();
world.show();
Bug bug1 = new Bug(Color.blue);
Location location = new Location(0, 0);
world.add(location,bug1);
Location loc2 = new Location(1,0);
bug1.moveTo(loc2);
//add(Location loc, Actor occupant);
}
}
