package hdm.wi7.timetable.classes;

public class Dozent extends TimetableObject {

	private static final long serialVersionUID = 1L;
	
	private String dozentVorname = null;
	private String dozentNachname = null;
	
	
	public String getDozentVorname(){
		return this.dozentVorname; 
	}
	
	public String setDozentVorname(){
		return dozentVorname;
	}
	
	public String getDozentNachname(){
		return this.dozentNachname;
	}
	
	public String setDozentNachname(){
		return this.dozentNachname; 
	}
	
	public String toString(){
		return this.dozentVorname + " " + this.dozentNachname;
	}
}
