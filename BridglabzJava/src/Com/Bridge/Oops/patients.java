package Com.Bridge.Oops;

public class patients {
	
	private int p_id;
	private String p_name;
	private String p_mob_no;

	patients()
	{
		
	}
	patients(int p_id, String p_name, String p_mob_no)
	{
		this.p_id=p_id;
		this.p_name=p_name;
		this.p_mob_no=p_mob_no;
	}
	public int getId() {
		return p_id;
	}
	public void setId(int id) {
		this.p_id = id;
	}
	public String getName() {
		return p_name;
	}
	public void setName(String name) {
		this.p_name = name;
	}
	public String getMob_no() {
		return p_mob_no;
	}
	public void setMob_no(String mob_no) {
		this.p_mob_no = mob_no;
	}
	
	

}
