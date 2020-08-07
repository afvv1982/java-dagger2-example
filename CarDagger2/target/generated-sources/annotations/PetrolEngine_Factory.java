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
public final class PetrolEngine_Factory implements Factory<PetrolEngine> {
  private final Provider<Integer> horsePowerProvider;

  private final Provider<Integer> engineCapacityProvider;

  public PetrolEngine_Factory(Provider<Integer> horsePowerProvider,
      Provider<Integer> engineCapacityProvider) {
    this.horsePowerProvider = horsePowerProvider;
    this.engineCapacityProvider = engineCapacityProvider;
  }

  @Override
  public PetrolEngine get() {
    return new PetrolEngine(horsePowerProvider.get(), engineCapacityProvider.get());
  }

  public static PetrolEngine_Factory create(Provider<Integer> horsePowerProvider,
      Provider<Integer> engineCapacityProvider) {
    return new PetrolEngine_Factory(horsePowerProvider, engineCapacityProvider);
  }

  public static PetrolEngine newInstance(int horsePower, int engineCapacity) {
    return new PetrolEngine(horsePower, engineCapacity);
  }
}
