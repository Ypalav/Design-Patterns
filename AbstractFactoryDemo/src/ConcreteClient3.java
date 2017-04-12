
public class ConcreteClient3 extends AbstractClockFactory{
	YMDDate ymdDate;
	Time24 time24;
	void GetTime() {
		time24 = new Time24();
		time24.getTime();
		
	}

	void GetDate() {
		ymdDate = new YMDDate();
		ymdDate.GetDate();
	}

}
