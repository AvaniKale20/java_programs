package Design_Pattern;

public class TestFactory {
	public static void main(String[] args) {
		computer pc = computer_factory.getcomputer("pc","2 GB","500 GB","2.4 GHz");
		computer server = computer_factory.getcomputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}

}
