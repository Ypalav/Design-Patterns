public class Application {
	public static void main(String args[]) {
		ClientA clientA = new ClientA();
		clientA.operation();
		System.out.println(" ");
		ClientB clientB = new ClientB();
		clientB.operation();
	}
}
