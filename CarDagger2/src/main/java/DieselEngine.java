import javax.inject.Inject;
import javax.inject.Named;

public class DieselEngine implements Engine{

	private int horsePower;
	private int engineCapacity;
	private String brand;
	
	@Inject
	public DieselEngine(@Named("horsePower") int horsePower,
						@Named("engineCapacity") int engineCapacity,
						@Named("brand") String brand) {
		this.horsePower = horsePower;
		this.engineCapacity = engineCapacity;
		this.brand = brand;		
	}

	@Override
	public void startEngine() {
		System.out.println("Starting Diesel Engine" + 
				   "\n HorsePower: " + horsePower +
	               "\n EngineCapacity: " + engineCapacity +
	               "\n Brand: " + brand);		
	}
	

}
