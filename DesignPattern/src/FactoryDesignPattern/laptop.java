package FactoryDesignPattern;

public class laptop extends Computer {
 private String Cpu;
 private String Hdd;
 private String Ram;
public laptop(String cpu, String hdd, String ram) {
	super();
	Cpu = cpu;
	Hdd = hdd;
	Ram = ram;
}
public laptop() {
	
	// TODO Auto-generated constructor stub
}
public String getCpu() {
	return Cpu;
}
public void setCpu(String cpu) {
	Cpu = cpu;
}
public String getHdd() {
	return Hdd;
}
public void setHdd(String hdd) {
	Hdd = hdd;
}
public String getRam() {
	return Ram;
}
public void setRam(String ram) {
	Ram = ram;
}
@Override
public String toString() {
	return "laptop [Cpu=" + Cpu + ", Hdd=" + Hdd + ", Ram=" + Ram + ", getCpu()=" + getCpu() + ", getHdd()=" + getHdd()
			+ ", getRam()=" + getRam() + "]";
}
 
 
	

}
