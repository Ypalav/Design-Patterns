package AssociationBased;

public class ClientB {

	S2 s2;
	public void ESort(){
		s2 = new HeapSort();
		s2.ESort();
		s2 = new MergeSort();
		s2.ESort();
		s2 = new AdapterForServer2();
		s2.ESort();
	}

}
