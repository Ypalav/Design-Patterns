public class Client1 {
	Clock clock;
	public void getTimeDate() {
		clock = new Clock(new ConcreteClient1());
		clock.getTime();
		clock.getDate();
	}
}
