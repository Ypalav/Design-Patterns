public class Application {

	public static void main(String[] args) {

		System.out.println("Display For Client1");
		Client1 client1 = new Client1();
		client1.getTimeDate();
		System.out.println("");
		System.out.println("Display For Client2");
		Client2 client2 = new Client2();
		client2.getTimeDate();
		System.out.println("");
		System.out.println("Display For Client3");
		Client3 client3 = new Client3();
		client3.getTimeDate();
	}

}
