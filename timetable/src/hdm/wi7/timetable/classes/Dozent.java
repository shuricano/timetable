package hdm.wi7.timetable.classes;

public class Dozent extends TimetableObject {

	private static final long serialVersionUID = 1L;
	
	private String dozentVorname = null;
	private String dozentNachname = null;
	
	
	public String getDozentVorname(){
		return this.dozentVorname; 
	}
	
	public void setDozentVorname(String vorname){
		dozentVorname = vorname;
	}
	
	public String getDozentNachname(){
		return dozentNachname;
	}
	
	public void setDozentNachname(String nachname){
		dozentNachname = nachname; 
	}
	
	public String toString(){
		return dozentVorname + " " + dozentNachname;
	}
}
