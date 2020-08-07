import dagger.internal.Factory;
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
public final class WheelsModule_ProvideTiresFactory implements Factory<Tires> {
  private static final WheelsModule_ProvideTiresFactory INSTANCE = new WheelsModule_ProvideTiresFactory();

  @Override
  public Tires get() {
    return provideTires();
  }

  public static WheelsModule_ProvideTiresFactory create() {
    return INSTANCE;
  }

  public static Tires provideTires() {
    return Preconditions.checkNotNull(WheelsModule.provideTires(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
