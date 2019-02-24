package org.pomelo.designpatterns.abstractFactory.MazeComponent.BombComponent;

import org.pomelo.designpatterns.abstractFactory.MazeComponent.Wall;

public class BombedWall extends Wall{

	
	public BombedWall() {
		
	}

	@Override
	public void enter() {
		System.out.println("entering bombedWall");
		
	}
	
	
}
