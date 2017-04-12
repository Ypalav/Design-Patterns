package AssociationBased;

public class AdapterForServer2 extends S2 {
	S3 s3;

	void ESort() {
		s3 = new QuickSort();
		s3.Sort();
		s3 = new BubbleSort();
		s3.Sort();
		
	}


}
