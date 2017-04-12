public class Client2 {
	Clock clock;

	public void getTimeDate() {
		clock = new Clock(new ConcreteClient2());
		clock.getTime();
		clock.getDate();
	}
}
