import dagger.MembersInjector;
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
public final class Car_MembersInjector implements MembersInjector<Car> {
  private final Provider<Engine> engineProvider;

  private final Provider<Wheels> wheelsProvider;

  private final Provider<RemoteControl> remoteProvider;

  public Car_MembersInjector(Provider<Engine> engineProvider, Provider<Wheels> wheelsProvider,
      Provider<RemoteControl> remoteProvider) {
    this.engineProvider = engineProvider;
    this.wheelsProvider = wheelsProvider;
    this.remoteProvider = remoteProvider;
  }

  public static MembersInjector<Car> create(Provider<Engine> engineProvider,
      Provider<Wheels> wheelsProvider, Provider<RemoteControl> remoteProvider) {
    return new Car_MembersInjector(engineProvider, wheelsProvider, remoteProvider);}

  @Override
  public void injectMembers(Car instance) {
    injectEngine(instance, engineProvider.get());
    injectWheels(instance, wheelsProvider.get());
    injectOpenButton(instance, remoteProvider.get());
  }

  public static void injectEngine(Car instance, Engine engine) {
    instance.engine = engine;
  }

  public static void injectWheels(Car instance, Wheels wheels) {
    instance.wheels = wheels;
  }

  public static void injectOpenButton(Car instance, RemoteControl remote) {
    instance.OpenButton(remote);
  }
}
