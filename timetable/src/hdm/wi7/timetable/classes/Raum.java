package hdm.wi7.timetable.classes;

public class Raum extends TimetableObject {

	private static final long serialVersionUID = 1L;

	private short raumNummer = 0;
	private int raumKapazit�t = 0;
	//Alex arbeitet hier, und testet diese funktion von git

	public short getRaumNummer() {
		raumNummer = 
		return raumNummer;
	}
	
	public short setRaumNummer(){
		return raumNummer;
	} 

	public int getRaumKapazit�t(){
		return raumKapazit�t;
	}
	
	public int setRaumKapazit�t(){
		return raumKapazit�t;
	}
	
	public String toString(){
		return raumNummer + " " + raumKapazit�t;
	}
}
