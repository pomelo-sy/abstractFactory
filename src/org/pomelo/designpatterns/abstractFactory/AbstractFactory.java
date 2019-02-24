package org.pomelo.designpatterns.abstractFactory;

import org.pomelo.designpatterns.abstractFactory.MazeComponent.Door;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Maze;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Room;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Wall;

public abstract class AbstractFactory {

	public abstract Maze makeMaze();
	
	public abstract Room makeRoom(int roomId); 
	
	public abstract Wall makeWall();
	
	public abstract Door makeDoor(Room r1, Room r2);
	
}
