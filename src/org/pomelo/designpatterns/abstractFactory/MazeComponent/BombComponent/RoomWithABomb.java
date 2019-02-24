package org.pomelo.designpatterns.abstractFactory.MazeComponent.BombComponent;

import org.pomelo.designpatterns.abstractFactory.Enum.Direction;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.BaseComponent;
import org.pomelo.designpatterns.abstractFactory.MazeComponent.Room;

public class RoomWithABomb extends Room{
	
	
	public RoomWithABomb(int roomId) {
		setRoomId(roomId);
	}

	@Override
	public boolean equals(Object obj) {

		
		if(obj == this) {
			return true;
		}else {
			if(obj == null) {
				return false;
			}else {
				if(obj instanceof RoomWithABomb) {
					RoomWithABomb temp = (RoomWithABomb) obj;
					if(temp.getRoomId().equals(getRoomId())) {
						return true;
					} 
				}
			}
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		
		int result = 17;
		result = 31 * result + (getRoomId() == null ? 0 : getRoomId().hashCode());
		return result;
	}

	@Override
	public void setSide(Direction d, BaseComponent com) {
		
	}

	@Override
	public void getSide(Direction d) {
		
	}

	@Override
	public void enter() {
		System.out.println("entering roomwith bomb");
	}


}
