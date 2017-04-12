
public class Clock {
	AbstractClockFactory abstractClockFactory;

	public Clock(AbstractClockFactory abstractClockFactory) {
		this.abstractClockFactory = abstractClockFactory;
	}

	public void getTime() {
		abstractClockFactory.GetTime();
	}

	public void getDate() {
		
		abstractClockFactory.GetDate();
	}
}
