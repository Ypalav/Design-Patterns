public class Request {
	public String specification;

	RequestFloatAdd requestFloatAdd;
	RequestIntAdd requestIntAdd;
	RequestIntBubbleSort requestIntBubbleSort;
	RequestIntMultiply requestIntMultiply;
	RequestStringQuickSort stringQuickSort;
	RequestFloatMultiply requestFloatMultiply;
	RequestIntSubtract requestIntSubtract;
	
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getSpecification() {
		return specification;
	}

	public void setRequestFloatAdd() {
		this.requestFloatAdd = new RequestFloatAdd();
	}

	public void setRequestIntAdd() {
		this.requestIntAdd = new RequestIntAdd();
	}

	public void setRequestIntBubbleSort() {
		this.requestIntBubbleSort = new RequestIntBubbleSort();
	}

	public void setRequestIntMultiply() {
		this.requestIntMultiply = new RequestIntMultiply();
	}

	public void setStringQuickSort() {
		this.stringQuickSort = new RequestStringQuickSort();
	}

	public void setRequestFloatMultiply() {
		this.requestFloatMultiply = new RequestFloatMultiply();
	}

	public void setRequestIntSubtract() {
		this.requestIntSubtract = new RequestIntSubtract();
	}

}
