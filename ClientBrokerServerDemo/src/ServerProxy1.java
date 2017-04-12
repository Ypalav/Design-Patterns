public class ServerProxy1 {
	Server1 server1;

	public void callService(Request request) {
		server1 = new Server1();
		if ((request.getSpecification()).equals("float add(float, int)")) {
			request.requestFloatAdd.resultVal = server1.add(
					request.requestFloatAdd.getA(),
					request.requestFloatAdd.getB());
		} else if ((request.getSpecification())
				.equals("int add(int, int, int)")) {
			request.requestIntAdd.result = server1.add(
					request.requestIntAdd.getVar1(),
					request.requestIntAdd.getVar2(),
					request.requestIntAdd.getVar3());
		} else if ((request.getSpecification())
				.equals("void QuickSort(String [], int, int [])")) {
			server1.QuickSort(request.stringQuickSort.getStringList(),
					request.stringQuickSort.getVar4(),
					request.stringQuickSort.getIntegerList());
		} else if ((request.getSpecification())
				.equals("void bubbleSort(int [], int, int [])")) {
			server1.bubbleSort(request.requestIntBubbleSort.getIntegerList(),
					request.requestIntBubbleSort.getVar4(),
					request.requestIntBubbleSort.integerListToStore);
		} else if ((request.getSpecification())
				.equals("int multiply(int, int)")) {
			request.requestIntMultiply.result = server1.multiply(
					request.requestIntMultiply.multiply1,
					request.requestIntMultiply.multiply2);
		}
	}
}
