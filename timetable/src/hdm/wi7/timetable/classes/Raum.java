package hdm.wi7.timetable.classes;

public class Raum extends TimetableObject {

	private static final long serialVersionUID = 1L;

	private short raumNummer = 0;
	private int raumKapazität = 0;
	//Alex arbeitet hier, und testet diese funktion von git

	public short getRaumNummer() {
		int raumNummer = 0;
		return raumNummer;
	}
	
	public void setRaumNummer(int raumnr){
		raumNummer = raumnr;
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
