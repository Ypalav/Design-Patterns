
public class ClientA {
	ClientProxyA clientProxyA;
	
	public void operation(){
		float a;
		int x;
		clientProxyA = new ClientProxyA();
		String[] stringArr = {"C", "P", "B"};
		int[] intArr = new int[stringArr.length];
		a = clientProxyA.add(2.5f, 5);
		x = clientProxyA.add(5, 8, 10);
		clientProxyA.QuickSort(stringArr, stringArr.length , intArr);
		System.out.println("Adding 2.5, 5 "+ a);
		System.out.println("Adding 5, 8, 10 "+ x);
	}
}
