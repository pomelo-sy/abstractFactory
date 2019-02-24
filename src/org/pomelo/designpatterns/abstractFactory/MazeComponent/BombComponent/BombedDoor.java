package org.pomelo.designpatterns.abstractFactory.MazeComponent.BombComponent;

import org.pomelo.designpatterns.abstractFactory.MazeComponent.Door;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Room;

public class BombedDoor extends Door{

	@Override
	public Room fromOtherSide(Room temp1) {
		
		if(temp1 != null) {
			if (temp1.equals(getR1())) {
				return getR2();
			} else if(temp1.equals(getR2())) {
				return getR1();
			}
		}
		
		return null;
	}

	@Override
	public void enter() {
		System.out.println("entering bombedDoor");
		// TODO Auto-generated method stub
		
	}

}
