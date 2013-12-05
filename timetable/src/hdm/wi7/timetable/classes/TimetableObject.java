package hdm.wi7.timetable.classes;

import java.io.Serializable;

public class TimetableObject implements Serializable {
	
	//Version des Serializable Interfaces	
	private static final long serialVersionUID = 1L;
	
	//Id wird an jedes Stundenplan Objekt weitergegeben	
	private int id = 0;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int hashcode() {
		return this.id;
	}
	
	
	//@author thies
	public boolean equals(Object o) {
	if (o != null && o instanceof TimetableObject){
		try ()
	}
	
	}
	
	
}


