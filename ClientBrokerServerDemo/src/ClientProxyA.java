public class ClientProxyA {
	Broker broker;
	Request request;

	public float add(float x, int y) {
		request = new Request();
		broker = new Broker();
		request.setSpecification("float add(float, int)");
		request.setRequestFloatAdd();
		request.requestFloatAdd.setA(x);
		request.requestFloatAdd.setB(y);
		broker.forwardService(request);
		return request.requestFloatAdd.resultVal;
	}

	public int add(int x, int y, int z) {
		request = new Request();
		broker = new Broker();
		request.setSpecification("int add(int, int, int)");
		request.setRequestIntAdd();
		request.requestIntAdd.setVar1(x);
		request.requestIntAdd.setVar2(y);
		request.requestIntAdd.setVar3(z);
		broker.forwardService(request);
		return request.requestIntAdd.result;
	}

	public void QuickSort(String L[], int N, int SL[]) {
		request = new Request();
		broker = new Broker();
		request.setStringQuickSort();
		request.setSpecification("void QuickSort(String [], int, int [])");
		request.stringQuickSort.setStringList(L);
		request.stringQuickSort.setIntegerList(SL);
		request.stringQuickSort.setVar4(N);
		broker.forwardService(request);
	}
}
