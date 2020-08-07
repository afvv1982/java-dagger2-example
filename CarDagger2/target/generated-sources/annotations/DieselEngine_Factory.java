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
public final class DieselEngine_Factory implements Factory<DieselEngine> {
  private final Provider<Integer> horsePowerProvider;

  private final Provider<Integer> engineCapacityProvider;

  private final Provider<String> brandProvider;

  public DieselEngine_Factory(Provider<Integer> horsePowerProvider,
      Provider<Integer> engineCapacityProvider, Provider<String> brandProvider) {
    this.horsePowerProvider = horsePowerProvider;
    this.engineCapacityProvider = engineCapacityProvider;
    this.brandProvider = brandProvider;
  }

  @Override
  public DieselEngine get() {
    return new DieselEngine(horsePowerProvider.get(), engineCapacityProvider.get(), brandProvider.get());
  }

  public static DieselEngine_Factory create(Provider<Integer> horsePowerProvider,
      Provider<Integer> engineCapacityProvider, Provider<String> brandProvider) {
    return new DieselEngine_Factory(horsePowerProvider, engineCapacityProvider, brandProvider);
  }

  public static DieselEngine newInstance(int horsePower, int engineCapacity, String brand) {
    return new DieselEngine(horsePower, engineCapacity, brand);
  }
}
