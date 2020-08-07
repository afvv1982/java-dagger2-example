import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

public class ApplicationDriver {
	@Singleton
	//@Component(modules = {WheelsModule.class, DieselEngineModule.class})
	@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
	public interface CarComponent{
		Car start();
		
		@Component.Builder
		interface Builder {
			@BindsInstance
			Builder HorsePower(@Named("horsePower") int horsePower);
			
			@BindsInstance
			Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
			
			/*@BindsInstance
			Builder brand(@Named("brand") String brand);*/
			
			CarComponent build();
		}
	}

	public static void main(String[] args) {
		CarComponent carComponent = DaggerApplicationDriver_CarComponent.builder()
				.HorsePower(400)
				.engineCapacity(16)
				/*.brand("Ford")*/
				.build();
		carComponent.start().drive();	
				
	}

}
