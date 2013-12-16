package hdm.wi7.timetable.classes;

public class Raum extends TimetableObject {

	private static final long serialVersionUID = 1L;

	private short raumNummer = 0;
	private int raumKapazität = 0;
	//Alex arbeitet hier, und testet diese funktion von git

	public short getRaumNummer() {
		raumNummer = 
		return raumNummer;
	}
	
	public short setRaumNummer(){
		return raumNummer;
	} 

	public int getRaumKapazität(){
		return raumKapazität;
	}
	
	public int setRaumKapazität(){
		return raumKapazität;
	}
	
	public String toString(){
		return raumNummer + " " + raumKapazität;
	}
}
