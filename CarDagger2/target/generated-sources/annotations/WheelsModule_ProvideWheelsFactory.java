import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class WheelsModule_ProvideWheelsFactory implements Factory<Wheels> {
  private final Provider<Rims> rimsProvider;

  private final Provider<Tires> tiresProvider;

  public WheelsModule_ProvideWheelsFactory(Provider<Rims> rimsProvider,
      Provider<Tires> tiresProvider) {
    this.rimsProvider = rimsProvider;
    this.tiresProvider = tiresProvider;
  }

  @Override
  public Wheels get() {
    return provideWheels(rimsProvider.get(), tiresProvider.get());
  }

  public static WheelsModule_ProvideWheelsFactory create(Provider<Rims> rimsProvider,
      Provider<Tires> tiresProvider) {
    return new WheelsModule_ProvideWheelsFactory(rimsProvider, tiresProvider);
  }

  public static Wheels provideWheels(Rims rims, Tires tires) {
    return Preconditions.checkNotNull(WheelsModule.provideWheels(rims, tires), "Cannot return null from a non-@Nullable @Provides method");
  }
}
