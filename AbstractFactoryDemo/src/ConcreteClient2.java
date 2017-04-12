
public class ConcreteClient2 extends AbstractClockFactory{
	MDYDate mdyDate;
	Time12 time12;
	
	void GetTime(){
		time12 = new Time12();
		time12.getTime();
		
	}

	void GetDate() {
		mdyDate = new MDYDate();
		mdyDate.GetDate();
	}

}
