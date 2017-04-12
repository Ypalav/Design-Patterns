public class ClientProxyB {
	Broker broker;
	Request request;

	public int multiply(int x, int y) {
		request = new Request();
		broker = new Broker();
		request.setRequestIntMultiply();
		request.requestIntMultiply.setMultiply1(x);
		request.requestIntMultiply.setMultiply2(y);
		request.setSpecification("int multiply(int, int)");
		broker.forwardService(request);
		return request.requestIntMultiply.result;
	}

	public int add(int x, int y, int z) {
		request = new Request();
		broker = new Broker();
		request.setRequestIntAdd();
		request.setSpecification("int add(int, int, int)");
		request.requestIntAdd.setVar1(x);
		request.requestIntAdd.setVar2(y);
		request.requestIntAdd.setVar3(z);
		broker.forwardService(request);
		return request.requestIntAdd.result;
	}

	public void bubbleSort(int L[], int N, int SL[]) {
		request = new Request();
		broker = new Broker();
		request.setRequestIntBubbleSort();
		request.setSpecification("void bubbleSort(int [], int, int [])");
		request.requestIntBubbleSort.setVar4(N);
		request.requestIntBubbleSort.setIntegerList(L);
		request.requestIntBubbleSort.setIntegerListToStore(SL);
		broker.forwardService(request);
	}
}
