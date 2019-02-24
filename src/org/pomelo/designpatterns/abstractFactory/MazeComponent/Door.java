package org.pomelo.designpatterns.abstractFactory.MazeComponent;

public abstract class Door extends BaseComponent{

	private Room r1;
	private Room r2;
	private boolean isOpen;
	
	public Room getR1() {
		return r1;
	}

	public void setR1(Room r1) {
		this.r1 = r1;
	}

	public Room getR2() {
		return r2;
	}

	public void setR2(Room r2) {
		this.r2 = r2;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public abstract Room fromOtherSide(Room r1);
	
	

}
