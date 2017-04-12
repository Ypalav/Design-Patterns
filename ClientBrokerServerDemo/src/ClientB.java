
public class ClientB {
ClientProxyB clientProxyB;
	
	public void operation(){
		int multiply;
		int add;
		clientProxyB = new ClientProxyB();
		int[] intInputArr = {4,5,6};
		int[] intArr = new int[intInputArr.length];
		multiply=clientProxyB.multiply(5, 20);
		add=clientProxyB.add(52, 42, 41);
		clientProxyB.bubbleSort(intInputArr, intInputArr.length, intArr);
		System.out.println("Multiplying 5, 20 "+ multiply);
		System.out.println("Adding 52, 42, 41 "+ add);
	}
}
