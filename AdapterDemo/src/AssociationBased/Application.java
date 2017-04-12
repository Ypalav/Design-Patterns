package AssociationBased;

public class Application {
	public static void main(String[] args) {
		System.out.println("Client A's services");
		ClientA clientA = new ClientA();
		clientA.Sorting();
		System.out.println("");
		System.out.println("Client B's services");
		ClientB clientB = new ClientB();
		clientB.ESort();
		System.out.println("");
		System.out.println("Client C's services");
		ClientC clientC = new ClientC();
		clientC.Sort();
		
	}
}
