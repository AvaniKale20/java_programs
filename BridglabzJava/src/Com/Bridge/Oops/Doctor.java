package Com.Bridge.Oops;

public class Doctor {
	private int id;
	private String name;
	private int No_of_patients;
	private String avalability;
	
	Doctor()
	{
		
	}
	Doctor(int id, String name, String avalability, int No_of_patients )
	{
		this.name=name;
		this.id=id;
		this.No_of_patients=No_of_patients;
		this.avalability=avalability;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo_of_patients() {
		return No_of_patients;
	}
	public void setNo_of_patients(int no_of_patients) {
		No_of_patients = no_of_patients;
	}
	public String getAvalability() {
		return avalability;
	}
	public void setAvalability(String avalability) {
		this.avalability = avalability;
	}
	
	

}
