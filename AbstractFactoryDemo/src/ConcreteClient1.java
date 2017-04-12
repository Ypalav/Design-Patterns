public class ConcreteClient1 extends AbstractClockFactory {
	DMYDate dmyDate;
	Time24 time24;

	void GetTime() {
		time24 = new Time24();
		time24.getTime();
	}

	void GetDate() {
		dmyDate = new DMYDate();
		dmyDate.GetDate();
	}

}
