import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Car_Factory implements Factory<Car> {
  private final Provider<Engine> engineProvider;

  private final Provider<Wheels> wheelsProvider;

  private final Provider<RemoteControl> remoteProvider;

  public Car_Factory(Provider<Engine> engineProvider, Provider<Wheels> wheelsProvider,
      Provider<RemoteControl> remoteProvider) {
    this.engineProvider = engineProvider;
    this.wheelsProvider = wheelsProvider;
    this.remoteProvider = remoteProvider;
  }

  @Override
  public Car get() {
    Car instance = new Car();
    Car_MembersInjector.injectEngine(instance, engineProvider.get());
    Car_MembersInjector.injectWheels(instance, wheelsProvider.get());
    Car_MembersInjector.injectOpenButton(instance, remoteProvider.get());
    return instance;
  }

  public static Car_Factory create(Provider<Engine> engineProvider, Provider<Wheels> wheelsProvider,
      Provider<RemoteControl> remoteProvider) {
    return new Car_Factory(engineProvider, wheelsProvider, remoteProvider);
  }

  public static Car newInstance() {
    return new Car();
  }
}
