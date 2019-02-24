package org.pomelo.designpatterns.abstractFactory.Enum;

public enum Direction {

	WEST("west", "1"), EAST("east", "2"), NORTH("north", "3"), SOUTH("south", "4");
	
	Direction(String code, String value){
		this.code = code;
		this.value= value;
	}
	
	String getCode(Enum<?> Direction){
		return this.code;
	}
	
	String getValue(Enum<?> Direction) {
		return this.value;
	}
	
	private String code;
	
	private String value;

}
