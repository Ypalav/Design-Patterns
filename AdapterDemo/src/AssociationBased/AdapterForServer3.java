package AssociationBased;

public class AdapterForServer3 extends S3{
	S2 s2;

	void Sort() {
		s2 = new HeapSort();
		s2.ESort();
		s2 = new MergeSort();
		s2.ESort();
	}

}
