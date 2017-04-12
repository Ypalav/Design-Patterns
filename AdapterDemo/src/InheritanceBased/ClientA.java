package InheritanceBased;

public class ClientA {
	S1 s1;
	public void Sorting(){
		s1=new SelectionSort();
		s1.Sorting();
		s1=new InsertionSort();
		s1.Sorting();
		s1=new AdapterBubbleSort();
		s1.Sorting();
		s1=new AdapterQuickSort();
		s1.Sorting();
	}

}
