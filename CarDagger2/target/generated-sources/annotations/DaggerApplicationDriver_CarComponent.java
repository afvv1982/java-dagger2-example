import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApplicationDriver_CarComponent implements ApplicationDriver.CarComponent {
  private final Integer HorsePower;

  private final Integer engineCapacity;

  private DaggerApplicationDriver_CarComponent(Integer HorsePowerParam,
      Integer engineCapacityParam) {
    this.HorsePower = HorsePowerParam;
    this.engineCapacity = engineCapacityParam;
  }

  public static ApplicationDriver.CarComponent.Builder builder() {
    return new Builder();
  }

  private PetrolEngine getPetrolEngine() {
    return new PetrolEngine(HorsePower, engineCapacity);}

  private Wheels getWheels() {
    return WheelsModule_ProvideWheelsFactory.provideWheels(WheelsModule_ProvideRimsFactory.provideRims(), WheelsModule_ProvideTiresFactory.provideTires());}

  @Override
  public Car start() {
    return injectCar(Car_Factory.newInstance());}

  @CanIgnoreReturnValue
  private Car injectCar(Car instance) {
    Car_MembersInjector.injectEngine(instance, getPetrolEngine());
    Car_MembersInjector.injectWheels(instance, getWheels());
    Car_MembersInjector.injectOpenButton(instance, new RemoteControl());
    return instance;
  }

  private static final class Builder implements ApplicationDriver.CarComponent.Builder {
    private Integer HorsePower;

    private Integer engineCapacity;

    @Override
    public Builder HorsePower(int horsePower) {
      this.HorsePower = Preconditions.checkNotNull(horsePower);
      return this;
    }

    @Override
    public Builder engineCapacity(int engineCapacity) {
      this.engineCapacity = Preconditions.checkNotNull(engineCapacity);
      return this;
    }

    @Override
    public ApplicationDriver.CarComponent build() {
      Preconditions.checkBuilderRequirement(HorsePower, Integer.class);
      Preconditions.checkBuilderRequirement(engineCapacity, Integer.class);
      return new DaggerApplicationDriver_CarComponent(HorsePower, engineCapacity);
    }
  }
}
