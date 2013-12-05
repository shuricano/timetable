package hdm.wi7.timetable.classes;

public class Semesterverband extends TimetableObject {

	private static final long serialVersionUID = 1L;
	
	private int semester;
	private String studiengang;
	private int anzahlStudierender;
	
	public int getSemester(){
		return semester;
	}
	
	public int setSemester(){
		return semester;
	}
	
	public String getStudiengang(){
		return studiengang;
	}
	
	public String setStudiengang(){
		return studiengang;
	}
	
	public int getAnzahlStudierender(){
		return anzahlStudierender;
	}
	
	public int setAnzahlStudierender(){
		return anzahlStudierender;
	}
	
	public String toString(){
		return this.semester + " " + this.studiengang + " " + this. anzahlStudierender;
	}
}
