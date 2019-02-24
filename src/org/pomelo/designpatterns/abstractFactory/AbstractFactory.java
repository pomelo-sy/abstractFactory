package org.pomelo.designpatterns.abstractFactory;

import org.pomelo.designpatterns.abstractFactory.MazeComponent.Door;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Maze;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Room;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Wall;

public abstract class AbstractFactory {

	abstract Maze makeMaze();
	
	abstract Room makeRoom(int roomId); 
	
	abstract Wall makeWall();
	
	abstract Door makeDoor(Room r1, Room r2);
	
}
