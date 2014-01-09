package hdm.wi7.timetable.classes;

public class Zeitslot extends TimetableObject {

	private static final long serialVersionUID = 1L;
	
	
	private int startzeit;
	private int endzeit;
	private String wochentag;
	
	public int getStartzeit(){
		return startzeit;
	}
	
	public int setStartzeit(){
		return startzeit;
	}
	
	public int getEndzeit(){
		return endzeit;
	}
	
	public int setEndzeit(){
		return endzeit;
	}
	
	public String getWochentag(){
		return wochentag;
	}
	
	public String setWochentag(){
		return wochentag;
	}
}
