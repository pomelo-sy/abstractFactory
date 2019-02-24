package org.pomelo.designpatterns.abstractFactory.MazeComponent;

import java.util.ArrayList;
import java.util.List;

public class Maze {

	
	private List<Room> rooms = new ArrayList<Room>();
	public void addRoom(Room r) {
		
		rooms.add(r);
	}
	
	private int count;
	
	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	Room getRoom(int id) {
		for(Room temp : rooms) {
			if(temp.getRoomId().equals(id)) {
				return temp;
			}
		}
		return null;
	}
}
