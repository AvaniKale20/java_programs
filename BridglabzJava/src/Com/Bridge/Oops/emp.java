package Com.Bridge.Oops;

//package JsonProgram;

import java.io.Serializable;

public class emp implements Serializable {
	private int id;
	private String name;
	private double sal;

	public void setId(int i) {
		// TODO Auto-generated method stub
		id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String n) {
		// TODO Auto-generated method stub
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setSal(int s) {
		// TODO Auto-generated method stub
		sal=s;
	}
	public double getSal()
	{
		return sal;
	}
	

}
