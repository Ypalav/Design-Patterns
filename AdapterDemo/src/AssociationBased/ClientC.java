package AssociationBased;

public class ClientC {
	S3 s3;
	public void Sort(){
		s3 = new QuickSort();
		s3.Sort();
		s3 = new BubbleSort();
		s3.Sort();
		s3 = new AdapterForServer3();
		s3.Sort();
	}
}
