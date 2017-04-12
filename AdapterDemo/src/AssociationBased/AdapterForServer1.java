package AssociationBased;

public class AdapterForServer1 extends S1{
	S3 s3;
	void Sorting() {
		s3 = new QuickSort();
		s3.Sort();
		s3 = new BubbleSort();
		s3.Sort();
	}

}
