package org.pomelo.designpatterns.abstractFactory.MazeComponent;

import org.pomelo.designpatterns.abstractFactory.Enum.Direction;

public abstract class Room extends BaseComponent{


	//null == null : true
	public static void main(String[] args) {
		System.out.println(null == null);
	}
	
	
	@Override
	public String toString() {
		
		return "room: numberId:"+ getRoomId();
	}

	public abstract void setSide(Direction d, BaseComponent com);
	
	public abstract void getSide(Direction d);
	
	public BaseComponent[] getSides() {
		return sides;
	}

	public void setSides(BaseComponent[] sides) {
		this.sides = sides;
	}


	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}


	private Integer roomId;
	
	private BaseComponent[] sides = new BaseComponent[4];
	
}
