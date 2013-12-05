package hdm.wi7.timetable.classes;

import java.io.Serializable;

public class TimetableObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id = 0;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
}


