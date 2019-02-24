package org.pomelo.designpatterns.abstractFactory;

import org.pomelo.designpatterns.abstractFactory.Enum.Direction;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Door;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Maze;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Room;
import org.pomelo.designpatterns.abstractFactory.factory.BombFactory;

public class MazeBuild {

	
	Maze makeMaze(AbstractFactory factory) {
		
		Maze amaze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		amaze.addRoom(r1);
		amaze.addRoom(r2);
		Door aDoor = factory.makeDoor(r1, r2);
		
		
		r1.setSide(Direction.NORTH, aDoor);
		r1.setSide(Direction.SOUTH, factory.makeWall());
		r1.setSide(Direction.WEST, factory.makeWall());
		r1.setSide(Direction.EAST, factory.makeWall());
		r2.setSide(Direction.SOUTH, aDoor);
		r2.setSide(Direction.NORTH, factory.makeWall());
		r2.setSide(Direction.WEST, factory.makeWall());
		r2.setSide(Direction.EAST, factory.makeWall());
		return amaze;
		
		
	}
	
	public static void main(String[] args) {
		
		MazeBuild mb = new MazeBuild();
		mb.makeMaze(new BombFactory());
	}
}
