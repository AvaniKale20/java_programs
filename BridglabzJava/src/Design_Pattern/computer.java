package Design_Pattern;

public abstract class computer {
	public abstract String RAM();
	public abstract String HDD();
	public abstract String cpu();
	@Override
	public String toString() {
		return "computer [RAM()=" + RAM() + ", HDD()=" + HDD() + ", cpu()=" + cpu() + "]";
	}

}
