import javax.inject.Inject;

public class Car {
	@Inject Engine engine;
	@Inject Wheels wheels;
	
	@Inject
	public Car() {}
	
	@Inject
	public void OpenButton(RemoteControl remote) {
		remote.OpenButton(this);
	}
	
	public void drive() {
		engine.startEngine();
		System.out.println("Driving...");
	}
}
