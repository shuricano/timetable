package hdm.wi7.timetable.classes;

public class Lehrveranstaltung extends TimetableObject {

	private static final long serialVersionUID = 1L;
	
	private byte umfang;
	private String name;
	
	
	public byte getUmfang(){
		return umfang;
	}
	
	public byte setUmfang(){
		return umfang;
	}
	
	public String getName(){
		return name;
	}
	
	public String setName(){
		return name;
	}
}
