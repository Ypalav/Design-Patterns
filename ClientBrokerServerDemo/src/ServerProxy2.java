public class ServerProxy2 {
	Server2 server2;

	public void callService(Request request) {
		server2 = new Server2();
		if ((request.getSpecification()).equals("int multiply(int, int)")) {
			request.requestIntMultiply.result = server2.multiply(
					request.requestIntMultiply.getMultiply1(),
					request.requestIntMultiply.getMultiply2());
		} else if ((request.getSpecification())
				.equals("void bubbleSort(int [], int, int [])")) {
			server2.bubbleSort(request.requestIntBubbleSort.getIntegerList(),
					request.requestIntBubbleSort.getVar4(),
					request.requestIntBubbleSort.getIntegerListToStore());
		} else if ((request.getSpecification())
				.equals("int subtract(int, int)")) {
			request.requestIntSubtract.result = server2.subtract(
					request.requestIntSubtract.getSubIntVar1(),
					request.requestIntSubtract.getSubIntVar2());
		} else if ((request.getSpecification())
				.equals("float multiply(float, int)")) {
			request.requestFloatMultiply.resultVal = server2.multiply(
					request.requestFloatMultiply.multiplyFloatVar,
					request.requestFloatMultiply.multiplyIntVar);
		} else if ((request.getSpecification()).equals("float add(float, int)")) {
			request.requestFloatAdd.resultVal = server2.add(
					request.requestFloatAdd.a, request.requestFloatAdd.b);
		}
	}
}
