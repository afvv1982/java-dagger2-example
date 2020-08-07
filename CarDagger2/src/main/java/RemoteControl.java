import javax.inject.Inject;

public class RemoteControl {

	@Inject
	public RemoteControl() {}
	
	public void OpenButton(Car car) {
		System.out.println("Car opened");
	}
}
