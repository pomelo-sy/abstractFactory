package org.pomelo.designpatterns.abstractFactory.factory;

import org.pomelo.designpatterns.abstractFactory.AbstractFactory;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Door;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Maze;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Room;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Wall;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.BombComponent.BombedWall;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.BombComponent.RoomWithABomb;

public class BombFactory extends AbstractFactory{

	@Override
	public Maze makeMaze() {
		
		return new Maze();
	}

	@Override
	public Room makeRoom(int roomId) {
		// TODO Auto-generated method stub
		return new RoomWithABomb(roomId);
	}

	@Override
	public Wall makeWall() {
		// TODO Auto-generated method stub
		return new BombedWall();
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
