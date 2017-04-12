public class Client3 {
	Clock clock;

	public void getTimeDate() {
		clock = new Clock(new ConcreteClient3());
		clock.getTime();
		clock.getDate();
	}
}
