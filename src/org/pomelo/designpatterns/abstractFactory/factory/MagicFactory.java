package org.pomelo.designpatterns.abstractFactory.factory;

import org.pomelo.designpatterns.abstractFactory.AbstractFactory;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Door;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Maze;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Room;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Wall;

public class MagicFactory extends AbstractFactory{

	@Override
	public Maze makeMaze() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room makeRoom(int roomId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wall makeWall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		// TODO Auto-generated method stub
		return null;
	}

}
