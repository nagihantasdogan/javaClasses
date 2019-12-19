package com.class28;

public class Room {
	int roomNumber;
	
	
	Room(int roomNumber){
		//super();
		this.roomNumber=roomNumber;
		
	}

	
	public static void main(String[] args) {
		
		Room room=new Room(101);
		room.getClass();
		//System.out.println(room.floor);
		
	}
	
	
}
