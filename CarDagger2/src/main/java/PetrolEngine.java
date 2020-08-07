import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine{
	private int horsePower;
	private int engineCapacity;
	
	@Inject
	public PetrolEngine(@Named("horsePower") int horsePower,
						@Named("engineCapacity") int engineCapacity	) {
		this.horsePower = horsePower;
		this.engineCapacity = engineCapacity;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting Petrol Engine" + 
				   "\n HorsePower: " + horsePower +
	               "\n EngineCapacity: " + engineCapacity);		
	}
}
