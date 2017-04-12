public class Broker {
	ServerProxy1 proxy1;
	ServerProxy2 proxy2;

	public void register() {
		
	}

	public void unRegister() {

	}

	public void findServer(String specification) {
		if (specification.equals("float add(float, int)")
				|| specification.equals("int add(int, int, int)")
				|| specification
						.equals("void QuickSort(String [], int, int [])")
				|| specification.equals("int multiply(int, int)")
				|| specification
						.equals("void bubbleSort(int [], int, int [])")) {
			proxy1 = new ServerProxy1();
		} else if(specification.equals("float add(float, int)")
				|| specification.equals("int subtract(int, int)")
				|| specification
						.equals("float multiply(float, int) ")
				|| specification.equals("int multiply(int, int)")
				|| specification
						.equals("void bubbleSort(int [], int, int [])")) {
			proxy2 = new ServerProxy2();
		} else{
			proxy1=null;
			proxy2=null;
			System.out.println("No server registered with this service");
		}
	}

	public void forwardService(Request request) {
		findServer(request.getSpecification());
		if (proxy1 != null) {
			proxy1.callService(request);
		} else if (proxy2 != null) {
			proxy2.callService(request);
		} else {
			System.out.println("No service found");
		}

	}
}
